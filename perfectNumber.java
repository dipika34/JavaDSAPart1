class Solution {
    static boolean isPerfect(int n) {
        // code here
        int o = n;
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
            sum+=i;
        }
        if(o==sum){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        int output=isPerfect(6);
        System.out.println(output);
    }
};
