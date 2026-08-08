import java.util.*;
public class program51{
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("How many elements?");
      int size = scan.nextInt();
      int[] arr = new int[size];
      System.out.println("Enter the elements:");
      for(int i = 0;i<=size-1;i++){
          arr[i]=scan.nextInt();
      }
      int min = arr[0];

      for(int i = 0; i <= size-1; i++){
          if(arr[i]<min){
              min=arr[i];
          }
      }
      System.out.println("Smallest element "+min);

        
    scan.close();
    }

}
