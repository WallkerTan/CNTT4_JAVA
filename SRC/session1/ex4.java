package SRC.session1;
import java.util.Scanner;
public class ex4 {
    double price;
    double ty_gia;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá sách: ");
        price = sc.nextDouble();
        System.out.print("Ty gia: ");
        ty_gia = sc.nextDouble();
        sc.close();
    }

    public void output(){
        System.out.printf("Gia sach usd: %d\n",(long)price);
        System.out.printf("Gia chinh xac: %.5f\n",(price*ty_gia));
        System.out.printf("Gia lam tron: %d\n",(long)(price*ty_gia));
    }

    public static void main(String[] args){
        ex4 e = new ex4();
        e.input();
        e.output();
    }
}
