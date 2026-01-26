package SRC.session1;
import java.util.Scanner;

public class ex1 {
    String bookID;
    String bookName;
    int publishYear;
    double price;
    boolean isAvailable;

    // nhập
    public void input(){
        // tạo máy nhập
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập ID: ");
        bookID = sc.nextLine();

        System.out.println("Tên sách: ");
        bookName  = sc.nextLine();

        System.out.println("Nhập năm: ");
        publishYear = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập giá: ");
        price = Double.parseDouble(sc.nextLine());

        System.out.println("status: ");
        isAvailable = Boolean.parseBoolean(sc.nextLine());
        sc.close();
    }

    public void output(){
        System.out.printf("ID: %s\n",bookID);
        System.out.printf("Name: %s\n",bookName);
        System.out.printf("Year: %d\n", publishYear);
        System.out.printf("Price: %.2f\n", price);
        System.out.printf("Status: %b\n",isAvailable);
    }

    public static void main(String[] args){
       ex1 o = new ex1();

       o.input();
       o.output();

    }
}
