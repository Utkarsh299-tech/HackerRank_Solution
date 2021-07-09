// https://github.com/Utkarsh299-tech
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	boolean matchFound = false;
            Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = p.matcher(line);
            
            while(m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            
            if(!matchFound) {
                System.out.println("None");
            }
			testCases--;
		}
	}
}


/*
EXPLANATION: 

<(.+)>
matches HTML start tags. The parentheses save the contents inside the brackets into Group #1.

([^<]+)
matches all the text in between the HTML start and end tags. We place a special restriction on the text is that it can't have the "<" symbol. 
The characters inside the parenthesis are saved into Group #2.

</\\1>
is to match the HTML end brace that corresponds to our previous start brace. The \1 is here to match all text from Group #1.

There are two capture groups in this expression. They are surrounded by ( and ), the first is in the opening tag, the second is the content between the opening and closing tag.
So, group(2) gets the content of that capture group. Also one point to note here is the \1 in the closing tag. This is called a backreference and it has to match what was in the first capture group which is the opening tag.
So for < B > text < / B > group(1) == "B", group(2) == "text" and \1 has to be equal to group one in the closing tag to make sure its < / B > and not something like < / I >. 
Spaces added so that html tags aren't suppressed by editor

*/
