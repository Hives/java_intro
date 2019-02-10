import static org.junit.Assert.*;
import org.junit.Test;

public class JavaBuzzTest {

  @Test
  public void MultipleOf5Not3() {
    JavaBuzz javaBuzz = new JavaBuzz();
    // multiples of 5 but not 3
    assertEquals(javaBuzz.jb(5), "Buzz"); // 5 = 5
    assertEquals(javaBuzz.jb(85), "Buzz"); // 85 = 5 * 17
    assertEquals(javaBuzz.jb(290), "Buzz"); // 280 = 5 * 2 * 29
    assertEquals(javaBuzz.jb(5555), "Buzz"); // 5555 = 5 * 11 * 101
  }

  @Test
  public void MultipleOf3Not5() {
    JavaBuzz javaBuzz = new JavaBuzz();
    // multiples of 3 but not 5
    assertEquals(javaBuzz.jb(3), "Java"); // 3 = 3
    assertEquals(javaBuzz.jb(51), "Java"); // 51 = 3 * 17
    assertEquals(javaBuzz.jb(174), "Java"); // 174 = 3 * 2 * 29
    assertEquals(javaBuzz.jb(3333), "Java"); // 3333 = 3 * 11 * 101
  }

  @Test
  public void MultipleOf3and5() {
    JavaBuzz javaBuzz = new JavaBuzz();
    // multiples of 3 and 5
    assertEquals(javaBuzz.jb(0), "JavaBuzz"); // 0 = 15 * 0
    assertEquals(javaBuzz.jb(15), "JavaBuzz"); // 15 = 15
    assertEquals(javaBuzz.jb(255), "JavaBuzz"); // 255 = 15 * 17
    assertEquals(javaBuzz.jb(870), "JavaBuzz"); // 870 = 15 * 2 * 29
    assertEquals(javaBuzz.jb(16665), "JavaBuzz"); // 16665 = 15 * 11 * 101
  }

  @Test
  public void MultipleOfNeither() {
    JavaBuzz javaBuzz = new JavaBuzz();
    // multiples of neither
    int[] neither = {7, 11, 17, 58, 1111};
    for (int i = 0; i<neither.length; i++)
        assertEquals(javaBuzz.jb(neither[i]), Integer.toString(neither[i]));
  }
}
