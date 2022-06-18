package com.zafar.java8.stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.zafar.database.StudentDataBase;
import com.zafar.model.StudentVo;

public class CollectorsFunctionImpl {

	public static void main(String[] args) {
		List<StudentVo> allStudents = StudentDataBase.getAllStudents();
		Double collect = allStudents.stream().collect(Collectors.averagingDouble(StudentVo::getId));
		allStudents.stream().collect(Collectors.averagingDouble(StudentVo::getId));
		List<StudentVo> collect2 = allStudents.stream().collect(Collectors.toList());
		Set<StudentVo> collect3 = allStudents.stream().collect(Collectors.toSet());
		Map<Integer, String> collect4 = allStudents.stream()
				.collect(Collectors.toMap(StudentVo::getId, StudentVo::getStudentName));
		Long collect5 = allStudents.stream().collect(Collectors.counting());
		System.out.println(collect2);
		System.out.println(collect);
		System.out.println(collect3);
		System.out.println(collect4);
		System.out.println(collect5);
	}

}
