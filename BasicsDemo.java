import java.math.BigDecimal;

class BasicsDemo {
    // Adapted from
    // http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html

    static void print() {
        System.out.println("\n\nInside print ...");
        System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
        System.out.println(); // Print empty line
        System.out.print("Hello, world!!"); // Cursor stayed after the printed string
        System.out.println("Hello,");
        System.out.print(" "); // Print a space
        System.out.print("world!!");
    }

    static void primitives() {
        System.out.println("Inside primitives");
        int intHex = 0x0041;
        System.out.println("int hex: " + intHex);

        int intBinary = 0b01000001;
        System.out.println("int binary: " + intBinary);

        BigDecimal first = new BigDecimal("0.1");
        BigDecimal second = new BigDecimal("0.2");
        System.out.println(first.add(second));

        char charInt = 65;
        char charHex = 0x0041;
        char charBinary = 0b01000001;
        System.out.println("char int: " + charInt);
        System.out.println("char hex: " + charHex);
        System.out.println("char binary: " + charBinary);
    }

    static void typeCasting() {
        // Explicit Casting
        long y = 42;
        // int x = y;
        int x = (int) y;

        // Info loss due to out of range assignment
        byte narrowdByte = (byte) 123456;
        System.out.println("narrowdByte: " + narrowdByte);

        // Truncation
        int iTruncated = (int) 0.99;
        System.out.println("iTruncated: " + iTruncated);

        // Implicit cast (int to long)
        y = x;

        // Implicit cast (char to int)
        char cChar = 'A';
        int iInt = cChar;
        System.out.println("iInt: " + iInt);

        // byte to cahr using an explicit cast
        byte bByte = 65;
        cChar = (char) bByte;
        System.out.println("cChar: " + cChar);
    }

    static int count = 25;

    static void arrays() {
        System.out.println("\nInside arrays ...");
        /*
         * int[] scores = new int[4]; scores[0] = 90; scores[1] = 70; scores[2] = 80;
         * scores[3] = 100; System.out.println("Mid-Term 1: " + scores[0]);
         * System.out.println("Mid-Term 2: " + scores[1]); System.out.println("Final: "
         * + scores[2]); System.out.println("Project: " + scores[3]);
         */
        // int[] scores = new int[] {90, 70, 80, 100};

        int[] scores = { 90, 70, 80, 100 };
        System.out.println("Mid-Term 1: " + scores[0]);
        System.out.println("Mid-Term 2: " + scores[1]);
        System.out.println("Final: " + scores[2]);
        System.out.println("Project: " + scores[3]);
        System.out.println("# exams: " + scores.length);

        // Student[] students = new Student[3];
        // students[0] = new Student();
        // students[1] = new Student();
        // students[2] = new Student();
        Student[] students = { new Student(), new Student(), new Student() };
        students[0].name = "John";
        students[1].name = "Raj";
        students[2].name = "Anita";

        System.out.println("Student 1: " + students[0].name);
        System.out.println("Student 2: " + students[1].name);
        System.out.println("Student 3: " + students[2].name);
    }

    static double sum(double x, double y) {
        return x + y;
    }

    static double avg(double x, double y) {
        double sum = sum(x, y);
        return sum / 2;
    }

    static boolean search(int[] list, int key) {
        return true;
    }

    public static void main(String[] args) {

        // Language Basics 1
        // print();
        // primitives();
        // typeCasting();
        // arrays();

        double d = sum(3.0f, (float) 2.0);
        System.out.println(d);

        double d2 = avg(3.0, 2.0);
        System.out.println(d2);
    }

    int[] list = {1, 2};

    search(list, 2);
}