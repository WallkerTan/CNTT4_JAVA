package SRC.session2;
import java.util.Scanner;


public class s2_ex5 {
    public void reader_reviews(){
        Scanner sc = new Scanner(System.in);
        int total = 120;
        do {
            int temp;
            System.out.println("Tao se danh gia may");
            System.out.printf("so ngay tre lan nay: ");
            temp = sc.nextInt();
            if(temp == 999){
                break;
            }
            total -= temp*2;
        } while (true);
        if(total<80){
            System.out.println("DOC GIA CAN LUU Y: "+total);
        }else if(total < 120){
            System.out.println("DOC GIA TIEU CHUAN: "+total);
        }else{
            System.out.println("DOC GIA THAN THIET: "+total);
        }
    }
    public static void main(String[] args) {
        s2_ex5 e = new s2_ex5();
        e.reader_reviews();
    }
}
