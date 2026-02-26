package SRC.ontap;

import java.util.Scanner;

public class BTOT {

    String fullName(String str) {
        StringBuilder sb = new StringBuilder("");
        boolean check = true;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (check) {
                    sb.append(Character.toUpperCase(str.charAt(i)));
                    check = false;
                } else {
                    sb.append(Character.toLowerCase(str.charAt(i)));
                }
            }

            if (Character.isWhitespace(str.charAt(i))) {
                sb.append(str.charAt(i));
                check = true;
            }
        }
        return sb.toString();
    }

    void getone(String str) {
        long[] count = new long[65536];
        boolean temp = false;
        for (char x : str.toCharArray()) {
            count[x]++;
        }
        for (char x : str.toCharArray()) {
            if (count[x] == 1) {
                temp = true;
                System.out.printf("ki tu xuat hien dung 1 lan: %c\n", x);
            }
        }
        if (!temp)
            System.out.println("ko co ki tu nao doc nhat");
    }

    public static void main(String[] args) {
        BTOT e = new BTOT();

        String str;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao mot chuoi bat ki: ");
        str = sc.nextLine();
        System.out.println(e.fullName(str));
        e.getone(str);
    }
}
