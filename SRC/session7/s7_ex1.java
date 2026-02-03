// package SRC.session7;

// public class s7_ex1 {

//     static class Student {
//         // ===== Bien instance (MOI SV CO RIENG) =====
//         private String id;
//         private String name;

//         // ===== Bien static (DUNG CHUNG) =====
//         private static int totalStudent = 0;

//         // ===== Constructor =====
//         public Student(String id, String name) {
//             this.id = id;
//             this.name = name;
//             totalStudent++; // moi lan tao SV -> tang tong
//         }

//         // ===== Hien thi thong tin SV =====
//         public void showInfo() {
//             System.out.println("Ma SV: " + id);
//             System.out.println("Ten SV: " + name);
//         }

//         // ===== Hien thi tong so SV =====
//         public static void showTotalStudent() {
//             System.out.println("Tong so sinh vien: " + totalStudent);
//         }
//     }

//     public static void main(String[] args) {

//         Student s1 = new Student("SV01", "Tan");
//         Student s2 = new Student("SV02", "An");
//         Student s3 = new Student("SV03", "Binh");

//         s1.showInfo();
//         System.out.println();

//         s2.showInfo();
//         System.out.println();

//         s3.showInfo();
//         System.out.println();

//         // Bien static goi qua class
//         Student.showTotalStudent();
//     }
// }
