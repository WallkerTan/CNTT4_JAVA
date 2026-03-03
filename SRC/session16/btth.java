package SRC.session16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

interface IRepository<T> {

    boolean add(T p);// thêm phan tu vao danh sach
    boolean removeById(int id); // xóa phan tu khoi danh sach
    T findByid(int id);// tim theo ma
    List<T> findAll(); // lay toan bo danh sach
}

abstract class Product {
    private int id;
    protected String name;
    protected String price;
    static int countid = 0;
    public Product(String name, String price){
        if(name==null || name.trim().isEmpty()){
            System.out.println("ten ko duoc de trong");
            return;
        }
        if(price==null||price.trim().isEmpty()){
            System.out.println("gia khong duoc de trong");
            return;
        }
        this.name = name;
        this.price = price;
        this.id = ++countid;
    }
    public int getid(){
        return this.id;
    }
    abstract double calculateFinalPrice(); // tinh gia tri that

    public void displayInfo(){
        System.out.printf("id: %d  |  name: %s  |  price: %s\n",this.id,this.name,this.price);
    }
}
class ElectronicProduct extends Product {

    private int warrantyMonths; // so thang bao hanh

    public ElectronicProduct(String name, String price, int warrantyMonths) {
        super(name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double calculateFinalPrice() {
        double temp = Double.parseDouble(this.price);

        if (warrantyMonths > 12) {
            return temp + 1000000;
        }
        return temp;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("bao hanh: " + warrantyMonths + " thang");
    }
}

class FoodProduct extends Product {

    private int discountPercent;// phan tram giam gia
    public FoodProduct(String name,String price,int discountPercent){
        super(name, price);
        this.discountPercent = discountPercent;
    }
    @Override
    public double calculateFinalPrice(){
        double temp = Double.parseDouble(this.price);
        return temp-(temp*this.discountPercent/100);
    }
    @Override
    public void displayInfo(){
        System.out.println("giam "+discountPercent+"%");
    }
    
}

class ProductRepository implements IRepository<Product>{
    static List<Product> ListP = new ArrayList<>();
    static Map<String,Product> A = new HashMap<>();
    
    public ProductRepository(){  
        for(Product x:ListP){
            A.put(Integer.toString(x.getid()), x);
        };
    }

    public boolean add(Product p){
        if(p!=null){
            ListP.add(p);
            A.put(Integer.toString(p.getid()), p);
            System.out.println("them phan tu moi thanh cong");
            return true;
        }
        return false;
    }
    public boolean removeById(int id){
        if(A.containsKey(Integer.toString(id))){
            A.remove(Integer.toString(id));
            ListP.removeIf(x->x.getid()==id);
            System.out.println("xoa thanh cong");
            return true;
        }else{
            return false;
        }
    }

    public Product findByid(int id){
        String z = Integer.toString(id);
        if(A.containsKey(z)){
            return A.get(z);
        }
        return null;
    }

    public List<Product> findAll(){
        return ListP;
    }

}

public class btth {

    static void menu(){
        System.out.println("1: xem");
        System.out.println("2: tim kiem id");
        System.out.println("3: sap sep");
        System.out.println("4: Thong ke so luong tung loai");
        System.out.println("5: them san pham dien tu");
        System.out.println("6: them do an");
        System.out.printf("-> ");
    }

    static void findID(Scanner sc,ProductRepository PR){
        System.out.printf("nhap id: ");
        int id = sc.nextInt();
        sc.nextLine();
        if(PR.findByid(id)!=null){
            PR.findByid(id).displayInfo();
        }
    }
    
    static ElectronicProduct createE(Scanner sc){
        System.out.println("nhap ten ");
        String name = sc.nextLine();
        System.out.println("nhap gia");
        String price = sc.nextLine();
        System.out.println("thang bao hanh");
        int t = sc.nextInt();
        sc.nextLine();
        return new ElectronicProduct(name, price, t);
    }

    static FoodProduct createF(Scanner sc){
        System.out.println("nhap ten ");
        String name = sc.nextLine();
        System.out.println("nhap gia");
        String price = sc.nextLine();
        System.out.println("ưu dai");
        int t = sc.nextInt();
        sc.nextLine();
        return new FoodProduct(name, price, t);
    }

    static void statistics(ProductRepository PR){
        Map<String,Integer> A = new HashMap<>();
        for (Product p : PR.ListP) {
            String type = p.getClass().getName();
            A.put(type,A.getOrDefault(type, 0)+1);
        }
        for(Map.Entry<String,Integer> x:A.entrySet()){
            System.out.println(x.getKey()+": "+x.getValue());
        }
    }

    static ProductRepository sort(boolean type,ProductRepository PR){
        Collections.sort(PR.ListP, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2){
                int temp =  type?Integer.compare(p1.getid(), p2.getid()):Integer.compare(p2.getid(), p1.getid());
                if(temp == 0){
                    return p1.name.compareTo(p2.name);
                }
                return temp;
            }
        });
        return PR;

    }
    public static void main(String[] args) {
        boolean loop = true;
        ProductRepository PR = new ProductRepository();
        Scanner sc = new Scanner(System.in);
        while (loop) {
            menu();
            int choice;
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    for (Product x : PR.findAll()) {
                        x.displayInfo();
                    }
                    break;
                case 2:
                    findID(sc, PR);
                    break;
                case 3:
                    boolean t = true;
                    PR = sort(t, PR);
                    break;
                case 4:
                    statistics(PR);
                    break;
                case 5:
                    PR.add(createE(sc));
                    break;
                case 6:
                    PR.add(createF(sc));
                    break;
                default:
                    System.out.println(" ban da thoat chuong tring");
                    loop = false;
                    break;
            }
        }
    }
}
