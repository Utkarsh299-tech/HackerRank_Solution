import java.io.*;
// https://github.com/Utkarsh299-tech

import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for(int row = 0; row < 6; row++) {
            for(int col = 0; col < 6; col++) {
                arr[row][col] = scan.nextInt();
            }
        }
        scan.close();
        
        System.out.println(maxHourGlass(arr));
    }
    
    public static int maxHourGlass(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < 4; row++) {
            for(int col = 0; col < 4; col++) {
                int sum = findSum(arr, row, col);
                max = Math.max(max, sum);
            }
        }
        return max;
    }
    
    private static int findSum(int[][] arr, int r, int c) {
        int sum = arr[r+0][c+0] + arr[r+0][c+1] + arr[r+0][c+2] + arr[r+1][c+1] + arr[r+2][c+0] + arr[r+2][c+1] + arr[r+2][c+2];
        return sum;
    }
}
