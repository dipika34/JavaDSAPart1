class Solution {
    public static int armstrongNumber(int n) {
        // code here
        int o=n;
        int sum=0;
        while(sum>0){
            int digit=n%10;
            sum+=digit*digit*digit;
            n/=10;
        }
        if(o==sum){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args)
{
  
  int output = armstrongNumber(153);
  System.out.println(output);
}}
