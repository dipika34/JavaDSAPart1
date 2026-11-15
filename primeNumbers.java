class Main{
    public static void main(String[] args){
        int n = 5;
        int temp = 0;
        if(n<=1){
            System.out.println("Not prime");
            return;
        }
        for(int i = 2; i < n; i++){
            if(n%i==0){
                temp=1;
               
            }
        }
        if(temp!=1){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
