package SRC.session15;

import java.util.Scanner;
import java.util.Stack;

public class s15_ex1 {
    public static void main(String[] args) {
        Stack<String> A = new Stack<>();
        Scanner sc = new Scanner(System.in);
        boolean z  = true;
        while (true) {
            System.out.println("1: add");
            System.out.println("2: show");
            System.out.println("3: undo");
            int choice;
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("them chinh sua");
                    A.push(sc.nextLine());
                    break;
                case 2:
                    System.out.println(A);
                    break;
                case 3:
                    if(A.empty()){
                        System.out.println("ko co gi truoc do");
                    }else{
                        String temp = A.pop();
                        System.out.println("da xoa: "+temp);
                    }
                    break;
                 
                default:
                    z = false;
                    break;
            }
            sc.close();
        }
    }
}
