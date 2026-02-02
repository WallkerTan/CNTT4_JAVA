package SRC.session6;


public class s6_ex2{
    class Account{  
        private String username;
        private String password;
        private String email;


        public Account(String email,String password,String username){
            this.email = email;
            this.username = username;
            this.password = password;
        }

        public void resetPasword(String newPAss){
            this.password = newPAss;
        }
        public void showInfo(){
            System.out.println("username: "+this.username);
            System.out.println("password: "+this.password);
            System.out.println("email: "+this.email);
        }
    }

    public static void main(String[] args) {
        s6_ex2 e = new s6_ex2();
        s6_ex2.Account ac1 = e.new Account("tan@gmail.com", "123456789", "tan dz");
        ac1.showInfo();
        ac1.resetPasword("12345654321");
        ac1.showInfo();

    }
}