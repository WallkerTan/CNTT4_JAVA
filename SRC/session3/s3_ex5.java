package SRC.session3;

public class s3_ex5 {

    public void deleteBook(int[] A,int index){
        for(int i = index; i<A.length; i++){
            if(i == A.length - 1){
                A[i] = 0;
                continue;
            };
            A[i] = A[i+1]; 
        }
    }
    public void output(int[] A){
        for(int x:A){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        s3_ex5 e = new s3_ex5();
        int[] isbn = {9783, 1205, 4501, 9999, 3050, 1100};
        e.deleteBook(isbn, 0);
        e.output(isbn);
    }
}
