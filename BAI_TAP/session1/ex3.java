package BAI_TAP.session1;

public class ex3 {
    String book1 = "one";
    String book2 = "two";

    public void befor(){
        System.out.printf("Truoc khi hoan doi: b1 = %s, b2 = %s\n",book1,book2);
    }
    public void after(){
        String temp = book1;
        book1 = book2;
        book2 = temp;
        System.out.printf("Sau khi hoan doi: b1 = %s, b2 = %s\n",book1,book2);
    }
    public static void main(String[] args){
        ex3 e = new ex3();
        e.befor();
        e.after();
    }
}
