package BAI_TAP.session2;
import java.util.Scanner;

public class s2_ex2 {
    public void input(String a){
        switch (a) {
            case "A":
                System.out.println("VI TRI:  tang 1 - ssach van hoc.");
                break;
            case "B":
                System.out.println("VI TRI:  tang 2 - ssach khoa hoc.");
                break;
            case "C":
                System.out.println("VI TRI:  tang 3 - ssach hoa hoc.");
                break;
            case "D":
                System.out.println("VI TRI:  tang 4 - ssach tu tin hoc.");
                break;
            default:
                System.out.println("VI TRI: tu tien hoc.");
                break;
        }
    }
    public static void main(String[] args){
        s2_ex2 e = new s2_ex2();
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tang sach (A,B,C,D): ");
        a = sc.nextLine();
        e.input(a);
        sc.close();
    }    
}
