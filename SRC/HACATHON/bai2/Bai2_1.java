package SRC.HACATHON.bai2;
import java.util.Scanner;

public class Bai2_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] A = new int[n];

        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int[] B = new int[k];

        int j=0;

        for(int i = n-k; i<n; i++){
            B[j++] = A[i];
        }

        for(int i=n-1; i>=k; i--){
            A[i] = A[i-k];
        }

        for(int i=0; i<k;i++){
            A[i] = B[i];
        }

        for(int x:A){
            System.out.print(x+" ");
        }

    }
}