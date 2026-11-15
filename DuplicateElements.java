//duplicate elements in array solved by own
class Main{
    public static void main(String[] args){
        int[] arr = {1,5,4,2,6,6};
        int duplicate = 0
      ;
      int temp=0;
     
        for(int i=0; i < arr.length; i++){
            for(int j =i+1; j < arr.length; j++){
                if(arr[i]==arr[j]){
                   duplicate=arr[j];
                }
            }
        }
        System.out.println(duplicate);
       
        
    }
}
