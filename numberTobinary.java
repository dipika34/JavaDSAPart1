
class Main{
    public static void main(String[] args){
        int n = 9;
        int binary =0;
        int temp = 0;
        int i = 1;
        while(0<n){
            temp = n%2;
            binary = binary+temp*i;
            n=n/2;
            i=i*10;
          
        }
        System.out.println(binary);
        
    }}
       
    
