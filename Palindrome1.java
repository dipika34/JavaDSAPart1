class Solution{
    public static void main(String[] args){
        int n=131;
        int rev=0;
        int temp=n;
        while(n>0){
           int  digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
    if(temp==rev){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not Palindrome");
    }
}
}
