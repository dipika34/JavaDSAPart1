public class sumn{
    public static void main(String[] args){
        int SUM = add(5);
        System.out.println(SUM);

    }
    public static int add(int n){
        if(n==1){
            return 1;
        }
        int sum = n + add(n-1);
        return sum;
    }
}
