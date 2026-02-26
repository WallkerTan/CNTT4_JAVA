package SRC.HACATHON.bai1;

import java.util.Scanner;

public class Bai1_1 {
    public String check(String str){
        StringBuilder sb = new StringBuilder("");
        char temp = 'a';
        int count = 0;
        for(char x:str.toCharArray()){
            if(count == 0){
                sb.append(x);
                temp = x;
                count = 1;
            }else if(temp == x){
                count++;
            }else{
                sb.append(count);
                sb.append(x);
                temp = x;
                count = 1;
            }
        }
        sb.append(count);
        return str.length()<sb.toString().length()?str:sb.toString();
    }
    public static void main(String[] args) {
        Bai1_1 e = new Bai1_1();
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        System.out.println(e.check(str));
        sc.close();
    }
}