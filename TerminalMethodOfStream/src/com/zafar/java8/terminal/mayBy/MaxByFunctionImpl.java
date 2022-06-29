package com.zafar.java8.terminal.mayBy;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.zafar.database.StudentDataBase;
import com.zafar.model.StudentVo;

public class MaxByFunctionImpl {

	public static void main(String[] args) {
		List<StudentVo> allStudents = StudentDataBase.getAllStudents();
		Optional<StudentVo> studentOptional = allStudents.stream().collect(Collectors.maxBy(Comparator.comparing(StudentVo::getId)));
		System.out.println(studentOptional.get());
	}
}
