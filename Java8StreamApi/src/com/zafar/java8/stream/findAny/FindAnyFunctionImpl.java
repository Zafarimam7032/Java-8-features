package com.zafar.java8.stream.findAny;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.zafar.database.StudentDataBase;
import com.zafar.model.StudentVo;

public class FindAnyFunctionImpl {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Optional<Integer> numbers = integers.stream().filter(i->i>6).findAny();
		if(numbers.isPresent())
		{
			System.out.println(numbers.get());
		}
		List<String> names=Arrays.asList("zafar","mira","deepika","ajeet");
		Optional<String> namef = names.stream().filter(name->name.equalsIgnoreCase("zafar")).findAny();
		if(namef.isPresent())
		{
			System.out.println(namef.get());
		}
		List<StudentVo> allStudents = StudentDataBase.getAllStudents();
		Optional<StudentVo> studentVo = allStudents.stream().filter(student->student.getStudentName().equalsIgnoreCase("Zafar Imam")).findAny();
	if(studentVo.isPresent())
	{
		System.out.println(studentVo.get());
	}
	}
}
