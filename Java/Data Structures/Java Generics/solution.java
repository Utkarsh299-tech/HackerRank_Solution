// https://github.com/Utkarsh299-tech

import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
   public <T> void printArray(T[] array) {
       for(T item : array) {
           System.out.println(item);
       }
   }
}

public class Solution {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}

/* EXPLANATION:
In the generic method printArray, the <T> in the method signature implies that the method will be dealing with generic type T.
This is needed even if the method is returning void.
The array of is of a generic type T. For each element in the array, we print it to the console.
*/
