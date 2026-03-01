package SRC.session6;

class Studentz {
    private String name;
    private String passWord;

    public Studentz(String name,String pasWord){
        if(name == null || name.trim().isEmpty()){
            System.out.println("ten khong hop le!!");
            return;
        }
        this.name = name;
        if(pasWord == null || pasWord.trim().isEmpty()){
            System.out.println("mk ko hop le!!");
            return;
        }
        this.passWord =pasWord; 
    }

    public String getName() {
        return name;
    }
    public String getpasword(){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < this.passWord.length(); i++){
            sb.append("*");
        }
        return sb.toString();
    }
}


public class s6_ex6 {
    public static void main(String[] args) {
        Studentz st1  = new Studentz("", "1234567");
        System.out.println(st1.getName());
        System.out.println(st1.getpasword());
        
    }
}