package SRC.HACATHON.bai2;

import java.util.Scanner;

public class Bai2_2 {

    public int maxSubArray(int[] A) {

        int maxSum = A[0];
        int currentSum = A[0];

        for(int i = 1; i < A.length; i++) {

            currentSum = Math.max(A[i], currentSum + A[i]);

            maxSum = Math.max(maxSum, currentSum);

        }

        return maxSum;
    }
    public static void main(String[] args) {
        Bai2_2 e = new Bai2_2();
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.nextLine();
        int[] A = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            sc.nextLine();
            if (A[i] >= max)
                max = A[i];
        }
        System.out.println(e.maxSubArray(A));
    }
}
