package SRC.session9;

public class s9_ex4 {
    public static void main(String[] args) {
        animal animal = new dog();
        animal.sound();
        // animal.separate(); lỗi compiler

        if(animal instanceof dog){
            dog temp = (dog) animal;
            temp.separate();
        }
        
    }
}
