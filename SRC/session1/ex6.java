package SRC.session1;
import java.util.Scanner;

public class ex6 {
    int n;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        n = sc.nextInt();
        sc.close();
    }
    public void output(){
        int m;
        int index;
        if(n<25 && n>0){
            m=1;
            index = n;
        }else{
            m = (n/25)+1;
            index = n%25;
        }
        System.out.printf("sach so: %d\n",n);
        System.out.printf("Dia chi: ke so- %d , vi tri-%d\n",m,index+1);
        System.out.printf("phan khu: %s\n", m<10?"khu can":"khu vien");
    }
    public static void main(String[] args) {
        ex6 e = new ex6();
        e.input();
        e.output();
    }
}
