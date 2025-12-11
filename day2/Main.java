
// Write a function to reverse each word in a string.
import java.util.Scanner;
public class Main {

public static String reverseEachWord(String input){
String[] words = input.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words){
            StringBuilder reverseword = new StringBuilder(word);
            result.append(reverseword.reverse()).append(" ");
        }
        return result.toString().trim();
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        
        String output = reverseEachWord(input);

        System.out.println(output);
        

    }
}