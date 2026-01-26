package BAI_TAP.session2;

import java.util.Scanner;

public class s2_ex6 {
    public void output() {
        Scanner sc = new Scanner(System.in);
        int max = 0, min = 0, average = 0, sum = 7;
        for (int i = 0; i < 7; i++) {
            int temp;
            if (i == 6) {
                System.out.printf("nhap luot muon ngay chu nhat: ");
            } else {
                System.out.printf("nhap luot muon ngay thu %d: ", i + 2);
            }
            temp = sc.nextInt();
            if (i == 0) {
                max = temp;
                min = temp;
            } else {
                max = max > temp ? max : temp;
                min = min < temp ? min : temp;
            }

            if (temp == 0){
                sum--;
                continue;
            }

            average += temp;
        }
        average = average/sum;
        System.out.println("ngay muon nhieu nhat: " + max);
        System.out.println("ngay muon it nhat: " + min);
        System.out.println("so sach trung binh: "+average);
    }

    public static void main(String[] args) {
        s2_ex6 e = new s2_ex6();
        e.output();
    }
}
