import java.util.*;
public class program7{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many element?");
        int n;
        n = scanner.nextInt();
        int[] train = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i <= n - 1; i++){
            train[i] = scanner.nextInt();
        }

        int m = 1;
        for(int i = 0; i <= n -1; i++){
            m*=train[i];
        }
        System.out.println("multiplication of 10 elements : "+m);
        scanner.close();
    }
}
