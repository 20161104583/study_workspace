package Class01;

public class Code_PrintB {
    public  static void print(int num){
        for (int i=31;i>=0;i--){
            System.out.print((num & (1<<i))==0 ? "0" :"1");
        }
        System.out.println();
    }
    public static void main(String[] args){
//        int num=4;
        int num =-1;
        print(num);
    }
}
