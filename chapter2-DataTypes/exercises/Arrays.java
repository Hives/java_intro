import java.util.*;
// can you remember how to set up your main function?
public class Arrays {
    public static void main(String[] args) {
    // declare an array of Strings and print it
    String[] names = {"Bertie", "Gertie", "Yurtie"};
    System.out.println(names);
    for (int i=0; i<names.length; i++)
        System.out.println(names[i]);

    // declare an array of integers and print it
    int[] numbers = {1, 3, 3, 7};
    System.out.println(numbers);
    for (int i=0; i<numbers.length; i++)
        System.out.println(numbers[i]);

    // declare an ArrayList of integers, add numbers to it, and then print it
    int n = 7;
    ArrayList<Integer> arrli = new ArrayList<Integer>(n);
    for (int i=1; i<=n; i++)
        arrli.add(i * 2);
    System.out.println(arrli);

    }
}
