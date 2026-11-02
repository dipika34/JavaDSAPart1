import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr= new int[n];
        for(int i=0; i < n;i++){
            arr[i] = scan.nextInt();
        }
        int target=scan.nextInt();
        for(int i=0;i<n-1;i++){
            if(arr[i]+arr[i+1]==target){
                System.out.println(i+","+(i+1));
            }
        }
    }
}
