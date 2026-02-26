package SRC.HACATHON.bai3;

import java.util.Scanner;
public class Bai3_1 {

    public  void findSubArray(int[] arr, int S) {
        int left = 0;
        int sum = 0;
        for(int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while(sum > S) {
                sum -= arr[left];
                left++;
            }
            if(sum == S) {

                System.out.println(left + " " + right);
                return;
            }
        }
        System.out.println(-1);
    }

    public static void main(String[] args) {
        Bai3_1 e = new Bai3_1();
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.nextLine();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            sc.nextLine();
        }
        int k;
        k = sc.nextInt();
        sc.nextLine();
        e.findSubArray(A, k);
    }
}
