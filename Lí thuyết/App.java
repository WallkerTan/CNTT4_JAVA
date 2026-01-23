import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // =====================
        // 1. KHAI BÁO KIỂU DỮ LIỆU
        // =====================

        // Số nguyên
        byte b = 10;
        short s = 200;
        int i = 1000;
        long l = 1000000000L;

        // Số thực
        float f = 3.14f;
        double d = 9.87654321;

        // Ký tự & logic
        char c = 'A';
        boolean isJavaFun = true;

        // Chuỗi
        String name = "Java";

        System.out.println("=== KIEU DU LIEU ===");
        System.out.println(b + " " + s + " " + i + " " + l);
        System.out.println(f + " " + d);
        System.out.println(c);
        System.out.println(isJavaFun);
        System.out.println(name);

        // =====================
        // 2. TOÁN TỬ
        // =====================

        int a = 10;
        int x = 3;

        System.out.println("\n=== TOAN TU ===");

        // Toán tử số học
        System.out.println("Cong: " + (a + x));
        System.out.println("Tru: " + (a - x));
        System.out.println("Nhan: " + (a * x));
        System.out.println("Chia: " + (a / x));
        System.out.println("Du: " + (a % x));

        // Toán tử gán
        a += 5; // a = a + 5
        System.out.println("Gan += : " + a);

        // Toán tử so sánh
        System.out.println("a > x: " + (a > x));
        System.out.println("a == x: " + (a == x));

        // Toán tử logic
        boolean p = true;
        boolean q = false;
        System.out.println("p && q: " + (p && q));
        System.out.println("p || q: " + (p || q));
        System.out.println("!p: " + (!p));

        // =====================
        // 3. NHẬP XUẤT (Scanner)
        // =====================

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== NHAP XUAT ===");

        System.out.print("Nhap ten: ");
        String userName = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        int age = sc.nextInt();

        System.out.print("Nhap diem trung binh: ");
        double score = sc.nextDouble();

        System.out.println("\n--- THONG TIN ---");
        System.out.println("Ten: " + userName);
        System.out.println("Tuoi: " + age);
        System.out.println("Diem: " + score);

        // =====================
        // 4. IF ELSE DEMO
        // =====================

        if (score >= 8) {
            System.out.println("Xep loai: Gioi");
        } else if (score >= 6.5) {
            System.out.println("Xep loai: Kha");
        } else {
            System.out.println("Xep loai: Trung binh");
        }

        sc.close();
    }
}
