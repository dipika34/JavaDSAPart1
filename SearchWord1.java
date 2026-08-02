//using function
import java.util.*;
public class program35{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many words are there in the array ?");
        int size = scanner.nextInt();
        String[] Words = new String[size];
        System.out.println("Enter the words in the array :");
        for(int i = 0; i<=size-1; i++){
            Words[i] =  scanner.next();
        }
        System.out.println("Enter the word you want to search :");
        String word = scanner.next();
        checkWord(Words,size,word);
        scanner.close();

    }
    public static void checkWord(String[] Words,int size,String word){
        int temp = 0;
        for(int i = 0; i<=size-1;i++){
            if(Words[i].equals(word)){
                temp = 1;
            }
        }
        if(temp==1){
            System.out.println("Word is found "+word);

        }else{
            System.out.println("Word is not found "+word);
        }
    }

}
