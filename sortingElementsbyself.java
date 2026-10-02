import java.util.function.DoubleToIntFunction;

public class arrayProgram16 {
   public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        display(arr);




        }

    public static void sort(int[] arr){
       int temp = 0;
       for(int i = 0; i < 5; i++){
           for(int j =0; j< 5-i-1;j++){
               if(arr[j]>arr[j+1]){
                   temp = arr[j+1];
                   arr[j+1]=arr[j];
                   arr[j]=temp;
               }
           }
       }
    }
    public static void display(int[] arr) {
        sort(arr);
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
    }

