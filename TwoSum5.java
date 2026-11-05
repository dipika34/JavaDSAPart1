import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = scan.nextInt();
            
        }
        int temp=0;
        int target = scan.nextInt();
        for(int i = 0; i < n-1; i++){
                if(arr[i]+arr[i+1]==target){
                   temp=1; 
                }
        }
        if(temp==1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
