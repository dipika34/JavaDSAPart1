import java.util.*;
public class arrayProgram12{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Swapped array Elements");
        for(int i = 0; i < n; i++){
            int temp = arr[0];
            arr[0] = arr[n-1];
            arr[n-1]=temp;
            System.out.println(arr[i]);
        }
        scan.close();
    }
}
