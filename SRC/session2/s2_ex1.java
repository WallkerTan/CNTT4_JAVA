package SRC.session2;

import java.util.Scanner;

public class s2_ex1 {

    public void input(){
        Scanner sc = new Scanner(System.in);
        
        int age,qtt;
        System.out.println("Nhap tuoi cua ban: ");
        age = sc.nextInt();
        System.out.println("Nhap so sach ban dang muon: ");
        qtt = sc.nextInt();
        sc.close();

        if(age >= 18 && qtt < 3){
            System.out.println("KET QUA: ban du dieu kien muon sach.");
            return;
        }else if(age>=18 && qtt >= 3){
            System.out.println("KET QUA: ban duoc muon toi da 3 quyen sach.");
            return;
        }else{
            System.out.println("KET QUA: Ban Phai du 18 tuoi.");
            return;
        }
    }

    public static void main(String[] args){
        s2_ex1 e = new s2_ex1();
        e.input();
    }
}
