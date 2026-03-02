package SRC.session15;

import java.util.PriorityQueue;

class EmergencyPatient implements Comparable<EmergencyPatient>{
    String id;
    String name;
    int prority;
    String baseid = "BN-";
    static int count = 0;

    public EmergencyPatient(String name, int prority){
        this.name = name;
        this.prority = prority;
        this.id = baseid.concat(String.valueOf(++count));
    }
    @Override
    public int compareTo(EmergencyPatient x){
        return x.prority - this.prority;
    }
}

class EmergencyQueue{

    //c1 nếu ko implement Comparable
    PriorityQueue<EmergencyPatient> pq =
    new PriorityQueue<>((a, b) -> a.prority - b.prority);

    //c2 nếu implement comparable
    PriorityQueue<EmergencyPatient> A = new PriorityQueue<>();
    public void addPatient(EmergencyPatient x){
        A.add(x);
    }
    public EmergencyPatient callNextPatient(){
        EmergencyPatient temp = A.poll();
        if(temp == null){
            System.out.println("ko co phan tu nao");
        }else{
            System.out.println("ng "+temp.name+" vao kham.");
        }
        return temp;
    }
    public void displayQueue(){
        for (EmergencyPatient x : A) {
            System.out.printf("id: %s - name: %s - prority: %d\n",x.id, x.name, x.prority);
        }
    }
}

public class s15_ex4 {
    public static void main(String[] args) {
        EmergencyQueue eq = new EmergencyQueue();

        eq.addPatient(new EmergencyPatient("Tan", 2));
        eq.addPatient(new EmergencyPatient("Nam", 5));
        eq.addPatient(new EmergencyPatient("Linh", 1));
        eq.addPatient(new EmergencyPatient("Hoa", 4));

        System.out.println("Danh sach trong hang doi:");
        eq.displayQueue();

        System.out.println("\nGoi benh nhan vao kham:");
        eq.callNextPatient();
        eq.callNextPatient();
        eq.callNextPatient();
        eq.callNextPatient();

        System.out.println("\nThu goi tiep khi rong:");
        eq.callNextPatient();
    }
}
