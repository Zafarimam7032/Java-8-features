package com.zafar.java8.terminal.sum;

import java.util.stream.Collectors;

import com.zafar.database.StudentDataBase;
import com.zafar.model.StudentVo;

public class SummingMethodImpl {
	
	public static void main(String[] args) {
		Integer collect = StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(StudentVo::getId));
		System.out.println(collect);
		Double collect1 = StudentDataBase.getAllStudents().stream().collect(Collectors.summingDouble(StudentVo::getId));
        System.out.println(collect1);
		Long collect2 = StudentDataBase.getAllStudents().stream().collect(Collectors.summingLong(StudentVo::getId));
		System.out.println(collect2);
	}

}
