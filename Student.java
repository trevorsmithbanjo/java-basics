public class Student {
    static int computeCount;

    int id;
    String name;
    String gender;
    int age;
    short rank;
    long phone;

    int minValue = Integer.MIN_VALUE;
    int maxValue = Integer.MAX_VALUE;

    double gpa;

    char degree;

    boolean international;
    double tuitionFees = 12000.0, internationalFees = 5000.0;

    void compute() {
        // id = 1000;
        // int newId = id + 1;

        computeCount += 1;

        if (international) {
            tuitionFees = tuitionFees + internationalFees;
        }

        System.out.println("\nid: " + id);
        // System.out.println("newId: " + newId);
        System.out.println("name: " + name);
        System.out.println("gender: " + gender);
        System.out.println("age: " + age);
        System.out.println("rank: " + rank);
        System.out.println("phone: " + phone);
        // System.out.println("min value: " + minValue);
        // System.out.println("max value: " + maxValue);
        System.out.println("gpa: " + gpa);
        System.out.println("degree: " + degree);
        System.out.println("tuitonFees: " + tuitionFees);
        System.out.println("computeCount: " + computeCount);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.id = 1000;
        student1.name = "John";
        student1.gender = "male";
        student1.age = 18;
        student1.phone = 223_456_7890L;
        student1.international = false;
        student1.degree = 'B';
        student1.gpa = 3.8;
        student1.compute();

        Student student2 = new Student();
        student2.id = 1001;
        student2.name = "Raj";
        student2.gender = "male";
        student2.age = 21;
        student2.phone = 223_456_9999L;
        student2.international = true;
        student2.degree = 'M';
        student2.gpa = 3.4;
        student2.compute();

        Student student3 = new Student();
        student3.id = 1002;
        student3.name = "Anita";
        student3.gender = "female";
        student3.age = 20;
        student3.phone = 223_456_8888L;
        student3.international = true;
        student2.degree = 'M';
        student3.gpa = 3.8;
        student3.compute();
    }
}
