package SRC.session4;

public class s4_ex3 {
    class transaction{
        private String maSach;
        private String ngayMuon;


        // contructor hàm khởi tạo
        public transaction(String masach,String ngaymuon){
            this.maSach = masach;
            this.ngayMuon = ngaymuon;
        }

        public StringBuilder output(){
            StringBuilder sb = new StringBuilder("");
            return sb.append(maSach+"-").append(ngayMuon);
        }
    }
    public static void main(String[] args) {
        s4_ex3 e = new s4_ex3();
        s4_ex3.transaction t1 = e.new transaction("b01", "20-01");
        s4_ex3.transaction t2 = e.new transaction("b02", "20-01");
        s4_ex3.transaction t3 = e.new transaction("b03", "20-01");
        System.out.println("Ngay muon sach");
        System.out.println("ngya giao dich: "+t1.output());
        System.out.println("ngya giao dich: "+t2.output());
        System.out.println("ngya giao dich: "+t3.output());
    }
}
