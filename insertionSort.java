import java.util.*;
public class program46{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements?");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements:");
        for(int i =0; i <size;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Before Sorting");
        for(int i = 0; i <  size; i++){
            System.out.println(arr[i]);
        }
        System.out.println("After sorting");
        array(arr,size);
        scan.close();

    }
    public static void InsertionSort(int[] arr,int size){
        for(int i = 1; i < size; i++){
            int c = arr[i];
            int p  = i-1;
            while(p>=0 && arr[p]>c){
                arr[p+1]=arr[p];
                p--;
            }
            arr[p+1]=c;
        }
    }
    public static void array(int[] arr,int size){
        InsertionSort(arr,size);
        for(int i=0; i < size;i++){
            System.out.println(arr[i]);
        }
    }
}
