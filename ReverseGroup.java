import java.util.*;
public class arrayProgram15{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i <= n-1; i++){
            arr[i] = scan.nextInt();

        }
        int k = scan.nextInt();
        int length = arr.length-k+1;
        for(int i = length-1;i >= 0; i--){
            System.out.print(arr[i]+" ");

        }
        for(int i = arr.length-1; i>=0; i--){

            if(i==2){
                break;
            }
            System.out.print(arr[i]+" ");
        }
        scan.close();



    }
}
