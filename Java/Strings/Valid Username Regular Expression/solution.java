// https://github.com/Utkarsh299-tech

import java.util.Scanner;
class UsernameValidator {
    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}

/*
EXPLANATION:

^ :  means the first character starting with a-z or A-Z (Constraint-3)
[a-zA-Z] : means any character in b/w a-z or A-Z
\w : Word character
\\w{7,29} : a check to make sure that the remaining items are word items, which includes the underscore, until it reaches the end and that is represented with $. 
{7,29} : the 8-30 character constraint given to us minus the predefined first character.
The extra backslash in \w is to "escape" the 2nd backslash character in a Java String.

*/
