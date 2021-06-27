// https://github.com/Utkarsh299-tech
import java.util.Scanner;
import java.util.regex.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

// If a PatternSyntaxException is not thrown by Pattern.compile, the regular expresion is valid
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
    in.nextLine();
		while(testCases-- > 0){
			String pattern = in.nextLine();
          	try {
                  Pattern.compile(pattern);
                  System.out.println("Valid");
            }
            catch (PatternSyntaxException exception) {
                  System.out.println("Invalid");
            }
		}
    in.close();
	}
}
