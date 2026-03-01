package SRC.session14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class s14_ex6 {
    public static void main(String[] args) {
        List<Patient> B = new ArrayList<>();
        Collections.addAll(B,
                new Patient("tan2", 1, 6),
                new Patient("tan2", 3, 8),
                new Patient("tan3", 2, 4),
                new Patient("tan4", 2, 5));
        Map<Integer, List<Patient>> A = new HashMap<>();
        for (Patient x : B) {
            if (A.containsKey(x.getSeverity())) {
                A.get(x.getSeverity()).add(x);
            } else {
                List<Patient> list = new ArrayList<>();
                list.add(x);
                A.put(x.getSeverity(), list);
            }
        }
        Set<Map.Entry<Integer,List<Patient>>> temp = new TreeSet<>((x,y)->{
            int cmp = Integer.compare(x.getValue().size(), y.getValue().size());
            if(cmp==0){
                return x.getKey().compareTo(y.getKey());
            }
            return cmp;
        });
        temp.addAll(A.entrySet());
        System.out.println(temp);
        

    }
}
