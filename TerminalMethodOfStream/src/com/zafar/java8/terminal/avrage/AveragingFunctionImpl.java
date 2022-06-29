package com.zafar.java8.terminal.avrage;

import java.util.stream.Collectors;

import com.zafar.database.StudentDataBase;
import com.zafar.model.StudentVo;

public class AveragingFunctionImpl {

	
	public static void avrageDouble()
	{
		
		Double collect = StudentDataBase.getAllStudents().stream().map(StudentVo::getId).collect(Collectors.averagingDouble(num->Double.
				parseDouble(String.valueOf(num))));
		System.out.println(collect);
	}
	public static void avrageInt()
	{
		
	 Double collect = StudentDataBase.getAllStudents().stream().map(StudentVo::getId).collect(Collectors.averagingInt(num->num));
		System.out.println(collect);
	}
	public static void avrageLong()
	{
		
		Double collect = StudentDataBase.getAllStudents().stream().map(StudentVo::getId).collect(Collectors.averagingLong(num->Long.valueOf(String.valueOf(num))));
		System.out.println(collect);
	}
	public static void main(String[] args) {
		avrageDouble();
		avrageInt();
		avrageLong();
	}
}
