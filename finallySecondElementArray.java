public class program13{
    public static void main(String[] args) {
        int[] arr = {1,4,2,3};
        int max1 = 0,max2=0;
        for(int i = 0; i < 4; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
            } else if(arr[i]>max2) {

                max2=arr[i];
            }

        }
        System.out.println(max1);
        System.out.println(max2);
    }

}

