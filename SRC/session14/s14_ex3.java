package SRC.session14;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class s14_ex3 {
    public static void main(String[] args) {
        Set<String> A = new HashSet<>(List.of("Aspirin","Caffeine","Paracetamol"));
        Set<String> C = new HashSet<>(A);
        Set<String> B = new HashSet<>(List.of("Penicillin","Aspirin","Pollen"));
        C.retainAll(B);
        Set<String> D = new HashSet<>(A);
        D.removeAll(B);
        System.out.println("thuoc an toan: "+C);
        System.out.println("tuoc khong an toan: "+D);
    }
}