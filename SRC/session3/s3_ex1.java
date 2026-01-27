package SRC.session3;
import java.util.Scanner;
import java.util.Arrays;

public class s3_ex1 {
    public int[] cinN(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap so sach: ");
        n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++ ){
            System.out.printf("phan tu thu %d: ",i+1);
            A[i] = sc.nextInt();
        }
        sc.close();
        return A;
    }
    
    public void output(int[] A){
        System.out.println(Arrays.toString(A));
    }

    public static void main(String[] args) {
        s3_ex1 e = new s3_ex1();
        e.output(e.cinN());
    }    
}
