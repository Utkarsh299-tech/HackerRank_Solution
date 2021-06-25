// https://github.com/Utkarsh299-tech
import java.util.Scanner;
public class Solution {

    static boolean isAnagram(String a, String b) {
        if(a == null || b == null || a.length() != b.length())
            return false;
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        int[] char_counts = new int[26];
        for(int i = 0; i < a.length(); i++) {
            char_counts[a.charAt(i) - 'a']++;
            char_counts[b.charAt(i) - 'a']--;
        }
        
        for(int count : char_counts) {
            if(count != 0)
                return false;
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
