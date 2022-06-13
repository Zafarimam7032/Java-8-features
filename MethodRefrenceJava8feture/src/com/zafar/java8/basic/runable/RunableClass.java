package com.zafar.java8.basic.runable;

public class RunableClass {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("this is runable interface");
			}
		};

		Thread thread = new Thread(runnable);
		thread.start();
		Runnable runnable2 = RunableClass::run;
		Thread thread2 = new Thread(runnable2);
		thread2.start();
		Runnable runnable3 = () -> System.out.println("this is runable interface 3");
		Thread thread3 = new Thread(runnable3);
		thread3.start();

	}

	private static void run() {
		System.out.println("this is runable interface 2");
	}
}
