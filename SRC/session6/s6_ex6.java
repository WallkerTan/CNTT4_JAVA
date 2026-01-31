package SRC.session6;

public class s6_ex6 {

    static class User {
        // ===== Thuoc tinh (ENCAPSULATION) =====
        private int id;
        private String username;
        private String password;
        private String email;

        // ===== Constructor =====
        public User(int id, String username, String password, String email) {
            this.id = id;
            this.username = username;
            setPassword(password); // kiem soat
            setEmail(email);       // kiem soat
        }

        // ===== Getter =====
        public int getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

        public String getEmail() {
            return email;
        }

        // ===== Setter (KIEM SOAT DU LIEU) =====
        public void setPassword(String password) {
            if (password != null && !password.isEmpty()) {
                this.password = password;
            } else {
                System.out.println("Password khong duoc rong!");
            }
        }

        public void setEmail(String email) {
            if (email != null && email.contains("@")) {
                this.email = email;
            } else {
                System.out.println("Email khong hop le!");
            }
        }

        // ===== Hien thi thong tin (AN PASSWORD) =====
        public void showInfo() {
            System.out.println("ID: " + id);
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: ******");
            System.out.println("---------------------");
        }
    }

    public static void main(String[] args) {

        // ===== DUNG =====
        User u1 = new User(1, "tan123", "123456", "tan@gmail.com");
        u1.showInfo();

        // ===== EMAIL SAI =====
        User u2 = new User(2, "user2", "abc123", "email_sai");
        u2.showInfo();

        // ===== PASSWORD RONG =====
        User u3 = new User(3, "user3", "", "user3@gmail.com");
        u3.showInfo();

        // ===== SET LAI DU LIEU =====
        u3.setPassword("newpass");
        u3.setEmail("user3@gmail.com");
        u3.showInfo();
    }
}
