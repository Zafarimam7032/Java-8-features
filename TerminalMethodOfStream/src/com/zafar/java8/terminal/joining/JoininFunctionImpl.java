package com.zafar.java8.terminal.joining;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.zafar.database.StudentDataBase;
import com.zafar.model.StudentVo;

public class JoininFunctionImpl {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("zafar", "imam", "khatoon", "fultara");
		String name1 = list.stream().collect(Collectors.joining());
		String name2 = list.stream().collect(Collectors.joining("-"));
		String name3 = list.stream().collect(Collectors.joining(",", "(", ")"));
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);

		List<StudentVo> allStudents = StudentDataBase.getAllStudents();
		String studentNames = allStudents.stream().map(StudentVo::getStudentName).collect(Collectors.joining());
		String studentNames1 = allStudents.stream().map(StudentVo::getStudentName).collect(Collectors.joining("\n"));
		String studentNames2= allStudents.stream().map(StudentVo::getStudentName).collect(Collectors.joining("-","(",")"));

		System.out.println(studentNames);
		System.out.println(studentNames1);
		System.out.println(studentNames2);
	}
}
