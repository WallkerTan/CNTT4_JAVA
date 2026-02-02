package SRC.session7;

public class s7_ex4 {

    static class ClassRoom {

        // ===== BIEN STATIC: QUY CHUNG CUA LOP =====
        private static double classFund = 0;

        // ===== BIEN INSTANCE: MOI SINH VIEN CO RIENG =====
        private String studentName;

        // ===== Constructor =====
        public ClassRoom(String studentName) {
            this.studentName = studentName;
        }

        // ===== Dong tien vao quy =====
        public void donate(double amount) {
            if (amount > 0) {
                classFund += amount;
                System.out.println(studentName + " dong " + amount + " vao quy");
            } else {
                System.out.println("So tien khong hop le");
            }
        }

        // ===== Xem tong quy (STATIC METHOD) =====
        public static void showClassFund() {
            System.out.println("Tong quy lop: " + classFund);
        }
    }

    public static void main(String[] args) {

        ClassRoom s1 = new ClassRoom("Tan");
        ClassRoom s2 = new ClassRoom("An");
        ClassRoom s3 = new ClassRoom("Binh");

        s1.donate(100);
        s2.donate(200);
        s3.donate(150);

        System.out.println();

        // Goi qua ten lop
        ClassRoom.showClassFund();
    }
}
