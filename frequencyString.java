import java.util.*;
public class program36{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many words are there in the array?");
        int size = scanner.nextInt();
        String[] words = new String[size];
        System.out.println("Enter the words in the array :");
        for(int i = 0; i <=size - 1;i ++){
            words[i] = scanner.next();
        }
        System.out.println("Enter the word want to count :");
        String word = scanner.next();
        SearchWord(words,size,word);

    }
    public static void SearchWord(String[] words,int size,String word){
        int temp = 0;
        int count = 0;
        for(int i = 0; i <= size - 1; i++){
            if(words[i].equals(word)){
                temp = 1;
                count++;
            }
        }
        if(temp==1){
            System.out.println("Word is found "+word+" "+count);
        }else{
            System.out.println("Word is not found "+word);
        }

    }
}
