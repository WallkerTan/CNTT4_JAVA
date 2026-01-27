package SRC.session3;
import java.util.Arrays;
public class temp {

    public static void main(String[] args) {
        int[] A = {7,6,8,6,7,2,4,6,8,5};
        int i=0;
        int j=0;
        int max = 1;
        int sum = 1;
        int i2 = 0;
        int j2 =1;
        while (j2 < A.length) {
            if(A[j2] > A[j2-1]){
                sum++;
            }else{
                if(sum>max){
                    max = sum;
                    i = i2;
                    j = j2-1;
                }
                i2 = j2;
                sum = 1;
            }
            j2++;
        }
        if(sum>max){
            max = sum;
            i = i2;
        }
        for(int k = i; k<=j; k++){
            System.out.println(A[k]);
        }
    }
}
