import java.util.*;
public class program50{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements?");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements:");
        for(int i = 0; i<=size-1;i++){
            arr[i]=scan.nextInt();
        }
        int max1 = arr[0];
        int max2 = arr[0];
        for(int i = 0; i <= size-1; i++ ){
            if(arr[i]>max1){
                max1=arr[i];
            }
        }
        System.out.println("First largest "+max1);
        for(int i = 0; i<=size-1-1;i++){
        if(arr[i]>max2){
            max2=arr[i];
        }

        }
        System.out.println("Second largest "+max2);
        scan.close();
    }

}
