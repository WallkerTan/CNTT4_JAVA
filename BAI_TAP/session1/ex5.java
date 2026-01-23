package BAI_TAP.session1;
import java.util.Scanner;
public class ex5 {
    public boolean check(int n){
        int thousands,hundreds,dozens,units,temp;
        units = n%10;
        n=n/10;
        dozens = n%10;
        n=n/10;
        hundreds=n%10;
        if(n == 10){
            thousands = 1;
        }else{
            thousands = (n/10)%10;
        }
        return (thousands+hundreds+dozens)%10 == units ;
    }
    public static void main(String[] args) {
        ex5 e = new ex5();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap n 4 chu so: \n");
        n = sc.nextInt();
        if(e.check(n)){
            System.out.println("ket qua kiem tra : hop le");
        }else{
            System.out.println("ket qua kiem tra : sai ma");
        }
        sc.close();
    }
}
