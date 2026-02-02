package SRC.session7;

public class s7_ex5 {

    // ===== LOP CONFIG =====
    static class Config {
        // HANG SO: dung chung + khong thay doi
        public static final double MAX_SCORE = 10.0;
        public static final double MIN_SCORE = 0.0;
    }

    public static void main(String[] args) {

        double score = 8.5;

        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Diem hop le: " + score);
        } else {
            System.out.println("Diem KHONG hop le!");
        }

    }
}
