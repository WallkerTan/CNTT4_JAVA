package SRC.session15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Patient {
    private String name;
    private String id;
    private int age;
    private String MBN = "BN-";
    static int countid = 0;
    
    public Patient(String name,int age){
        this.name = name;
        this.age = age;
        this.id = MBN.concat(String.valueOf(countid));
        countid++;
    }
    public String getid(){
        return this.id;
    }
    public String getname(){
        return this.name;
    }
    public int getage(){
        return this.age;
    }
}

public class s15_ex2 {
    public static void main(String[] args) {
        Queue<Patient> A = new LinkedList<>();
        boolean z = true;
        Scanner sc = new Scanner(System.in);
        while (z) {
            System.out.println("1: them benh nhan");
            System.out.println("2: xem");
            System.out.println("3: chua benh");
            int choice;
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    String name;
                    int age;
                    name = sc.nextLine();
                    age = sc.nextInt();
                    sc.nextLine();
                    A.add(new Patient(name, age));
                    break;
                case 2:
                    for (Patient x : A) {
                        System.out.printf("id: %s - name: %s - age: %d\n",x.getid(),x.getname(),x.getage());
                    }
                    System.out.println();
                    break;
                case 3:
                    if(A.isEmpty()){
                        System.out.println("khong co benh nhan");
                    }else{
                        Patient temp = A.poll();
                        System.out.println("da kham cho: "+temp.getname());
                    }
                    break;
                default:
                    z = false;
                    break;
            }
        }
    }
}
