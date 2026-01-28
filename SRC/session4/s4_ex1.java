package SRC.session4;
import java.util.Scanner;

public class s4_ex1 {

    public void output(String str1,String str2){
        String[] temp = str1.split("\\s+");
        String[] temp2 = str2.split("\\s+");
        StringBuilder sb = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");
        for(String s:temp){
            sb.append(s.toUpperCase()+" ");
        }
        for(String s:temp2){
            String a = s.substring(0,1).toUpperCase();
            String b = s.substring(1).toLowerCase();
            sb2.append(a).append(b+" ");
        }
        System.out.println(sb);
        System.out.println(sb2);
    }

    public static void main(String[] args) {
        String title,author;
        s4_ex1 e = new s4_ex1();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập tên sách: ");
        title = sc.nextLine();
        System.out.printf("Nhập tên tác giả: ");
        author = sc.nextLine();
        e.output(title, author);
    }
}