package com.zafar.imprative.and.declarative.programming;

import java.util.stream.IntStream;

public class ImprativeAndDeclarativeProgramming {

	public static void main(String[] args) {
		// imprative programming
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("sum of 1 to 100 Number: " + sum);

		// declarative prograaming

		int sum2 = IntStream.rangeClosed(1, 100)
				.parallel()
				.sum();
		System.out.println("sum of 1 to 100 Number: " + sum2);

	}

}
