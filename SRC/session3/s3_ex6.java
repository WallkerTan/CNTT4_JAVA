package SRC.session3;
import java.util.Arrays;


public class s3_ex6 {
    public void gopmang(int[] A, int[] B){
        int[] C = new int[A.length + B.length];
        int[] D = new int[A.length + B.length];
        Arrays.fill(C,-1);
        int index = 0;
        for(int i = 0; i<A.length; i++){
            if(D[A[i]] !=0) continue;
            C[index] = A[i];
            index+=1;
            D[A[i]]=1;
        }
        for(int i = 0; i<B.length; i++){
            if(D[B[i]] !=0) continue;
            C[index] = B[i];
            index+=1;
            D[B[i]]=1;
        }
        System.out.println(Arrays.toString(C));
    }
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 9, 10};
        int[] B = {2, 3, 6, 7, 8, 10};
        s3_ex6 e = new s3_ex6();
        e.gopmang(A, B);
    }
}
