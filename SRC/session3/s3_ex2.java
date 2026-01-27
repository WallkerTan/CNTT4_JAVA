package SRC.session3;
import java.util.Scanner;
import java.util.Arrays;


public class s3_ex2 {

    public void search(String[] A, String temp){
        Arrays.sort(A);
        int z = Arrays.binarySearch(A, temp);
        if(z>=0){
            System.out.printf("tim thay sach %s o vi tri %d",temp,z);
        }else{
            System.out.println("sach khong ton tai trong thu vien");
        }
    }

    public void cinA(){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        String[] A = new String[n];
        for(int i = 0; i<n; i++){
            A[i] = sc.nextLine();
        }
        String temp;
        System.out.println("nhạp gia tri muon tim");
        temp = sc.nextLine();
        sc.close();
        search(A, temp);
    }
    
    public static void main(String[] args) {
        s3_ex2 e = new s3_ex2();
        e.cinA();
    }
}
