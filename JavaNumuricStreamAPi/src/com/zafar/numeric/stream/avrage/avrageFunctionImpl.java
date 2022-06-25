package com.zafar.numeric.stream.avrage;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class avrageFunctionImpl {
	
 public static void main(String[] args) {
	OptionalDouble average = IntStream.rangeClosed(10, 30).average();
	System.out.println(average.getAsDouble());
}
}
