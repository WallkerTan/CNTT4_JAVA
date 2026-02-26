package SRC.session13;

import java.util.*;
class Patient {

    private String id;
    private String fullName;
    private int age;
    private String diagnosis;

    public Patient(String id, String fullName, int age, String diagnosis) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void show() {
        System.out.printf("%-10s %-20s %-5d %-20s\n",
                id, fullName, age, diagnosis);
    }
}
public class s13_ex5 {

    static List<Patient> list = new ArrayList<>();


    static boolean isExist(String id) {

        for (Patient p : list) {

            if (p.getId().equals(id))
                return true;

        }

        return false;
    }


    static Patient findById(String id) {

        for (Patient p : list) {

            if (p.getId().equals(id))
                return p;

        }

        return null;
    }


    static void addPatient(Scanner sc) {

        System.out.print("Nhap ID: ");
        String id = sc.nextLine();

        if (isExist(id)) {

            System.out.println("ID da ton tai");
            return;
        }

        System.out.print("Nhap ten: ");
        String name = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap chan doan: ");
        String d = sc.nextLine();

        list.add(new Patient(id, name, age, d));

        System.out.println("Them thanh cong");
    }


    static void update(Scanner sc) {

        System.out.print("Nhap ID: ");
        String id = sc.nextLine();

        Patient p = findById(id);

        if (p == null) {

            System.out.println("Khong tim thay");
            return;
        }

        System.out.print("Chan doan moi: ");
        String d = sc.nextLine();

        p.setDiagnosis(d);

        System.out.println("Cap nhat thanh cong");
    }


    static void remove(Scanner sc) {

        System.out.print("Nhap ID: ");
        String id = sc.nextLine();

        Patient p = findById(id);

        if (p == null) {

            System.out.println("Khong tim thay");
            return;
        }

        list.remove(p);

        System.out.println("Xoa thanh cong");
    }


    static void sortList() {

        Collections.sort(list, new Comparator<Patient>() {

            public int compare(Patient a, Patient b) {

                if (a.getAge() != b.getAge())

                    return b.getAge() - a.getAge();

                return a.getFullName().compareTo(b.getFullName());
            }

        });

        showList();
    }


    static void showList() {

        if (list.isEmpty()) {

            System.out.println("Danh sach rong");
            return;
        }

        System.out.printf("%-10s %-20s %-5s %-20s\n",
                "ID", "Ten", "Tuoi", "Chan doan");

        for (Patient p : list)
            p.show();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nMENU");
            System.out.println("1. Them benh nhan");
            System.out.println("2. Cap nhat chan doan");
            System.out.println("3. Xuat vien");
            System.out.println("4. Sap xep");
            System.out.println("5. Hien thi");
            System.out.println("0. Thoat");

            int ch = Integer.parseInt(sc.nextLine());

            switch (ch) {

                case 1:
                    addPatient(sc);
                    break;

                case 2:
                    update(sc);
                    break;

                case 3:
                    remove(sc);
                    break;

                case 4:
                    sortList();
                    break;

                case 5:
                    showList();
                    break;

                case 0:
                    return;
            }

        }

    }

}