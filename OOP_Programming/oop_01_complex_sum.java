package JAVA_Programs.OOP_Programming;

public class oop_01_complex_sum {
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 20);
        c1.print();
        Complex c2 = new Complex(20, 30);
        c2.print();
        c1.add(c2);
        c1.print();
    }

    static class Complex {
        int real;
        int imag;

        void print() {
            System.out.println(real + "+i" + imag);
        }

        Complex(int r, int i) {
            real = r;
            imag = i;
        }

        void add(Complex C) {
            real = real + C.real;
            imag = imag + C.imag;
        }
    }
}
