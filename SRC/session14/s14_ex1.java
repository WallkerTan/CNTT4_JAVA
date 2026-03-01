package SRC.session14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class s14_ex1 {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
            Collections.addAll(A, "Tan_1","Tan_2","Tan_1","Tan_4","Tan_3");
        Set<String> B = new HashSet<String>(A);
        Set<String> C = new LinkedHashSet<>(A);
        System.out.println(B);
        System.out.println(C);
    }
}
