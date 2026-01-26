package SRC.session2;

import java.util.Scanner;

public class s2_ex3 {

    public void fine(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so sach tra muon:");
        n = sc.nextInt();
        int total = 0;
        for(int i = 0; i < n; i++ ){
            System.out.printf("sach %d: so ngay muon...",i+1);
            int z;
            z = sc.nextInt();
            total += z;
        }
        System.out.println("tong tien phat: "+(total*5000)+" vnd");
        sc.close();
    }
    public static void main(String[] args) {
        s2_ex3  e = new s2_ex3();
        e.fine();
    }
}
