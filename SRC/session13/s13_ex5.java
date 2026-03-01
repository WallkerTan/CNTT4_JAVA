package SRC.session13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Patient {
    private int id;
    private String name;
    private int age;
    private String diagnosis;
    static int countid = 0;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.diagnosis = "chua duoc chuan doan";
        this.id = ++countid;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getDiagnosis() {
        return this.diagnosis;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void displayInfo() {
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
        System.out.println("diagnosis: " + this.diagnosis);
    }
}

public class s13_ex5 {
    static List<Patient> A = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void menu() {
        System.out.println("\n1.Them");
        System.out.println("2.Sua");
        System.out.println("3.Xoa");
        System.out.println("4.In");
        System.out.println("5.Tim benh nhan");
        System.out.println("6.Sap sep tang dan (A-Z)");
        System.out.println("7:sap sep giam dan (A-Z)");
        System.out.println("8.Thoat");
    }

    static void addPatient() {
        System.out.println("Ten benh nhan");
        String name = sc.nextLine();
        System.out.println("tuoi benh nhan");
        int age = sc.nextInt();
        sc.nextLine();
        A.add(new Patient(name, age));
    }

    static void updatePatient() {
        int id;
        System.out.println("nhap id can sua_");
        id = sc.nextInt();
        sc.nextLine();
        boolean check = false;
        int index = -1;
        for (int i = 0; i < A.size(); i++) {
            Patient x = A.get(i);
            if (x.getID() == id) {
                check = true;
                index = i;
                break;
            }
        }

        if(index==-1){
            System.out.println("ko tim thay");
            return;
        }
        System.out.println("ten moi_");
        String name = sc.nextLine();
        System.out.println("nhap tuoi moi_");
        int age = sc.nextInt();
        sc.nextLine();
        A.get(index).setname(name);
        A.get(index).setAge(age);
    }

    static void dischangeHopital() {
        int id;
        System.out.println("nhap id nguoi da chua khoi benh_");
        id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < A.size() - 1; i++) {
            Patient x = A.get(i);
            if (x.getID() == id) {
                System.out.printf("benh nhan: %s -> da xuat vien\n", x.getName());
                A.remove(i);
                break;
            }
        }
        System.out.println(" khong tim thay benh nhan nay");
    }

    static int getIndex(int id) {
        for (int i = 0; i < A.size() - 1; i++) {
            Patient x = A.get(i);
            if (x.getID() == id) {
                return i;
            }
        }
        return -1;
    }

    static void bilarySearch() {
        int id;
        System.out.println("nhap id nguoi can tim_");
        id = sc.nextInt();
        sc.nextLine();
        List<Patient> B = A;
        Collections.sort(B, (p1, p2) -> Integer.compare(p1.getID(), p2.getID()));

        int left = A.get(0).getID();
        int right = A.get(A.size() - 1).getID();
        while (left <= right) {
            int mid = (left + right) / 2;
            if (id == mid) {
                A.get(getIndex(mid)).displayInfo();
                return;
            }
            if (id > mid) {
                left = mid;
            }
            if (id < mid) {
                right = mid;
            }
        }
        System.out.println("khong tim thay ng dung");
    }

    static void displayAll() {
        for (Patient x : A) {
            x.displayInfo();
        }
    }

    static void theSort(boolean z) {
        if (z) {
            Collections.sort(A, (x, y) -> x.getName().compareTo(y.getName()));
        } else {
            Collections.sort(A, (x, y) -> y.getName().compareTo(x.getName()));
        }
    }

    public static void main(String[] args) {
        while (true) {
            menu();
            int choice;
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    updatePatient();
                    break;
                case 3:
                    dischangeHopital();
                    break;
                case 4:
                    displayAll();
                    break;
                case 5:
                    bilarySearch();
                    break;
                case 6:
                    theSort(true);
                    break;
                case 7:
                    theSort(false);
                    break;
                case 8:
                    System.out.println("cam on ban");
                    return;
                default:
                    System.out.println("lua chon khong hop le");
                    break;
            }
        }
    }
}