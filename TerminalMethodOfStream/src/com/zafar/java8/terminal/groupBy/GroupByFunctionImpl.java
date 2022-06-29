package com.zafar.java8.terminal.groupBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.zafar.database.StudentDataBase;
import com.zafar.model.Book;
import com.zafar.model.StudentVo;

public class GroupByFunctionImpl {

	static List<StudentVo> allStudents = StudentDataBase.getAllStudents();

	public static void groupByFunction() {
		Map<Integer, List<StudentVo>> collect = allStudents.stream().collect(Collectors.groupingBy(StudentVo::getId));
		System.out.println(collect);
	}
	public static void groupByFunctionwithParam() {
Map<String, List<StudentVo>> collect = allStudents.stream().
				collect(Collectors.
				groupingBy(student->student.getId()>3?"first priority":"second Priority"));
		System.out.println(collect);
	}
	public static void groupByFunctionOveride() {
		Map<Integer, List<StudentVo>> collect = allStudents.stream().collect(Collectors.groupingBy(StudentVo::getId));
		System.out.println(collect);
	}
	public static void groupByFunctionwithovrided() {
	 Map<String, List<List<Book>>> collect = allStudents.stream().collect(Collectors.
			groupingBy(StudentVo::getStudentName,
				Collectors.mapping(StudentVo::getBooks, Collectors.toList())));
		System.out.println(collect);
	}
	
	
	public static void main(String[] args) {
		groupByFunction();
		groupByFunctionwithParam();
		groupByFunctionwithovrided();
	}
}
