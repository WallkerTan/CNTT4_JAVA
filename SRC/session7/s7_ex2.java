package SRC.session7;

public class s7_ex2 {

    static class Student {
        String name;

        Student(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        // ===== PRIMITIVE TYPE =====
        int a = 10;
        int b = a; // sao chep GIA TRI

        b = 20;

        System.out.println("Primitive:");
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 20

        System.out.println("------------------");

        // ===== REFERENCE TYPE =====
        Student s1 = new Student("Tan");
        Student s2 = s1; // sao chep DIA CHI

        s2.name = "An";

        System.out.println("Reference:");
        System.out.println("s1.name = " + s1.name); // An
        System.out.println("s2.name = " + s2.name); // An
    }
}
