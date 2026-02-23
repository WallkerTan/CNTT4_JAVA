package SRC.session9;

class employee{
    protected String name;
    protected String wage;
    public employee(String name,String wage){
        this.name = name;
        this.wage = wage;
    }
    public void info(){}
}

class manager extends employee{
    public manager(String name,String wage){
        super(name, wage);
    }
    @Override
    public void info(){
        System.out.println("name: "+super.name);
        System.out.printf("wage: %s\n",super.wage);
    }
}


public class s9_ex3 {
    public static void main(String[] args) {
        employee nv = new manager("tan", "12345");
        nv.info();
    }
}
