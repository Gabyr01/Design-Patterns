package JavaLambda;

import java.util.ArrayList;
// Use Java's Consumer interface to store a lambda expression in a variable:
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );
        
        //Lambda expressions can be stored in variables if the variable's type is an interface which has only one method. 
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );
    }

}
