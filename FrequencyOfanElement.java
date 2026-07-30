import java.util.*;
public class program13{
    public static void main(String[] args){
        Scanner src = new Scanner (System.in);
        System.out.println("How many elements?");
        int n;
        n = src.nextInt();
        int[] train = new int[n];
        for(int i = 0; i <= n - 1;i++){
            train[i] = src.nextInt();
        }
        System.out.println("Enter the element you want to find the frequency");
        int num = src.nextInt();
        int count = 0;
        for(int i = 0; i <= n - 1; i++){
            if(train[i] == num){
                count++;
            }
        }
        System.out.println("Frequency of an element in an array is "+ num + " "+ count );
        src.close();
    }
}
