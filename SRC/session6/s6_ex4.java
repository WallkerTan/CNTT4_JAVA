package SRC.session6;

public class s6_ex4 {

    static class Employee {
        private String id;
        private String name;
        private double salary;

        // ===== Constructor khong tham so =====
        public Employee() {
            this.id = "Chua co";
            this.name = "Chua co";
            this.salary = 0;
        }

        // ===== Constructor co ma va ten =====
        public Employee(String id, String name) {
            this.id = id;
            this.name = name;
            this.salary = 0;
        }

        // ===== Constructor day du =====
        public Employee(String id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        // ===== Hien thi thong tin =====
        public void showInfo() {
            System.out.println("Ma NV: " + id);
            System.out.println("Ten NV: " + name);
            System.out.println("Luong: " + salary);
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        // Tao doi tuong bang constructor khong tham so
        Employee e1 = new Employee();

        // Tao doi tuong bang constructor co ma va ten
        Employee e2 = new Employee("NV01", "Tan");

        // Tao doi tuong bang constructor day du
        Employee e3 = new Employee("NV02", "Nam", 1200);

        e1.showInfo();
        e2.showInfo();
        e3.showInfo();
    }
}
