import java.util.*;
public class program40{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements in the array?");
        int size  = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in the array:");
        for(int i = 0;i <= size-1;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Before sorting");
        for(int i = 0; i <=size-1;i++){
            System.out.println(arr[i]);
        }
        System.out.println("After sorting:");
        BubbleSort(arr,size);
        array(arr,size);
        scan.close();
    }
    public static void BubbleSort(int[] arr,int size){
        int temp = 0;
        for(int i = 0; i <= size-1; i++){
            for(int j = 0;j <size-1; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];//to allocate
                    arr[j+1]=arr[j];//to push the largest element at the right 
                    arr[j]=temp;//to push the smallest at the left by own
                }
            }
        }
    }
    public static void array(int[] arr,int size){
        BubbleSort(arr,size);
        for(int i = 0; i <= size-1; i++){
            System.out.println(arr[i]);
        }
    }
}
