package com.namiops.challenge.companies;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * The Main class implements an application that reads lines from the standard input
 * and prints them to the standard output.
 */
public class Paypay {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
      System.out.println(cerrencyChange("45;50"));
  }

  public static String binAdd(String str){
    String[] strArr = str.split(",");
    int one = Integer.parseInt(strArr[0],2) ;
    int two = Integer.parseInt(strArr[1],2);
    int three = one + two;
    return Integer.toBinaryString(  three );
  }




  public static String cerrencyChange(String str){
    String[] strArr = str.split(";");
    float PP = Float.parseFloat(strArr[0]);
    float CH = Float.parseFloat(strArr[1]);

    HashMap<Float,String> currencyMap = new HashMap<Float,String>(){{
      put(100.0f, "ONE HUNDRED");
      put(50.0f, "FIFTY");
      put(20.0f, "TWENTY");
      put(10.0f, "TEN");
      put(5.0f, "FIVE");
      put(2.0f, "TWO");
      put(1.00f, "ONE");
      put(.50f, "HALF DOLLAR");
      put(.25f, "QUARTER");
      put(.10f, "DIME");
      put(.05f, "NICKEL");
      put(.01f, "PENNY");
    }};

    if( CH == PP ){
      return "ZERO";
    }
    else if ( CH < PP ){
      return "ERROR";
    }
    else {
      float change = CH - PP;
      List outText = new ArrayList();
      for(Map.Entry<Float, String> entry : currencyMap.entrySet()) {
        Float key = entry.getKey();
        String value = entry.getValue();
        if (( change >= key )) {
          outText.add(value);
        }
        change = Math.abs(change%key);
      }

      String result = (String) outText.stream()
        .map(n -> String.valueOf(n))
        .collect(Collectors.joining(",", "", ""));

      return result;
    }
  }

}
