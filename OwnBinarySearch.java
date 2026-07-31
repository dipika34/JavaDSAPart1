import java.util.*;
public class program21{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements?");
        int n = scanner.nextInt();
        int[] train = new int[n];
        int temp = 0;//zero means false
        System.out.println("Enter the number of elements in the array:");
        int left = 0;
        int right = n - 1;
        int i = left;
        int j = right;
        /*after storing the start index or the left variable and the last index or the final variable stored into the other variable
        the program executes*/
        int middle = 0;
        for(i = 0; i <= j; i++){
            train[i] = scanner.nextInt();
        }

        System.out.println("Enter the element you want to search : ");
        int target = scanner.nextInt();

        while(left <= right){
             middle = (left + right)/2;
            if(target == train[middle]){
                temp = 1;//one means if the condition is true
                break;
            }else if(target < train[middle]){
                right = middle - 1;
            }else if(target > train[middle]){
                left = middle + 1;
            }

        }
        if(temp == 1){
            System.out.println("It is found");
        }else{
            System.out.println("It is not found");
        }
        scanner.close();
    }
}
