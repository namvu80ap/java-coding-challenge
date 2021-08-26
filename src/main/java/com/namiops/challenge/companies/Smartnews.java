package com.namiops.challenge.companies;

import java.util.*;

public class Smartnews {
  public static void main( String ... arg ){
//    System.out.println(solution(new int[]{4,2,2,4,2}));
//    System.out.println(solution(new int[]{1,2,3,2}));
//    System.out.println(solution(new int[]{0,5,4,4,5,12}));

//    System.out.println(solution(new int[]{1,4,7,3,3,5}));
//    System.out.println(solution(new int[]{1,4,7,3,3,5}));
    //System.out.println(solution(new int[]{1,5,4,4,5,0,1,2,2,1,2,1,3}));

  }

//  public static int solution( int[] A ){
//    int longest = 1;
//    Arrays.sort(A);
//    Stack<Integer> stack = new Stack();
//    stack.push(A[0]);
//    for ( int i=1; i<A.length; i++) {
//      stack.push(A[i]);
//      if(A[i] == v){
//        longest++;
//      }
//      else {
//        if( stack.size() > 2 ){
//          longest--;
//        }
//      }
//    }
//    return longest;
//  }

//
//  public static int solution( int[] A ){
//    int maxDistance = 0;
//
//    if(A.length <= 1)
//      return 0;
//
//    TreeMap<Integer, Integer> sortList = new TreeMap<>();
//    for ( int i=0; i<A.length; i++) {
//      sortList.put( A[i], i );
//    }
//
//    for(Map.Entry<Integer, Integer> entry : sortList.entrySet()) {
//      Integer v = entry.getValue();
//      if(maxDistance < Math.abs(v-maxDistance)) maxDistance = v;
//    }
//
//    return maxDistance;
//  }
//
//  public static int solution2( int[] A ){
//    int maxDistance = 0;
//
//    if(A.length <= 1)
//      return 0;
//
//    TreeMap<Integer, Integer> sortList = new TreeMap<>();
//    for ( int i=0; i<A.length; i++) {
//      sortList.put( A[i], i );
//    }
//
//    for(Map.Entry<Integer, Integer> entry : sortList.entrySet()) {
//      Integer v = entry.getValue();
//      if(maxDistance < Math.abs(v-maxDistance)) maxDistance = v;
//    }
//
//    return maxDistance;
//  }
//
//  public static int solution1( int[] A ){
//    List<Set<Integer>> mem = new ArrayList<Set<Integer>>();
//    //Find first pair
//    int firstCnt = 0 ;
//    for (int i = 1; i < A.length  ; i++) {
//      if( A[i] != A[0] ){
//        HashSet<Integer> pair = new HashSet<Integer>();
//        pair.add(A[0]);pair.add(A[1]);
//        mem.add( pair );
//        firstCnt = i;
//        break;
//      }
//    }
//
//    int max = firstCnt;
//    int count = max;
//    for (int i = firstCnt; i < A.length  ; i++){
//      if( !mem.get( mem.size() -1 ).contains( A[i] )){
//        HashSet<Integer> pair = new HashSet<Integer>();
//        pair.add(A[i-1]);pair.add(A[i]);
//        mem.add( pair );
//        count = 2;
//      }
//      else{
//        count++;
//        if( max < count ) max = count;
//      }
//    }
//
//    return max;
//  }
//
//  static class IntPair {
//    int i;
//    int j;
//  }

//    public static int solution(int[] A) {
//
//        Map<Integer,Integer> mapMaxRevr = new HashMap<Integer, Integer>();
//        int tmpMax = Integer.MIN_VALUE;
//        for (int i = A.length - 1 ; i > 0; i--) {
//            if(tmpMax < A[i]) {
//                tmpMax = A[i];
//            }
//            mapMaxRevr.put(i,tmpMax);
//        }
//
//        int maxFist = Integer.MIN_VALUE;
//        int maxAbs = Integer.MIN_VALUE;
//        for (int i = 0; i < A.length - 1; i++) {
//            if(maxFist < A[i]) {
//                maxFist = A[i];
//            }
//            int maxLast = mapMaxRevr.get(i+1);
//            if(maxAbs < Math.abs(( maxFist - mapMaxRevr.get(i+1) ))){
//                maxAbs = Math.abs(( maxFist - mapMaxRevr.get(i+1) ));
//            }
//
//        }
//        return maxAbs;
//    }

}
