import java.util.Scanner;
public class arrayProgram10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.println("Swapping elements");
        for(int i = 0; i < 5; i++){
            int temp = arr[0];
            arr[0] = arr[5-1];
            arr[5-1]=temp;
            System.out.println(arr[i]);

        }
         sc.close();



        }

    }
