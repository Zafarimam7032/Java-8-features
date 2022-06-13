package com.zafar.java8.supplier;

import java.util.function.Supplier;

public class SuplierInterfaceImpl {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> " hi this supplier funtional interface";
		Supplier<String> supplier1 = SuplierInterfaceImpl::get;
		System.out.println(supplier.get());
		System.out.println(supplier1.get());

	}

	private static String get() {
		return " hi this supplier funtional interface";
	}
}
