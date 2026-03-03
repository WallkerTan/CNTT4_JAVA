package SRC.session15;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

class PatientWaitingQueue {
    Queue<Patient> waitingQueue;
    int totalPatients;

    public PatientWaitingQueue() {
        waitingQueue = new LinkedList<>();
        totalPatients = 0;
    }

    public void addPatient(Patient p) {
        waitingQueue.add(p);
        totalPatients++;
    }

    public Patient callNextPatient() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Khong co benh nhan.");
            return null;
        }
        totalPatients--;
        return waitingQueue.poll();
    }

    public void displayQueue() {
        for (Patient p : waitingQueue) {
            System.out.println(p);
        }
    }
}

class Patient {
    String id;
    String name;
    int age;
    String gender;

    public Patient(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + age + " - " + gender;
    }
}

class EditAction {
    String description;
    String editedBy;
    String editTime;

    public EditAction(String description, String editedBy, String editTime) {
        this.description = description;
        this.editedBy = editedBy;
        this.editTime = editTime;
    }

    @Override
    public String toString() {
        return description + " - " + editedBy + " - " + editTime;
    }
}

class MedicalRecordHistory {
    Stack<EditAction> editStack;
    String recordId;

    public MedicalRecordHistory(String recordId) {
        this.recordId = recordId;
        editStack = new Stack<>();
    }

    public void addEdit(EditAction action) {
        editStack.push(action);
    }

    public EditAction undoEdit() {
        if (editStack.isEmpty()) {
            System.out.println("Khong co thao tac de undo.");
            return null;
        }
        return editStack.pop();
    }

    public void displayHistory() {
        for (EditAction e : editStack) {
            System.out.println(e);
        }
    }
}

class Ticket {
    int ticketNumber;
    String issuedTime;

    public Ticket(int ticketNumber, String issuedTime) {
        this.ticketNumber = ticketNumber;
        this.issuedTime = issuedTime;
    }

    @Override
    public String toString() {
        return "So: " + ticketNumber + " - Thoi gian: " + issuedTime;
    }
}

class TicketSystem {
    Queue<Ticket> ticketQueue;
    int currentNumber;

    public TicketSystem() {
        ticketQueue = new LinkedList<>();
        currentNumber = 0;
    }

    public Ticket issueTicket(String time) {
        currentNumber++;
        Ticket t = new Ticket(currentNumber, time);
        ticketQueue.add(t);
        return t;
    }

    public Ticket callNextTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("Khong con so.");
            return null;
        }
        return ticketQueue.poll();
    }
}

class InputAction {
    String fieldName;
    String oldValue;
    String newValue;
    String actionTime;

    public InputAction(String fieldName, String oldValue, 
                       String newValue, String actionTime) {
        this.fieldName = fieldName;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.actionTime = actionTime;
    }

    @Override
    public String toString() {
        return fieldName + ": " + oldValue + " -> " + newValue + 
               " (" + actionTime + ")";
    }
}

public class s15_ex6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PatientWaitingQueue waitingQueue = new PatientWaitingQueue();
        TicketSystem ticketSystem = new TicketSystem();
        MedicalRecordHistory recordHistory = new MedicalRecordHistory("REC001");

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Phat so");
            System.out.println("2. Goi so tiep theo");
            System.out.println("3. Them benh nhan vao hang doi");
            System.out.println("4. Goi benh nhan tiep theo");
            System.out.println("5. Sua benh an (them lich su)");
            System.out.println("6. Undo thao tac benh an");
            System.out.println("7. Xem lich su benh an");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Nhap thoi gian phat so: ");
                    String time = sc.nextLine();
                    Ticket t = ticketSystem.issueTicket(time);
                    System.out.println("Da phat so: " + t);
                    break;

                case 2:
                    Ticket next = ticketSystem.callNextTicket();
                    if (next != null) {
                        System.out.println("Dang goi: " + next);
                    }
                    break;

                case 3:
                    System.out.print("Nhap ID: ");
                    String id = sc.nextLine();
                    System.out.print("Nhap ten: ");
                    String name = sc.nextLine();
                    System.out.print("Nhap tuoi: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhap gioi tinh: ");
                    String gender = sc.nextLine();

                    Patient p = new Patient(id, name, age, gender);
                    waitingQueue.addPatient(p);
                    System.out.println("Da them benh nhan.");
                    break;

                case 4:
                    Patient nextPatient = waitingQueue.callNextPatient();
                    if (nextPatient != null) {
                        System.out.println("Dang kham: " + nextPatient);
                    }
                    break;

                case 5:
                    System.out.print("Nhap mo ta chinh sua: ");
                    String desc = sc.nextLine();
                    System.out.print("Nhap nguoi sua: ");
                    String editedBy = sc.nextLine();
                    System.out.print("Nhap thoi gian sua: ");
                    String editTime = sc.nextLine();

                    EditAction action = new EditAction(desc, editedBy, editTime);
                    recordHistory.addEdit(action);
                    System.out.println("Da them lich su chinh sua.");
                    break;

                case 6:
                    EditAction undone = recordHistory.undoEdit();
                    if (undone != null) {
                        System.out.println("Da undo: " + undone);
                    }
                    break;

                case 7:
                    System.out.println("=== Lich su benh an ===");
                    recordHistory.displayHistory();
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le.");
            }

        } while (choice != 0);

        sc.close();
    }
}
