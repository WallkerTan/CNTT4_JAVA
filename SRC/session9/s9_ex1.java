package SRC.session9;


class person {
    protected String name;
    protected int age;

    public person(String name, int age){
        if(name==null || name.trim().isEmpty()){
            System.out.println("khong hop le");
            return;
        }
        if(age<=0){
            System.out.println("khong hop  le");
            return;
        }
        this.name = name;
        this.age = age;
    }

    public void info(){
    }
}

class student extends person {
    private String msv;
    private float score;
    public student(String name,int age,String msv,float score){
            super(name, age);
            this.msv = msv;
            this.score = score;
    }
    @Override
    public void info(){
        System.out.printf("name: %s\n",this.name);
        System.out.printf("age: %d\n",this.age);
        System.out.printf("msv: %s\n",this.msv);
        System.out.printf("score: %.2f\n",this.score);
    }

}


public class s9_ex1 {

    public static void main(String[] args) {
        student st1 = new student("tan", 1, "123456", 1);
        st1.info();
    
    }

}
