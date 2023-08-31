import java.util.PriorityQueue;
import java.util.HashMap;

class HuffmanNode implements Comparable<HuffmanNode> {
    char data;
    int frequency;
    HuffmanNode left, right;

    public HuffmanNode(char data, int frequency) {
        this.data = data;
        this.frequency = frequency;
    }

    @Override
    public int compareTo(HuffmanNode other) {
        return this.frequency - other.frequency;
    }
}

public class HuffmanCoding {
    public static void main(String[] args) {
        // Given frequency table
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        frequencyMap.put('a', 5);
        frequencyMap.put('b', 9);
        frequencyMap.put('c', 12);
        frequencyMap.put('d', 13);
        frequencyMap.put('e', 16);
        frequencyMap.put('f', 45);

        PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<>();

        // Create a leaf node for each character and add it to the priority queue
        for (char c : frequencyMap.keySet()) {
            priorityQueue.add(new HuffmanNode(c, frequencyMap.get(c)));
        }

        // Build Huffman tree
        while (priorityQueue.size() > 1) {
            HuffmanNode left = priorityQueue.poll();
            HuffmanNode right = priorityQueue.poll();

            HuffmanNode newNode = new HuffmanNode('\0', left.frequency + right.frequency);
            newNode.left = left;
            newNode.right = right;

            priorityQueue.add(newNode);
        }

        HuffmanNode root = priorityQueue.poll();
        HashMap<Character, String> huffmanCodes = new HashMap<>();
        buildHuffmanCodes(root, "", huffmanCodes);

        System.out.println("Huffman Codes:");
        for (char c : huffmanCodes.keySet()) {
            System.out.println(c + ": " + huffmanCodes.get(c));
        }
    }

    public static void buildHuffmanCodes(HuffmanNode node, String code, HashMap<Character, String> huffmanCodes) {
        if (node == null) {
            return;
        }

        if (node.data != '\0') {
            huffmanCodes.put(node.data, code);
        }

        buildHuffmanCodes(node.left, code + "0", huffmanCodes);
        buildHuffmanCodes(node.right, code + "1", huffmanCodes);
    }
}
