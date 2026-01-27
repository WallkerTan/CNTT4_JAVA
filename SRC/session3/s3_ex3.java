package SRC.session3;
import java.util.Scanner;


public class s3_ex3 {
    public void maxbook(String[] names, int[] quantities){
        int max = quantities[0];
        for(int i = 0; i < quantities.length; i++ ){
            if(quantities[i]>max) max = quantities[i];
        }
        System.out.println("so sach max");
        for(int i =0; i< quantities.length; i++){
            if(quantities[i] == max){
                System.out.printf("%s : %d\n",names[i],max);
            }
        }
    }
    public void minbook(String[] names, int[] quantities){
        int min = quantities[0];
        for(int i = 1; i < quantities.length; i++ ){
            if(quantities[i]<min) min = quantities[i];
        }
        System.out.println("so sach min");
        for(int i = 0; i< quantities.length; i++){
            if(quantities[i] == min){
                System.out.printf("%s : %d\n",names[i],min);
            }
        }
    }

    public static void main(String[] args) {
        String[] names = {
            "Lap trinh Java",
            "Cau truc du lieu",
            "Co so du lieu",
            "Mang may tinh",
            "AI co ban"
        };

        int[] quantities = {12, 5, 20, 3, 9};
        s3_ex3 e = new s3_ex3();
        e.maxbook(names, quantities);
        e.minbook(names, quantities);
    }    
}
