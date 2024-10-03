package JAVA_Programs.Recursion;

public class Ac_05_String_duplicates {
    public static void remove_dupli(String str, int idx, StringBuilder newSTR, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newSTR);
            return; // Add return here to exit after printing
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            remove_dupli(str, idx + 1, newSTR, map);
        } else {
            map[currChar - 'a'] = true;
            newSTR.append(currChar);
            remove_dupli(str, idx + 1, newSTR, map);
            newSTR.deleteCharAt(newSTR.length() - 1); // Revert the append for backtracking
        }
    }

    public static void main(String[] args) {
        String str = "apnacollege";
        remove_dupli(str, 0, new StringBuilder(), new boolean[26]);
    }
}
