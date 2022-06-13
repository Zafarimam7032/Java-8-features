package com.zafar.java8.basicpredicate;

import java.util.List;
import java.util.Objects;
import java.util.function.BiPredicate;

import com.zafar.database.StudentDataBase;
import com.zafar.model.StudentVo;

public class BiPredicateInterfaceImp {

	public static void main(String[] args) {
		BiPredicate<String, String> biPredicate = new BiPredicate<String, String>() {

			@Override
			public boolean test(String messsage, String message1) {
				if (messsage.equalsIgnoreCase(message1)) {
					return true;
				}
				return false;
			}
		};
		BiPredicate<String, String> biPredicate2 = BiPredicateInterfaceImp::test;
		boolean test = biPredicate.and(biPredicate2).test("zafar", "zafar");
		boolean test1 = biPredicate.or(biPredicate2).test("zafar", null);
		System.out.println(test);
		System.out.println(test1);
		BiPredicate<StudentVo, String> biPredicate3= BiPredicateInterfaceImp::test;
		List<StudentVo> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach(studentVo->biPredicate3.test(studentVo, "MRCE"));
		
	}

	private static boolean test(String message, String message1) {
		if (Objects.nonNull(message) && (Objects.nonNull(message1))) {
			return true;
		}
		return false;
	}

	private static boolean test(StudentVo studentVo, String collegeName) {
		if (studentVo.getCollegeName().equalsIgnoreCase(collegeName)) {
			return true;
		}
	return false;
	}
}
