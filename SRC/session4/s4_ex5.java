package SRC.session4;

import java.util.regex.*;

public class s4_ex5 {
    public void output(String str) {
        String regex = "^(\\d{4}-\\d{2}-\\d{2})\\s*\\|\\s*User:\\s*([A-Za-z]+)\\s*\\|\\s*Action:\\s*(BORROW|RETURN)\\s*\\|\\s*BookID:\\s*([A-Z]{2}\\d{5})$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);

        if (m.matches()) {
            System.out.println("Ngay: " + m.group(1));
            System.out.println("Nguoi dung: " + m.group(2));
            System.out.println("Hanh dong: " + m.group(3));
            System.out.println("Ma sach: " + m.group(4));
        } else {
            System.out.println("Chuoi khong hop le");
        }
    }

    public static void main(String[] args) {
        String str = "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345";
        s4_ex5 e = new s4_ex5();
        e.output(str);
    }
}
