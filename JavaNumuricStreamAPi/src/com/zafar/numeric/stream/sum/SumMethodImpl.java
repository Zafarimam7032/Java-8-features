package com.zafar.numeric.stream.sum;

import java.util.stream.IntStream;

public class SumMethodImpl {

	public static void main(String[] args) {			
		int sum = IntStream.rangeClosed(1, 100).sum();
		System.out.println(sum);           
	}
}
