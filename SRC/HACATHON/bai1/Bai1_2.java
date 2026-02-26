package SRC.HACATHON.bai1;

import java.util.Scanner;

public class Bai1_2 {
    public String daonguoc(String str){
        StringBuilder sb = new StringBuilder("");
        String[] temp = str.split(" ");
        for(String x:temp){
            for(int i=x.length()-1; i>=0; i--){
                sb.append(x.charAt(i));
            }
            sb.append(" ");
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Bai1_2 e = new Bai1_2();
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        System.out.println(e.daonguoc(str));
        sc.close();
    }
}
