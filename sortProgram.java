class Main{
    public static void main(String[] args){
        int[] arr = {1,3,2,4};
        array(arr);
    }
    public static void sort(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
            
        }
}
    public static void array(int[] arr){
        sort(arr);
        int r1 = arr[0];
        int length=arr.length;
        int r2 = arr[length-1];
        // for(int i=0;i<arr.length;i++){
        //      System.out.println(arr[i]);
        // }
        System.out.println(r1);
        System.out.println(r2);
    }
}
