package SRC.session11;

import java.sql.Driver;

interface IMixable {
    void mix();
}

abstract class Drink {
    protected int id;
    protected String name;
    protected String price;
    static int maxid = 0;

    public Drink(String name, String price) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Ten khong hop le");
            return;
        }
        this.name = name;
        if (price == null || price.trim().isEmpty()) {
            System.out.println("gia khong hop le");
        }
        long temp = Long.parseLong(price);
        if (temp < 0) {
            System.out.println("gia phai lon hon 0vnd");
            return;
        }
        this.price=price;
        this.id = ++maxid;
    }

    abstract double calculatePrice();
    abstract void displayInfo();
}

class Coffee extends Drink{
    private boolean hasMilk;
    public Coffee(boolean hasMilk,String name,String price){
        super(name, price);
        this.hasMilk = hasMilk;
    }
    @Override
    public double calculatePrice(){
        return hasMilk?Double.parseDouble(super.price)+5000:Double.parseDouble(super.price);
    }
    @Override
    public void displayInfo(){
        System.out.printf("id: %d\nname: %s\nprice: %s\nloai: %s\n",super.id,super.name,super.price,hasMilk?"den da":"sua");
    }
}

class FruitJuice extends Drink implements IMixable{
    private int discountPercent; // % gia
    public FruitJuice(int discountPercent,String name,String price){
        super(name, price);
        if(discountPercent>=0 && discountPercent<=100){
            this.discountPercent = discountPercent;
        }else{
            System.out.println("khong hop le");
            return;
        }
    }
    @Override
    public double calculatePrice(){
        double temp = Double.parseDouble(super.price);
        return temp - (temp*this.discountPercent/100);
    }
    @Override
    public void displayInfo(){
        System.out.printf("id: %d\nname: %s\nprice: %s\ngiamgia: %d\n",super.id,super.name,super.price,this.discountPercent);
    }
    public void mix(){
        System.out.println("dang pha che do uong.");
    }
}

public class btth_s11 {
    public static void main(String[] args) {
        Drink[] menu = new Drink[3];
        menu[0] = new Coffee(true, "bac siu", "30000");
        menu[1] = new FruitJuice(20,"Nuoc cam","40000");
        for(Drink x:menu){
            if(x==null){
                continue;
            }
            x.displayInfo();
        }
    }
}
