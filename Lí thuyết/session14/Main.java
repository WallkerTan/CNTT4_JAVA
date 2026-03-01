package session14;

import java.util.*;

class Student implements Comparable<Student> {

    int id;
    String name;
    double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // Comparable: sắp xếp mặc định theo id tăng dần
    @Override
    public int compareTo(Student other) {
        return this.id - other.id;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + gpa;
    }
}

public class Main {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(3, "An", 8.5));
        list.add(new Student(1, "Binh", 9.2));
        list.add(new Student(2, "Cuong", 7.8));

        // =============================
        // 1️⃣ Sort theo Comparable (id)
        // =============================
        Collections.sort(list);
        System.out.println("Sort theo ID (Comparable):");
        print(list);

        // =============================
        // 2️⃣ Sort theo name (Comparator)
        // =============================
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        System.out.println("\nSort theo Name:");
        print(list);

        // =============================
        // 3️⃣ Sort theo GPA tăng
        // =============================
        Collections.sort(list, (s1, s2) -> Double.compare(s1.gpa, s2.gpa));

        System.out.println("\nSort theo GPA tăng:");
        print(list);

        // =============================
        // 4️⃣ Sort theo GPA giảm
        // =============================
        Collections.sort(list, (s1, s2) -> Double.compare(s2.gpa, s1.gpa));

        System.out.println("\nSort theo GPA giảm:");
        print(list);
    }

    static void print(List<Student> list) {
        for (Student s : list) {
            System.out.println(s);
        }
    }
}