import java.util.*;
public class factorial1{
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter a number:");
        int a  = scan.nextInt();
        System.out.println("Factorial of "+a+" is "+fact(a));
        scan.close();
    }
    public static int fact(int a){
        if(a==1){
            return 1;

        }
        int r = a*fact(a-1);
        return r;

    }
}
