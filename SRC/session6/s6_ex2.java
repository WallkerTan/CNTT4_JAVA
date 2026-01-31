package SRC.session6;

public class s6_ex2 {

    // ===== Lớp Account =====
    static class Account {
        // Thuộc tính
        private String username;
        private String password;
        private String email;

        // Constructor
        public Account(String username, String password, String email) {
            this.username = username;
            this.password = password;
            this.email = email;
        }

        // Phương thức đổi mật khẩu
        public void changePassword(String newPassword) {
            this.password = newPassword;
        }

        // Phương thức hiển thị thông tin (ẩn mật khẩu)
        public void showInfo() {
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: ******");
        }
    }

    // ===== Main =====
    public static void main(String[] args) {

        // Tạo đối tượng Account
        Account acc1 = new Account("tan123", "123456", "tan@gmail.com");

        // Hiển thị thông tin ban đầu
        System.out.println("Thong tin tai khoan:");
        acc1.showInfo();

        // Đổi mật khẩu
        acc1.changePassword("newpass789");

        // Hiển thị sau khi đổi mật khẩu
        System.out.println("\nSau khi doi mat khau:");
        acc1.showInfo();
    }
}
