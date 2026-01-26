package SRC.session1;
import java.util.Scanner;


public class ex2 {
    int n;
    int m;
    boolean lock = false;

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("So day tra muon: ");
        n = sc.nextInt();

        System.out.print("So Sach Muon: ");
        m = sc.nextInt();
        sc.close();
    }

    public void output(){
        int total = 0;
        total += n * m * 5000;
        double temp = 0;

        if (n > 7 && m >= 3) {
            temp = (double)(total*1.02);
        }else{
            temp = total;
        }

        System.out.printf("Tien phat goc: %d VND\n",total);
        System.out.printf("Tien phạt sau dieu chinh: %.0f VND\n",temp);

        if(temp > 50000){
            System.out.println("Yeu cau khoa the: true");
        }else{
            System.out.println("Yeu cau khoa the: false");
        }
    }

    public static void main(String[] args) {
        ex2 e = new ex2();
        e.input();
        e.output();
    }
}
