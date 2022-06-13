package com.zafar.java8.supplier;

import java.util.function.Supplier;

public class SuplierInterfaceImpl {
	
	
 public static void main(String[] args) {
	Supplier<String> supplier=new Supplier<String>() {
		
		@Override
		public String get() {
			
			return " hi this supplier funtional interface";
		}
	};
	System.out.println(supplier.get());
}
}
