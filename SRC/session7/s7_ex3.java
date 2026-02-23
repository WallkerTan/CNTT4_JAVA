package SRC.session7;

import java.util.ArrayList;

class User {
    private int id;
    private String userName;
    private String passWord;
    private static int count = 0;

    public User(String userName, String passWord){
        // auto increment
        this.id = this.count++;

        if(userName == null || userName.trim().isEmpty()){
            System.out.println("ten cua may khong hop le");
            return;
        }
        this.userName = userName;

        if(passWord == null || passWord.trim().isEmpty()){
            System.out.println("pass may nhu dau buoi");
            return;
        }

        this.passWord = passWord;
    } 
    public void show(){
        System.out.println(this.userName);
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i< this.passWord.length(); i++){
            sb.append("*");
        }
        System.out.println(sb.toString());
    } 
    public int number(){
        return this.count;
    }
}

class userManenger {
    private static ArrayList<User> user = new ArrayList<>();


    // thêm user
    public void add(User temp){
        user.add(temp);
    }
    // kiem tra đăng nhập
    public boolean check(String name, String password){
        for(User u : user){
            if(u.equals(password) && u.equals(name)){
                return true;
            }
        }
        return false;
    }
    // hien thị mây thg trong lop

    public void showclass(){
        for(User u : user){
            u.show();
        }
    }
}

public class s7_ex3 {

    public static void main(String[] args) {
        userManenger cl1 = new userManenger();
        User temp = new User("temp", "?????????");
        cl1.add(new User("tan", "12345678"));
        cl1.add(new User("tan2", "12345678"));
        cl1.add(new User("tan2", "12345678"));
        cl1.add(new User("tan2", "12345678"));
        cl1.showclass();
        System.out.println(temp.number());
    }
}