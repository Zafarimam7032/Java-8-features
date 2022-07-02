package com.zafar.opt.ofNullable;

import java.util.Optional;

public class OfNullableFunctionImpl {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Optional<String> optionalName = Optional.ofNullable("Zafar Imam");
		System.out.println(optionalName.get());
		Optional<String> optionalNameIfNull = Optional.ofNullable(null);
		System.out.println(optionalNameIfNull);

	}
}
