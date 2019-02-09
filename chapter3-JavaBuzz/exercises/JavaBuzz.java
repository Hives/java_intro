// can you remember how to set up your main function?
public class JavaBuzz {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++) {
            if (i % 15 == 0) {
                // "JavaBuzz" if divisible by 15
                System.out.println("JavaBuzz");
            } else if (i % 5 == 0) {
                // "Buzz" if divisible by 5
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                // "Java" if divisible by 3
                System.out.println("Java");
            } else {
                System.out.println(i);
            }
        }
    }
}
