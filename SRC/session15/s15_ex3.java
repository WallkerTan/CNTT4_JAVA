package SRC.session15;

import java.util.Stack;

class MedicationProcessChecker {
    static Stack<String> A = new Stack<>();
    static int count = 0;

    public MedicationProcessChecker() {

    }

    public void addmedication(String name) {
        A.push(name);
        count++;
    }

    public void delete() {
        if (!A.empty()) {
            System.out.println("da phat thuoc" + A.pop());
        } else {
            System.out.println("khong co");
        }
    }

    public boolean checkProcess(String[] actions) {
        for (String s : actions) {
            switch (s.toLowerCase()) {
                case "pop":
                    String d = A.pop();
                    System.out.println("xoa: " + d);
                    break;
                case "push":
                    System.out.println("them thuoc-".concat(String.valueOf(count)));
                    A.push("thuoc-".concat(String.valueOf(count)));
                    count++;
                default:
                    continue;
            }
        }
        return A.empty() ? true : false;
    }
}

public class s15_ex3 {
    public static void main(String[] args) {
        MedicationProcessChecker m = new MedicationProcessChecker();
        String[] actions = {
                "PUSH",
                "PUSH",
                "POP",
                "POP"
        };
        
        if(m.checkProcess(actions)){
            System.out.println("quy tring dung");
        }else{
            System.out.println("quy tring sai");
        }
    }
}
