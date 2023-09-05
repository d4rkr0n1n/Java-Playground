package com.d4rkr0n1n.io;

import java.util.*;
import java.io.*;

public class IO {
  public static void main(String arg[]) {
    System.out.println(getIntputList("\\s").toString());
    System.out.println(getIntputListOfIntegers("\\s").toString());
  }

  private static List<String> getIntputList(String pattern) {
    List<String> inputList = new ArrayList<>();
    try {
      String inputLine = new BufferedReader(new InputStreamReader(System.in)).readLine();
      Scanner scanner = new Scanner(inputLine).useDelimiter(pattern);
      while (scanner.hasNext()) {
        inputList.add(scanner.next());
      }
      scanner.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return inputList;
  }

  private static List<Integer> getIntputListOfIntegers(String pattern) {
    List<Integer> inputList = new ArrayList<>();
    try {
      String inputLine = new BufferedReader(new InputStreamReader(System.in)).readLine();
      Scanner scanner = new Scanner(inputLine).useDelimiter(pattern);
      while (scanner.hasNext()) {
        inputList.add(scanner.nextInt());
      }
      scanner.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return inputList;
  }
}