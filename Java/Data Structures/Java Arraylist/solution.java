// https://github.com/Utkarsh299-tech

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Creating a 2D ArrayList to store the integers
        List<List<Integer>> lists = new ArrayList<>();
        for(int row = 0; row < n; row++) {
            int d = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int col = 0; col < d; col++) {
                list.add(sc.nextInt());
            }
            lists.add(list);
        }
        
        // Answering the queries
        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            List<Integer> list = lists.get(x - 1);
            if(y <= list.size()) {
                System.out.println(list.get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}
