package com.namiops.challenge.codility;

import java.util.HashMap;
import java.util.Stack;

public class LessonSeven {
  public static int brackets(String S) {
    HashMap<Character,Character> pairBrakets = new HashMap<Character,Character>();
    pairBrakets.put('[',']');
    pairBrakets.put('{', '}');
    pairBrakets.put('(', ')');

    Stack stack = new Stack();
    for (char c : S.toCharArray() ) {
      if( pairBrakets.get(c) != null ){
        stack.push(pairBrakets.get(c));
      }
      else {
        if( stack.size() == 0 ) return 0;
        if( pairBrakets.containsValue(stack.pop()) ){
          continue;
        }
        else return 0;
      }
    }
    if(stack.isEmpty()) return 1;
    return 0;
  }
}
