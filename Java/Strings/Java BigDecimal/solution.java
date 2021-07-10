import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                BigDecimal a = new BigDecimal(s1);
                BigDecimal b = new BigDecimal(s2);
                return b.compareTo(a);  // descending order
            }
        };
        
        Arrays.sort(s, 0, n, customComparator);

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}

/*
EXPLANATION: [Reference](https://www.hackerrank.com/challenges/java-bigdecimal/forum/comments/253654)
We want to sort in descending order while preserving the contents of each String.
A comparator can achieve this for us.
We convert to BigDecimal inside our comparator so that the change is not permanent and our String's form for each number is preserved.

Here, the [sort](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#sort-T%3aA-int-int-java.util.Comparator-) method takes 4 parameters. 
The first parameter is the array to sort. 
The next 2 parameters are the range to sort from [0,n] exclusive (includes 0 but not n).
The last argument is the customComparator that I wrote to teach it how to sort.
The customComparator I wrote is a [Comparator](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html), and it must override the compare function. 
Reading the documentation for [compare](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#compare-T-T-) will answer most of your questions If the compare function returns a negative value, then s1 comes before s2. 
If it returns a positive value, then s2 comes before s1. Based on that information, Arrays.sort can sort arrays.
*/
