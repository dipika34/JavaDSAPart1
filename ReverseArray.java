import java.util.*;
public class arrayProgram14{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int k = 3;
        int length1 = arr.length-k+1;
        int length2  = arr.length;
        for(int i = length1-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }
        for(int i = length2-1; i>=0; i--){
            if(arr[i]==3){
                break;
            }
            System.out.print(arr[i]+" ");
        }
    }
}
