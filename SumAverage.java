class Main{
    public static void main(String[] args){
        int[] arr = {1,2,3};
        int total = 0,avg=  0;
        for(int i=0; i < arr.length; i++){
          total+=arr[i];
            avg = total/arr.length;
         
            
        }
        System.out.println(total);
        System.out.println(avg);
        
        
    }
}
