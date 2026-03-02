package SRC.session15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class EditAction{
    private String description;
    private String time;

    public EditAction(String description,String time){
        this.description = description;
        this.time = time;
    }
    
    public String getdes(){
        return this.description;
    }
    public String gettime(){
        return this.time;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setTime(String time){
        this.time = time;
    }

    @Override
    public String toString(){
        return description + " - " + time;
    }

}

class EmergencyCase{
    public Patient patient;
    public Stack<EditAction> actions = new Stack<>();
    public EditAction curentAction;

    public EmergencyCase(String name,int age){
        this.patient = new Patient(name, age);
    }

    public void addStep(EditAction a){
        this.actions.add(a);
        this.curentAction = a;
        System.out.println("da them 1 buoc: "+this.curentAction.getdes());
    }

    public void undoStep(){
        EditAction temp = this.actions.pop();
        System.out.println("da huy buoc: "+this.curentAction);
        System.out.println("quay lai buoc: "+temp);
        this.curentAction = temp;
    }

    public void displaySteps(){
        for (EditAction x : actions) {
            System.out.println(x.toString());
        }
    }
}

class EmergencyCaseQueue{
    Queue<EmergencyCase> cases = new LinkedList<EmergencyCase>();
    public EmergencyCase cur;
    public void addCase(String name,int age){
        this.cur = new EmergencyCase(name, age);
        cases.add(cur);
    }
    public void getNextCase(){
        System.out.println("benh nhan "+cur.patient.getname()+" da vao kham");
        this.cur = cases.poll();
    }
}

public class s15_ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        int choice;

        do {
            System.out.println("1. Them benh nhan");
            System.out.println("2. Goi benh nhan vao kham");
            System.out.println("3. Them buoc xu ly");
            System.out.println("4. Undo buoc");
            System.out.println("5. Hien thi cac buoc");
            System.out.println("0. Thoat");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Nhap ten: ");
                    String name = sc.nextLine();
                    System.out.print("Nhap tuoi: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    queue.addCase(name, age);
                    System.out.println("Da them benh nhan vao hang doi.");
                    break;

                case 2:
                    queue.getNextCase();
                    break;

                case 3:
                    if (queue.cur == null) {
                        System.out.println("Chua co benh nhan dang kham.");
                        break;
                    }

                    System.out.print("Nhap mo ta buoc: ");
                    String des = sc.nextLine();
                    System.out.print("Nhap thoi gian: ");
                    String time = sc.nextLine();

                    EditAction action = new EditAction(des, time);
                    queue.cur.addStep(action);
                    break;

                case 4:
                    if (queue.cur == null) {
                        System.out.println("Chua co benh nhan dang kham.");
                        break;
                    }

                    queue.cur.undoStep();
                    break;

                case 5:
                    if (queue.cur == null) {
                        System.out.println("Chua co benh nhan dang kham.");
                        break;
                    }

                    queue.cur.displaySteps();
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