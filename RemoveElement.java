import java.util.*;
public class program37{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements are there in the array?");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int index = 0;
        int temp =0;
        System.out.println("Enter the elements in the array:");
        for(int i = 0; i <= n-1;i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the element you want to search:");
        int target = scanner.nextInt();


        for(int i = 0; i <=n-1; i++){
           if(array[i]==target){
               temp = 1;
               index=i;
           }

        }
        if(temp==1){
            System.out.println("The element is found "+target + " by index "+index);
        }else{
            System.out.println("The element is not found at any index"+target);
        }
        for(int i = 0; i <= n - 1; i++){
            if(i==index){
                continue;
            }
            System.out.println(array[i]);
        }




        scanner.close();
    }
}
