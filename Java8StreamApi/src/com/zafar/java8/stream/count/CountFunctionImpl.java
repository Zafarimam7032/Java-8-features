package com.zafar.java8.stream.count;

import java.util.List;

import com.zafar.database.StudentDataBase;
import com.zafar.model.StudentVo;

public class CountFunctionImpl {
	
	public static void main(String[] args) {
List<StudentVo> allStudents = StudentDataBase.getAllStudents();
long StudentStrenth = allStudents.stream().map(StudentVo::getStudentName).count();
System.out.println(StudentStrenth);
	}
}
