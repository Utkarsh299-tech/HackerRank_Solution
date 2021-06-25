// https://github.com/Utkarsh299-tech

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        
        // If a string is equivalent to itself when reversed, then the given string is a palindrome
        // Method-1: Using in-built reverse function
        // String reversed = new StringBuilder(str).reverse().toString();
        // System.out.println(str.equals(reversed) ? "Yes" : "No");
        
        // Method-2: Using two pointer technique
        System.out.println(isPalindrome(str));
    }
    
    private static String isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j))
                return "No";
                
            i++;
            j--;
        }
        return "Yes";
    }
}
