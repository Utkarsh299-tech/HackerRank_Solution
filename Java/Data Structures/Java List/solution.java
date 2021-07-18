// https://github.com/Utkarsh299-tech

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < N; i++) {
            int val = sc.nextInt();
            list.add(val);
        }
        
        /* Performing queries on LinkedList */
        int Q = sc.nextInt();
        for(int i = 0; i < Q; i++) {
            String query = sc.next();
            if(query.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            } else {            // if query.equals("Delete")
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        sc.close();
        
        /* Printing the updated list */
        for(Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
