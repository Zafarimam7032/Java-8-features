package com.zafar.numeric.stream.range;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RangeMethodImpl {

	public static void main(String[] args) {
		List<Integer> integers=Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
		OptionalDouble average = IntStream.range(1, 10).average();
		System.out.println(average.getAsDouble());
		int sum = IntStream.range(1, 10).sum();
		System.out.println(sum);
		int[] array = IntStream.range(100, 110).toArray();
				integers.stream()
				.limit(array.length).
				peek(i->System.out.print(array[i] + " ")).collect(Collectors.counting());

	}
}
