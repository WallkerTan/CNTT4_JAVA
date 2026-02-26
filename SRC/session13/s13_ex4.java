package SRC.session13;

import java.util.ArrayList;
import java.util.List;

abstract class EmergencyRoom {
    private String name;
    static List<EmergencyRoom> A = new ArrayList<>();
    public EmergencyRoom(String name){
        this.name = name;
    }
    abstract void patientCheckIn();
    abstract void emergencyCheckIn();
    public void addpatienttolist(){
        if(!A.contains(this.name)){
            A.add(this);
        }
    }
    public void addemergencytolist(){
        if(!A.contains(this.name)){
            A.add(0,this);
        }
    }
    public String getname(){
        return this.name;
    }

    public void show(){
        boolean check = false;
        for(EmergencyRoom x:A){
            if(!check){
                if( x instanceof emergency){
                    System.out.printf(" dang cap cuu %s\n",x.name);
                }else{
                    System.out.printf(" dang kham %s\n",x.name);
                }
                check = true;
            }
            System.out.printf("dang cho den luot\n");
        }
    }
}

class patient extends EmergencyRoom{
    public patient(String name){
        super(name);
        this.addpatienttolist();
    }
    public void emergencyCheckIn(){
        System.out.println("ko thuoc dang benh nhan thuong");

    }
    public void patientCheckIn(){
        if(A.contains(this))
            System.out.printf("dang kham: %S\n",this.getname());
    }
}


class emergency extends EmergencyRoom{
    public emergency(String name){
        super(name);
        this.addemergencytolist();
    }
    public void emergencyCheckIn(){
        if(A.contains(this))
            System.out.printf("Dang cap cuu: %S\n",this.getname());

    }
    public void patientCheckIn(){
        System.out.println("ko thuoc dang benh nha can cap cuu");
    }
}

public class s13_ex4 {
    public static void main(String[] args) {
        patient b1 = new patient("tan");
        patient b2 = new patient("hung");
        emergency b3 = new emergency("dat");
        emergency b4 = new emergency("thanh");
        b1.patientCheckIn();
        b2.patientCheckIn();
        b3.emergencyCheckIn();
        b4.emergencyCheckIn();
        b1.show();
    }
}
