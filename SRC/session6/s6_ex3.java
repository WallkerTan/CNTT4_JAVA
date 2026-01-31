package SRC.session6;

public class s6_ex3 {

    static class Product {
        // ===== Thuộc tính (dong goi) =====
        private String productId;
        private String productName;
        private double price;

        // ===== Constructor =====
        public Product(String productId, String productName, double price) {
            this.productId = productId;
            this.productName = productName;
            setPrice(price);
        }

        // ===== Getter =====
        public String getProductId() {
            return productId;
        }

        public String getProductName() {
            return productName;
        }

        public double getPrice() {
            return price;
        }

        // ===== Setter (kiem soat du lieu) =====
        public void setPrice(double price) {
            if (price > 0) {
                this.price = price;
            } else {
                System.out.println("Gia khong hop le! Gia phai > 0");
            }
        }

        // ===== Hien thi thong tin =====
        public void showInfo() {
            System.out.println("Ma SP: " + productId);
            System.out.println("Ten SP: " + productName);
            System.out.println("Gia ban: " + price);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("SP01", "Laptop", 1500);
        p1.showInfo();

        System.out.println("---- Thu set gia khong hop le ----");
        p1.setPrice(-500);

        System.out.println("---- Sau khi set gia ----");
        p1.showInfo();
    }
}
