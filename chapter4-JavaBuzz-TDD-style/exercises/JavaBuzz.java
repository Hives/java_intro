// can you remember how to set up your main function?
public class JavaBuzz {
    public static String jb(int i) {
        String output;
        if (i % 15 == 0) {
            output = "JavaBuzz";
        } else if (i % 5 == 0) {
            output = "Buzz";
        } else if (i % 3 == 0) {
            output = "Java";
        } else {
            output = Integer.toString(i);
        }
        return output;
    }
    public static void main(String[] args) {
        for (int i=1; i<=100; i++) {
            System.out.println(jb(i));
        }
    }
}
