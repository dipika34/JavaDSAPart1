import java.util.Scanner;
public class program42{
    public static void main(String[] args){
        System.out.println("Bubble sort in java");
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements?");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements:");
        for(int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Before sorting:");
        for(int i = 0; i <  size; i++){
            System.out.println(arr[i]);
        }
        System.out.println("After sorting in descending order:");
        array(arr,size);
        scan.close();


    }
    public static void bubbleSort(int[] arr,int size){
        int temp=  0;
        for(int i  = 0 ; i < size; i++){
            for(int j =  0; j < size-i-1; j++){
                if(arr[j+1]>arr[j]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void array(int[] arr,int size){
        bubbleSort(arr,size);
        for(int i = 0; i < size;i++){
            System.out.println(arr[i]);
        }
    }
}
