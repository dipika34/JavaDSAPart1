//DSA problem counting problem using Java
class Main{
    public static void main(String[] args){
        int[] arr = {1,2,3,3,4,6,8};
        int count=0;
        for(int i=0; i<=arr.length-1;i++){
            if(arr[i]%2==0){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
