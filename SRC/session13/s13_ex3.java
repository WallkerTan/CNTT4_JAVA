package SRC.session13;

import java.util.ArrayList;
import java.util.List;

public class s13_ex3 {

    public static <T> List<T> findCommonPatients(List<T> A,List<T> B){
        List<T> res = new ArrayList<>();
        for(T x:A){
            if(B.contains(x) && !res.contains(x)){
                res.add(x);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>(List.of(101, 102, 105));
        List<Integer> B = new ArrayList<>(List.of(106, 102, 104,105));
        System.out.println(findCommonPatients(A, B));
    }
}
