import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2(){
    int[] input2 = { };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ }, input2);
  }

  @Test
  public void testReverseInPlace3(){
    int[] input2 = { -2, -3, -4};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ -4, -3, -2}, input2);
  } //It changes the element to be the one in its reversed index, however, it doesn't change the
  //element in its reversed index to the element we are changing. Ex.after the first round this becomes{-4, -3, -4}
  
  @Test
  public void testReversed2() {
    int[] input1 = { -5, -6, -7};
    assertArrayEquals(new int[]{ -7, -6, -5}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverge(){
    double[] input = {1.1, 1.2, 1.3, 1.4};
    assertEquals(1.3, ArrayExamples.averageWithoutLowest(input),0);
  }
}
