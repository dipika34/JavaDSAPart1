import java.util.*;
public class Sum{
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the number: ");
      int n = scan.nextInt();
      System.out.print("Sum of "+n+" is "+_sum(n));
      scan.close();
    }
    public static int _sum(int n){
        if(n==1){
            return 1;
        }
        int s =n + _sum(n-1);
        return s;
    }
}
