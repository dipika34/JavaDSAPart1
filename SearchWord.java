//without using function
import java.util.*;
public class program34{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many words are there in the dictionary?");
        int number = scanner.nextInt();
        int temp = 0;
        String[] words = new String[number];
        System.out.println("Enter the words in the dictionary:");
        for(int i = 0; i <= number-1;i++){
            words[i] = scanner.next();
        }

        System.out.println("Enter the word you want to search :");
        String word = scanner.next();
        for(int i = 0; i <= number - 1; i++){
            if(words[i].equals(word)){
                temp = 1;
            }

        }
        if(temp==1){
            System.out.println("Word is found");
        }else{
            System.out.println("Word is not found");
        }
        scanner.close();

    }
}
