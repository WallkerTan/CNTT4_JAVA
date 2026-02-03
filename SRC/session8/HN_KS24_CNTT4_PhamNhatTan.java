package SRC.session8;
import java.util.Scanner;


public class HN_KS24_CNTT4_PhamNhatTan {

        static class student{
        private String id;
        private String name;
        private double score;

        public student(String id,String name, double score){
            this.id = id;
            this.name = name;
            this.score = score;
        }

        public student(){
            this.id = "sv0000";
            this.name = "errol";
            this.score = 0.0;
        }

        public String getID(){
            return this.id;
        }
        public String getNAME(){
            return this.name;
        }
        public double getSCORE(){
            return this.score;
        }
        
        public void setID(String id){
            this.id = id;
        }
        public void setNAME(String name){
            this.name = name;
        }
        public void setSCORE(double score){
            this.score = score;
        }

        public StringBuilder getRank(){
            double z = this.score;
            StringBuilder sb = new StringBuilder(this.id+" "+this.name+" diem: "+this.score+" hoc luc: ");
            if(z>=8){
                return sb.append("gioi");
            }else if(z < 8 && z >= 6.5){
                return sb.append("kha");
            }else{
                return sb.append("trung binh");
            }
        }
    }

    public void menu(){
        System.out.println("QUAN LY ĐIEM SINH VIEN");
        System.out.println("1: Nhap ds sinh vien");
        System.out.println("2: Hien thi danh sach sinh vien");
        System.out.println("3: Tim kiem sinh vien");
        System.out.println("4: Sap sep sinh vien (hoc luc)");
    }

    public student insutdent(Scanner sc){
    sc.nextLine();
    System.out.print("Nhap ID: ");
    String id = sc.nextLine();

    System.out.print("Nhap ten: ");
    String name = sc.nextLine();

    System.out.print("Nhap diem: ");
    double score = sc.nextDouble();

    return new student(id, name, score);
}


    public student[] inclass(Scanner sc){
        int n;
        n = sc.nextInt();
        student[] temp = new student[n];
        for(int i = 0; i < n; i++){
            temp[i] = insutdent(sc);
        }
        return temp;
    }

    public static void main(String[] args) {
        HN_KS24_CNTT4_PhamNhatTan e = new HN_KS24_CNTT4_PhamNhatTan();
        Scanner sc = new Scanner(System.in);
        student[] z = null;
        boolean isloop = true;
        while (isloop) {
            e.menu();
            int choice;
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("ban da ket thuc truong trinh");
                    isloop = false;
                    break;
                case 1:
                    z = e.inclass(sc);
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}