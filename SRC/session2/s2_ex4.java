package SRC.session2;

import java.util.Scanner;

public class s2_ex4 {
    public void newbook(){
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        do {
            int t;
            System.out.println("Nhap ma sach can them > 0");
            t = sc.nextInt();
            if(t<=0){
                System.out.println("Ma sach khong hop le.");
                continue;
            }
            check = false;
            System.out.printf("ma sach %d da duoc ghi nhan.\n",t);
        } while (check);
        sc.close();
    }
    public static void main(String[] args) {
        s2_ex4 e = new s2_ex4();
        e.newbook();
    }
}
