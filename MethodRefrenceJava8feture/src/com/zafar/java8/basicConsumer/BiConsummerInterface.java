package com.zafar.java8.basicConsumer;

import java.util.List;
import java.util.function.BiConsumer;

import com.zafar.database.StudentDataBase;
import com.zafar.model.StudentVo;

public class BiConsummerInterface {

	public static void main(String[] args) {
		String collegeName = "mrce";
		List<StudentVo> allStudents = StudentDataBase.getAllStudents();
		BiConsumer<String, String> biConsumer = new BiConsumer<String, String>() {

			@Override
			public void accept(String t, String u) {
				System.out.println("BiConsumer interface : " + t + " " + u);
			}
		};
		BiConsumer<String, String> biConsumer1 =(t,u) -> 
				System.out.println("BiConsumer interface : " + t + " " + u);

		biConsumer.accept("Zafar", "Imam");
		biConsumer1.accept("ateef", "eqbal");
		
		BiConsumer< StudentVo, String> biConsumer2= (StudentVo student, String clName) ->{
			if(student.getCollegeName().equalsIgnoreCase(collegeName))
				System.out.println(student);
		};

		BiConsumer< StudentVo, String> biConsumer3=(student,clName)->{
			if(student.getCollegeName().equalsIgnoreCase("Mlrd"))
				System.out.println(student);
		};
		allStudents.forEach(studentvo->biConsumer2.andThen(biConsumer3).accept(studentvo, collegeName));
	}

}
