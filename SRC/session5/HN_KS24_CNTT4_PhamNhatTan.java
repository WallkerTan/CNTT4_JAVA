package SRC.session5;
import java.util.Scanner;
import java.util.regex.*;

public class HN_KS24_CNTT4_PhamNhatTan {

    public static void showMenu() {
        System.out.println("=================================");
        System.out.println("1. Them moi sinh vien");
        System.out.println("2. Hien thi danh sach sinh vien");
        System.out.println("3. Xoa sinh vien theo MSSV");
        System.out.println("4. Tim kiem sinh vien");
        System.out.println("0. Thoat chuong trinh");
        System.out.println("=================================");
        System.out.print("Chon chuc nang: ");
    }

    public static String nhapChuoi(Scanner sc) {
        return sc.nextLine().trim();
    }


    public void output(String[] arr,int size){
        if(size == 0){
            System.out.println("ko co sv nao!");
        }
        for(int i=0; i<size;i++){
            System.out.printf("%s\n",arr[i]);
        }
    }

    public static int nhapSo(Scanner sc) {
        int x;
        while (true) {
            try {
                x = Integer.parseInt(sc.nextLine());
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai! Vui long nhap so nguyen.");
            }
        }
    }


    public boolean msvVaidate(String str){
        String regex = "^B[0-9]{7}$";
        return str.matches(regex);
    }


    public int addStudent(String[] arr,int size,Scanner sc){
        System.out.println("Nhap Ma Sinh Vien");
        String msv = nhapChuoi(sc);
        if(msvVaidate(msv)){
            arr[size] = msv;
            size+=1;
        }else{
            System.out.println("msv khong hop le.");
        }
        return size;
    }
    public int findIndex(String[] arr, int size, String msv){
        for (int i = 0; i < size; i++) {
            if (arr[i].equalsIgnoreCase(msv)) {
                return i;
            }
        }
        return -1;
    }

    public int deleteStudent(String[] arr, int size, String msv) {
        int z = findIndex(arr, size, msv);
        if(z!=-1){
            for(int i = z; i<size-1; i++){
                arr[i] = arr[i+1];
            }
            size-=1;
        }else{
            System.out.println("khong tim thay sinh vien");
        }
        return size;
    }

    public static void main(String[] args) {
        HN_KS24_CNTT4_PhamNhatTan e = new HN_KS24_CNTT4_PhamNhatTan();
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[100];
        int size = 0;
        while (check) {
            e.showMenu();
            int choice;
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Bạn da thoat truong trinh");
                    check = false;
                    break;
                case 1:
                    size = e.addStudent(arr, size,sc);
                    break;
                case 2:
                    e.output(arr, size);
                    break;
                case 3:
                    size = e.deleteStudent(arr, size, "B1234567");
                    break;
                default:
                    break;
            }

        }
        sc.close();
    }
}
