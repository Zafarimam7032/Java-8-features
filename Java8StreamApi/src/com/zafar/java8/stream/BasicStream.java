package com.zafar.java8.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.zafar.database.StudentDataBase;
import com.zafar.model.StudentVo;

public class BasicStream {
 
	public static void main(String[] args) {
		List<StudentVo> allStudents = StudentDataBase.getAllStudents();
		allStudents.stream().forEach(student->System.out.println(student));
		List<String> collect = allStudents.stream().map(studentVo->studentVo.getCollegeName()).collect(Collectors.toList());
		List<String> collect1 = allStudents.stream().map(StudentVo::getStudentName).collect(Collectors.toList());
		Map<Integer, String> map=allStudents.stream().collect(Collectors.toMap(StudentVo::getId,StudentVo::getStudentName));
		System.out.println(collect);
		System.out.println(collect1);
		System.out.println(map);
	}
}
