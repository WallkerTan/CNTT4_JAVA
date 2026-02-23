package SRC.session9;
class animal {
    public void sound(){
        System.out.println("viem de pham tan");
    }
}

class dog extends animal {
    @Override
    public void sound(){
        System.out.println("gau gau");
    }
    public void separate(){
        System.out.println("m la 1 con cho");
    }
}
class cat extends animal {
    @Override
    public void sound(){
        System.out.println("meo meo");
    }
}
public class s9_ex2 {
    public static void main(String[] args) {
        animal d = new dog();
        animal c = new cat();
        d.sound();
        c.sound();
    }
}
