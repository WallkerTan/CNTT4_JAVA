package SRC.session13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class s13_ex2 {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>(List.of("Paracetamol", "Ibuprofen", "Panadol", "Paracetamol", "Aspirin", "Ibuprofen"));
        Iterator it = A.iterator();
        ArrayList<String> B = new ArrayList<>();
        while(it.hasNext()){
            String temp = (String)it.next();
            if(!B.contains(temp)){
                B.add(temp);
            }
        }
        for(String x:B){
            System.out.printf("%s, ",x);
        }
    }
}
