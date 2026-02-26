package SRC.session10;

import java.util.ArrayList;
import java.util.Collections;// làm việc vs danh sách
import java.util.Comparator;// so sánh 2 obj

class product{
    public String name;
    public String price;

    public product(String name,String price){
        this.name = name;
        this.price = price;
    }

    public void displayinfo(){
        System.out.printf("name: %s - price: %s\n",this.name,this.price);
    }
}

public class s10_ex6 {
    public static void main(String[] args) {
        ArrayList<product> A2 =  new ArrayList<>();

        A2.add(new product("laptop", "900003"));
        A2.add(new product("laptop2", "900002"));
        A2.add(new product("laptop3", "900001"));

        Collections.sort(A2, new Comparator<product>() {
            @Override
            public int compare(product p1,product p2){
                return Double.compare(Double.parseDouble(p1.price), Double.parseDouble(p2.price));
            }
        });

        System.out.println("sap sep tang dan");
        for(product p:A2){
            p.displayinfo();
        }

        // Lambda Expression
        Collections.sort(A2, (p1,p2) -> p1.name.compareTo(p2.name));
        
        System.out.println("sap sep giam dan A-Z");
        for(product p:A2){
            p.displayinfo();
        }
    }
}
