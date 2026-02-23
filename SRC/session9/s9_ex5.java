package SRC.session9;

abstract class employee5 {
    protected String name;

    public employee5(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class officeEmployee extends employee5{
    private double baseSalari;
    static int count = 0;

    public officeEmployee(String name,double baseSalari){
        super(name);
        this.baseSalari = baseSalari;  
        this.count+=1;
    }
    @Override
    public double calculateSalary(){
        return this.baseSalari;
    }
    public double qlt(){
        return this.count;
    }
}

class ProductionEmployee extends employee5{
    private int numOfProducts;
    private double price;
    static int count = 0;
    public ProductionEmployee(String name,int numOfProducts,double price){
        super(name);
        this.numOfProducts = numOfProducts;
        this.price = price;
        count+=1;
    }
    @Override
    public double calculateSalary(){
        return this.numOfProducts*this.price;
    }

    public double qlt(){
        return this.count;
    }
}

public class s9_ex5 {
    public static void main(String[] args) {
        employee5 e1 = new ProductionEmployee("tan", 1, 1000);
        employee5 e2 = new officeEmployee("tu", 10000);
        e1.display();
        e2.display();
    }
}
