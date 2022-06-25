package com.zafar.java8.stream.of;

import java.util.stream.Stream;

public class OfMethodImpl {
	public static void main(String[] args) {
		Stream<String> names = Stream.of("zafar","renu","Bharti","kiran");
		names.forEach(name->System.out.print(name+ " "));
	}

}
