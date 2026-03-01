package SRC.session14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Patient {

    private String name;
    private int severity; // 1 = Nguy kịch, 2 = Nặng, 3 = Nhẹ
    private int arrivalTime; // Thời gian đến (số nhỏ hơn = đến sớm hơn)

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return name + " | Severity: " + severity + " | Arrival: " + arrivalTime+"\n";
    }
}

public class s14_ex5 {
    public static void main(String[] args) {
        List<Patient> B = new ArrayList<>();
        Collections.addAll(B, new Patient("tan2", 1, 6), 
        new Patient("tan2", 3, 8), 
        new Patient("tan3", 2, 4),      
        new Patient("tan4", 2, 5));
        Set<Patient> A = new TreeSet<>((y, x) -> {
            int z = Integer.compare(x.getSeverity(), y.getSeverity());
            if (z == 0) {
                return Integer.compare(x.getArrivalTime(), y.getArrivalTime());
            }
            return z;
        });

        A.addAll(B);
        System.out.println(A);
    }
}
