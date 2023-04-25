import static org.junit.Assert.*;

import java.beans.Transient;

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
  public void test() { //reverse in place
    int[] input1 = {1,2,3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3, 2, 1}, input1);
    }

  @Test
  public void test2() {
    int[] input1 = {1, 2};
    assertArrayEquals(new int[]{2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void test3() { //average without lowest
    double[] input1 = {1.0, 1.0, 1.0, 1.0};
    assertEquals(1/3, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }
}
