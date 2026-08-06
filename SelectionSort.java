import java.util.Scanner;
public class program44{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("How many elements?");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements :");
        for(int i = 0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Before Sorting : ");
        for(int i = 0;i < size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nAfter Sorting : ");
        array(arr,size);
        scan.close();
    }
    public static void selectionSort(int[] arr,int size){
        for(int i = 0; i <size;i++){
            int smallest = i;
            for(int j=  i+1;j<size;j++){
                if(arr[j]<arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i] = temp;
        }
    }
    public static void array(int[] arr,int size){
        selectionSort(arr,size);
        System.out.println();
        for(int i = 0; i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
