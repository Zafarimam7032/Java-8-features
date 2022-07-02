package com.zafar.opt.of;

import java.util.Optional;

import com.zafar.database.StudentDataBase;
import com.zafar.model.StudentVo;

public class OfMethodImpl {

	public static void OfMethod() {
		Optional<Integer> optionalValue = Optional.of(10000000);
		System.out.println(optionalValue.get());
		Optional<StudentVo> studentInfo = Optional.of(StudentDataBase.getAllStudents().get(0));
		System.out.println(studentInfo.get());
	}

	public static void OfMethodWithNullCheck() {
		Optional<Integer> optionalValue = Optional.of(null);// of method will throw exception if data is not present to
															// solve this we have OfNullable
		System.out.println(optionalValue.get());
		Optional<StudentVo> studentInfo = Optional.of(StudentDataBase.getAllStudents().get(0));// of method will throw
																								// exception if data is
																								// not present
		studentInfo = null;
		System.out.println(studentInfo.get());
	}

	public static void main(String[] args) {
		OfMethod();
		OfMethodWithNullCheck();
	}
}
