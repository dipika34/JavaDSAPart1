//frequency of a word
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        String txt = scan.next();
        char word = scan.next().charAt(0);
        int count = 0;
        for(int i = 0; i <= txt.length()-1; i++){
            if(txt.charAt(i)==word){
                count++;
            }
        }
        System.out.println(word+ " "+count);
        scan.close();
    }
}
