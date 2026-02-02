package SRC.session7;

import java.util.ArrayList;

public class UserManager {

    // "Co so du lieu gia lap" trong bo nho
    public static ArrayList<User> users = new ArrayList<>();

    // Them user
    public static void addUser(User u) {
        users.add(u);
    }

    // Kiem tra dang nhap
    public static boolean checkLogin(String username, String password) {
        for (User u : users) {
            if (u.username.equals(username) && u.password.equals(password)) {
                return true;
            }
        }
        return false;
    }

    // In danh sach user
    public static void showUsers() {
        int i = 1;
        for (User u : users) {
            System.out.println(i + ". " + u);
            i++;
        }
    }
}
