package SRC.session13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class s13_ex1 {
    public static void main(String[] args) {

        // cách 1
        ArrayList<Double> A = new ArrayList<>(List.of(36.5, 40.2, 37.0, 12.5, 39.8, 99.9, 36.8));
        // cách 2
        ArrayList<Double> B = new ArrayList<>();
        B.addAll(Arrays.asList(36.5, 40.2, 37.0, 12.5, 39.8, 99.9, 36.8));

        // cách 3
        ArrayList<Double> C = new ArrayList<>();
        Collections.addAll(C, 36.5, 40.2, 37.0, 12.5, 39.8, 99.9, 36.8);

        // cách 4
        ArrayList<Double> D = new ArrayList<>(Arrays.asList(36.5, 40.2, 37.0, 12.5, 39.8, 99.9, 36.8));

        Iterator<Double> it = A.iterator();
        while (it.hasNext()) {
            Double temp = it.next();
            if(temp < 34 || temp > 42){
                it.remove();
            }
        }

        it = A.iterator();
        while (it.hasNext()) {
            Double temp = it.next();
            System.out.printf("%.2f, \n",temp);
        }

    }
}
