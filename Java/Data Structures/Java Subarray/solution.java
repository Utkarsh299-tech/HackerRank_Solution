// https://github.com/Utkarsh299-tech

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        
        System.out.println(negativeSubarrays(array));
    }
    
    private static int negativeSubarrays(int[] array) {
        int sum = 0;
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                sum += array[j];
                if(sum < 0) {
                    count++;
                }
            }
            sum = 0;
        }
        return count;
    }
}
