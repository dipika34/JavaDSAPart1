import java.util.*;

public class alterElement{
    public static void main(String[] args){
        Scanner sc  =  new Scanner(System.in);
        System.out.println("How many elements ? ");
        int n;
        n = sc.nextInt();
        int[] train =  new int[n];
        for(int i = 0; i <= n -1; i++){
            train[i] = sc.nextInt();
        }
        System.out.println("Using linear search approach");
        int target;
        int temp = 0;
        System.out.println("The element is changed to");
        target = sc.nextInt();
        for(int i = 0; i <= n - 1; i++){
            if(train[i]==target){
                target = 20;
                train[i] = target;

            }
            System.out.println(train[i]);
        }

    }
}
