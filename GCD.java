import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int temp=0;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                temp=i;
                    }
            
        }
        System.out.println(temp);
    }
}
