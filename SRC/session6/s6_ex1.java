package SRC.session6;


public class s6_ex1 {

    class student {
        private String msv;
        private String name;
        private int year;
        private float score;

        public student(String msv,String name,int year,float score){
            this.msv = msv;
            this.name = name;
            this.score = score;
            this.year = year;
        }
        public String getmsv(){
            return this.msv;
        }
        public String getname(){
            return this.name;
        }
        public int getyear(){
            return this.year;
        }
        public float getscore(){
            return this.score;
        }
        
    }
    public static void main(String[] args) {
        s6_ex1 e = new s6_ex1();
        s6_ex1.student sv1 = e.new student("SV001", "Tan", 1, 9.2f);
        s6_ex1.student sv2 = e.new student("SV002", "Nam", 2, 8.5f);
        System.out.println("Sinh vien 1:");
        System.out.println("MSV: " + sv1.getmsv());
        System.out.println("Ten: " + sv1.getname());
        System.out.println("Nam hoc: " + sv1.getyear());
        System.out.println("Diem: " + sv1.getscore());

        System.out.println();

        System.out.println("Sinh vien 2:");
        System.out.println("MSV: " + sv2.getmsv());
        System.out.println("Ten: " + sv2.getname());
        System.out.println("Nam hoc: " + sv2.getyear());
        System.out.println("Diem: " + sv2.getscore());
    }    
}
