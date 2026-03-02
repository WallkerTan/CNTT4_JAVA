package SRC.session14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class s14_ex4 {
    public static void main(String[] args) {
        List<String> L = new ArrayList<>(
                List.of("Cúm A", "Sốt xuất huyết", "Cúm A", "Covid-19", "Cúm A", "Sốt xuất huyết"));
        Map<String, Integer> A = new HashMap<>();
        for (String x : L) {
            if (A.containsKey(x)) {
                A.replace(x, A.get(x) + 1);
            } else {
                A.putIfAbsent(x, 1);
            }
        }

        Set<Map.Entry<String, Integer>> B = new TreeSet<>((x, y) -> {
            int cmp = x.getValue().compareTo(y.getValue());
            if (cmp == 0) {
                return x.getKey().compareTo(y.getKey());
            }
            return cmp;
        });

        B.addAll(A.entrySet());

        for (Map.Entry<String, Integer> x : B) {
            System.out.println(x.getKey() + ": " + x.getValue());
        }
    }
}
