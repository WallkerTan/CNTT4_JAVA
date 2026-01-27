package SRC.session3;
import java.util.Scanner;


public class s3_ex4 {

    public static void sortBooks(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void displayBooks(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] isbn = {9783, 1205, 4501, 9999, 3050, 1100};

        System.out.println("Mang truoc khi sap xep:");
        displayBooks(isbn);

        sortBooks(isbn);

        System.out.println("Mang sau khi sap xep tang dan:");
        displayBooks(isbn);
    }    
}
