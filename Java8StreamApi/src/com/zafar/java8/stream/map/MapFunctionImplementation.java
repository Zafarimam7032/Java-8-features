package com.zafar.java8.stream.map;

import java.util.List;
import java.util.stream.Collectors;

import com.zafar.database.StudentDataBase;
import com.zafar.model.StudentVo;

public class MapFunctionImplementation {

	public static void main(String[] args) {
		List<StudentVo> allStudents = StudentDataBase.getAllStudents();
		List<String> address1 = allStudents.stream().map(studentVo -> studentVo.getAddress())
				.collect(Collectors.toList());
		List<String> address = allStudents.stream().map(StudentVo::getAddress).collect(Collectors.toList());
		System.out.println(address1);
		System.out.println(address);
	}
}
