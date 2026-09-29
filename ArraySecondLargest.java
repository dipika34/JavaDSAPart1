import java.util.*;
public class arrayProblem2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] a = new int[m];
        for(int i = 0; i < m; i++){
            a[i] = sc.nextInt();
        }
        int max1=0,max2=0;
        for(int i = 0; i < m; i++){
            if(a[i]>max1){
                max2=max1;
                max1 = a[i];
            }else if(a[i]>max2){
                max2=a[i];

            }
        }
        System.out.println("Largest element in the array:"+max1);
        System.out.println("Second largest element in the array:"+max2);
        sc.close();
    }
}
