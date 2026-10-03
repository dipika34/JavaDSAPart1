import java.util.*;
public class Loop1{
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scan.nextInt();
        System.out.println("Loop from "+a+" to 1");
        System.out.println(loop(a));
        scan.close();

        }

    public static int loop(int a){
        if(a==1){
            return 1;
        }
        System.out.println(a);
        return loop(a-1);


    }
}
