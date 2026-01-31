package SRC.session6;

public class s6_ex5 {

    static class Book {
        private String id;
        private String name;
        private double price;

        // Constructor: tham so TRUNG TEN voi thuoc tinh
        public Book(String id, String name, double price) {
            // this.id la THUOC TINH
            // id (khong co this) la THAM SO
            this.id = id;
            this.name = name;
            this.price = price;
        }

        // Hien thi thong tin sach
        public void showInfo() {
            System.out.println("Ma sach: " + id);
            System.out.println("Ten sach: " + name);
            System.out.println("Gia: " + price);
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("B01", "Lap trinh Java", 150.5);
        Book b2 = new Book("B02", "C++ nang cao", 200);

        b1.showInfo();
        b2.showInfo();
    }
}
