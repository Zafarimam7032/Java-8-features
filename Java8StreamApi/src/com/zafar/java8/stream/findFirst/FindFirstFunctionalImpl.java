package com.zafar.java8.stream.findFirst;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.zafar.database.StudentDataBase;
import com.zafar.model.StudentVo;

public class FindFirstFunctionalImpl {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Optional<Integer> numbers = integers.stream().filter(i->i>6).findFirst();
		if(numbers.isPresent())
		{
			System.out.println(numbers.get());
		}
		List<String> names=Arrays.asList("zafar","mira","deepika","ajeet");
		Optional<String> namef = names.stream().filter(name->name.equalsIgnoreCase("zafar")).findFirst();
		if(namef.isPresent())
		{
			System.out.println(namef.get());
		}
		List<StudentVo> allStudents = StudentDataBase.getAllStudents();
		Optional<StudentVo> studentVo = allStudents.stream().filter(student->student.getStudentName().equalsIgnoreCase("Zafar Imam")).findFirst();
	if(studentVo.isPresent())
	{
		System.out.println(studentVo.get());
	}
	}
}
