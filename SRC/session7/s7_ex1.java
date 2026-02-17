package SRC.session7;

class student {
    private int id;
    private String name;
    static int total = 0;

    public student(int id, String name) {
        this.id = id;
        this.name = name;
        total++;
    }

    public void getInfo() {
        System.out.println("id: " + this.id);
        System.out.println("name: " + this.name);
    }

    public int getCount() {
        return student.total;
    }
}

public class s7_ex1 {
    public static void main(String[] args) {
        student s1 = new student(1, "tan1");
        student s2 = new student(2, "tan2");
        student s3 = new student(3, "tan3");
        s1.getInfo();
        s2.getInfo();
        s3.getInfo();
        System.out.println("so lg sv: "+s1.getCount());
    }
}