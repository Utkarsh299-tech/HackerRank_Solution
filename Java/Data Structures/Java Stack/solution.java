import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayDeque;
class Solution{
	
	public static void main(String []argh)
	{
		/* Creating HashMap to match opening brackets(keys) with corresponding closing brackets(values) */
		HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
       
        /* Test each expression for validity */
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String expression = sc.next();
            System.out.println(isBalanced(expression, map) ? "true" : "false");
        }
        sc.close();
	}
    
    private static boolean isBalanced(String expression, HashMap<Character, Character> map) {
        if((expression.length() % 2) != 0) {
            return false;       // odd length strings are not balanced e.g. {}(
        }
        ArrayDeque<Character> deque = new ArrayDeque<>();   // using deque as a stack
        for(int i = 0; i < expression.length(); i++) {
            Character ch = expression.charAt(i);
            if(map.containsKey(ch)) {
                deque.push(ch);
            }
            else if(deque.isEmpty() || ch != map.get(deque.pop())) {
                return false;
            }
        }
        return deque.isEmpty();
    }
}
