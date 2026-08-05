//my childhood Bubble sort program solved by own
public class Main{
    public static void main(String[] args){
        int[] arr = {4,5,3,2,1};
       array(arr);
       
            
        }
    public static void BubbleSort(int[] arr){
          int temp = 0;
         for(int i = 0; i < 5; i++){
            //the outer loop is needed to store the number of elements in the array
            for(int j = 0; j < 5-i-1; j++){
                if(arr[j]>arr[j+1]){
                    //for the largest element so...
                    //settled temp = arr[j+1] for initializing the elements before comparing

                   temp = arr[j+1];
                   arr[j+1]=arr[j];
                   //swapping after comparing the largest elements to push at the last position
                   arr[j] = temp;
                   //set the rest elements what are left to compare
                   
                  
                  
                    
                    }
                
            }
           
    }
        
    }
    public static void array(int[] arr){
         BubbleSort(arr);
        for(int i=  0; i <5;i++){
            
            System.out.println(arr[i]);
        }
    }
}
