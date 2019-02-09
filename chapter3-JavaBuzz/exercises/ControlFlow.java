// what imports will you need?
import java.util.Scanner;

// can you remember how to set up your main function?
public class ControlFlow {
    public static void main(String[] args) {
        int n;
        // find a way to read in user input
        Scanner reader = new Scanner(System.in);
        
        while ((n = reader.nextInt()) != 17) {
            // write a method that will check if a number is odd or even
            // (assume user only ever enters integers)
            String odd_or_even = (n % 2 == 0) ? "is even" : "is odd";

            // print the answer to the console
            System.out.println(odd_or_even);
        }
    }
}
