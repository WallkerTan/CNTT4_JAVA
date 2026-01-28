package SRC.session4;

import java.util.Scanner;

public class s4_ex2 {

    public void output(String str) {
        System.out.println(str.length());
        StringBuilder sb = new StringBuilder("");
        int z = str.indexOf("ke:");
        if (z == -1 || z + 3 >= str.trim().length()) {
            System.out.println("Khong tim thay ke sach");
            return;
        }
        sb.append(str.substring(0, z) + " vi tri luu tru:");
        String temp = str.substring(z + 3);
        int t = temp.indexOf(",");
        if (t == -1) {
            t = temp.length();
        }
        String adress = temp.substring(0, t).trim();
        sb.append(temp);
        if (adress.equals(""))
            System.out.println("ke: " + adress);
        System.out.println(sb);

    }

    public static void main(String[] args) {
        String str = "Sach tu tien vi dien dau khi dai luc: ke: 1";
        s4_ex2 e = new s4_ex2();
        e.output(str);
    }
}
