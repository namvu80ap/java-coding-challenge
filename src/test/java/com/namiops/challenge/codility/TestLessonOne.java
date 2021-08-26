package com.namiops.challenge.codility;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for BinGap.
 */
public class TestLessonOne
{
  @Test
  public void testBinGap()
  {
    assertEquals(LessonOne.getGap(9),2);
    assertEquals(LessonOne.getGap(529),4);
    assertEquals(LessonOne.getGap(20),1);
    assertEquals(LessonOne.getGap(15),0);
    assertEquals(LessonOne.getGap(32),0);
  }

  @Test
  public void solution() {
    int[] A = {9,3,9,9,3,7,9};
    // write your code in Java SE 8
    int xor = 0;
    for (int i = 0; i < A.length; i++) {
      System.out.println( Integer.toBinaryString(xor) );
      System.out.println( Integer.toBinaryString(A[i]) );
      xor ^= A[i]; //key line
      System.out.println( Integer.toBinaryString(xor) );
      System.out.println( "------------------ ");
    }
  }

  @Test
  public void solution1() {
    int[] A = {3,8,9,7,6};
    int K = 3;

    int N = A.length;

    for (int i=0; i<N; i++)
      System.out.println( (i+K) % N );

  }
}
