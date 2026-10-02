import java.util.*;
public class arrayProgram13{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(arr[i]>max1){
                max3 = max2;
                max2 = max1;
                max1=arr[i];




            }else if(arr[i]>max2) {
                max2 = arr[i];
            }
            else if(arr[i]>max3){
              max3=arr[i];


            }
        }

        System.out.println("Third largest element in array"+max3);
        scan.close();
    }
}
