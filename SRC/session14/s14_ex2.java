package SRC.session14;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class s14_ex2 {
    public static void main(String[] args) {
        Map<String, String> A = Map.of(
                "1", "Tan1",
                "2", "Tan2",
                "3", "Tan3",
                "4", "Tan4",
                "5", "Tan5");
        Scanner sc = new Scanner(System.in);
        String test;
        System.out.println("nhap ma: ");
        test = sc.nextLine();
        if(A.containsKey(test)){
            System.out.println(A.get(test));
        }else{
            System.out.println("chua co tan nao ma nay ca");
        }
            


    }
}
