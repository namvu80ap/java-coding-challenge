package com.namiops.challenge.codility;

/**
 * BinaryGap : Find longest sequence of zeros in binary representation of an integer.
 * https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
 *
 */
public class LessonOne
{
  public static int getGap(int N) {
    System.out.println("GetGap Number:" + N);
    int max = 0;
    int count = -1;
    int r = 0;

    while (N > 0) {
      // get right most bit & shift right
      r = N & 1;
      N = N >> 1;

      if (0 == r && count >= 0) {
        count++;
      }

      if (1 == r) {
        max = count > max ? count : max;
        count = 0;
      }
    }
    System.out.println("Return Gap:" + max);
    return max;
  }
}
