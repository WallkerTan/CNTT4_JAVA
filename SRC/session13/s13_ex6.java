package SRC.session13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Medicine {

    private String drugId;
    private String drugName;
    private double unitPrice;
    private int quantity;

    public Medicine(String drugId, String drugName, double unitPrice, int quantity){
        this.drugId = drugId;
        this.drugName = drugName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getDrugId(){
        return drugId;
    }

    public String getDrugName(){
        return drugName;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getTotal(){
        return unitPrice * quantity;
    }

}
public class s13_ex6 {

    static List<Medicine> list = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);


    // tìm thuốc theo id
    static Medicine findById(String id){

        for(Medicine m : list){

            if(m.getDrugId().equals(id)){
                return m;
            }

        }

        return null;

    }



    // thêm thuốc
    static void addMedicine(){

        System.out.print("Nhap ma: ");
        String id = sc.nextLine();

        Medicine m = findById(id);

        if(m != null){

            System.out.print("Nhap so luong them: ");
            int qty = Integer.parseInt(sc.nextLine());

            m.setQuantity(m.getQuantity() + qty);

        }

        else{

            System.out.print("Nhap ten: ");
            String name = sc.nextLine();

            System.out.print("Nhap gia: ");
            double price = Double.parseDouble(sc.nextLine());

            System.out.print("Nhap so luong: ");
            int qty = Integer.parseInt(sc.nextLine());

            list.add(new Medicine(id,name,price,qty));

        }

    }



    // chỉnh số lượng
    static void updateQuantity(){

        System.out.print("Nhap ma: ");
        String id = sc.nextLine();

        Medicine m = findById(id);

        if(m == null){
            System.out.println("Khong tim thay");
            return;
        }

        System.out.print("Nhap so luong moi: ");
        int qty = Integer.parseInt(sc.nextLine());

        if(qty == 0){

            list.remove(m);

        }

        else{

            m.setQuantity(qty);

        }

    }



    // xóa
    static void deleteMedicine(){

        System.out.print("Nhap ma: ");

        String id = sc.nextLine();

        Medicine m = findById(id);

        if(m != null){

            list.remove(m);

        }

    }



    // in hóa đơn
    static void printBill(){

        double sum = 0;

        System.out.println("Danh sach:");

        for(Medicine m : list){

            double total = m.getTotal();

            sum += total;

            System.out.printf("%s %s %.0f %d %.0f\n",
                    m.getDrugId(),
                    m.getDrugName(),
                    m.getUnitPrice(),
                    m.getQuantity(),
                    total);

        }

        System.out.println("Tong tien: " + sum);

        list.clear();

    }



    // tìm thuốc rẻ
    static void findCheap(){

        for(Medicine m : list){

            if(m.getUnitPrice() < 50000){

                System.out.println(m.getDrugName());

            }

        }

    }



    public static void main(String[] args) {

        while(true){

            System.out.println("\n1.Them");
            System.out.println("2.Sua");
            System.out.println("3.Xoa");
            System.out.println("4.In");
            System.out.println("5.Tim re");
            System.out.println("6.Thoat");

            int choice = Integer.parseInt(sc.nextLine());

            switch(choice){

                case 1: addMedicine(); break;

                case 2: updateQuantity(); break;

                case 3: deleteMedicine(); break;

                case 4: printBill(); break;

                case 5: findCheap(); break;

                case 6: return;

            }

        }

    }

}