package SRC.session4;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class s4_ex4 {

    public void check(String str){
        String regex = "^[A-Z]{2}\\d{4}\\d{5}$";
        System.out.println(str.matches(regex)?"ma the hop le":"ma the khong hop le");
    }

    public static void main(String[] args) {
        String str = "TV202312345";
        String str1 = "tv202312345";
        s4_ex4 e = new s4_ex4();
        e.check(str1);
    }
}
