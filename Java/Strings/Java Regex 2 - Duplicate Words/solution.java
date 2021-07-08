import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b([a-z]|[A-Z]+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}

Here is the link for explanation which I referred: [Explanation](https://stackoverflow.com/questions/2823016/regular-expression-for-duplicate-words)
/*
Sample Input : Goodbye goodbye GooDbYe

Sample Output : Goodbye

Explanation:

The regex expression:

\b : Start of a word boundary

(\s+\1\b)* : Any number of space followed by word which matches the previous word and ends the word boundary. Whole thing wrapped in * helps to find more than one repetitions.

Grouping :

m.group() : Shall contain the matched group in the case Goodbye goodbye GooDbYe

m.group(1) : Shall contain the first word of the matched pattern in above case Goodbye

Replace method shall replace all consecutive matched words with the first instance of the word.*/
