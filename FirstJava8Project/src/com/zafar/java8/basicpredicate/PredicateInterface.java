package com.zafar.java8.basicpredicate;

import java.util.List;
import java.util.function.Predicate;

import com.zafar.database.StudentDataBase;
import com.zafar.model.StudentVo;

public class PredicateInterface {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				boolean check = false;
				if (t.equalsIgnoreCase("zafar")) {
					check = true;
				}
				return check;
			}
		};
		System.out.println(predicate.test("IMam"));

		Predicate<String> predicate2 = (name) -> {
			boolean check = false;
			if (name.equalsIgnoreCase("Imam")) {
				check = true;
			}
			return check;
		};
		System.out.println(predicate2.test("imam"));
		System.out.println(predicate.or(predicate2).test("zafar"));
		System.out.println(predicate.and(predicate2).test("zafar"));
		
		Predicate<StudentVo> predicate3=(studentVo)->{
			if(studentVo.getCollegeName().equalsIgnoreCase("MRCE"))
			{
				return true;
			}
			return false;
		};
		
		List<StudentVo> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach(student->predicate3.test(student));
	}
}
