package com.zafar.java8.basicConsumer;

import java.util.List;
import java.util.function.Consumer;

import com.zafar.database.StudentDataBase;
import com.zafar.model.StudentVo;

public class FisrtJava8Consumerinterface {

	static List<StudentVo> allStudents;

	 Consumer<StudentVo> consumer = (studetVo) -> {
		if (studetVo.getId() > 3) {
			System.out.println(studetVo);
		}
	};

	/**
	 * 
	 */
	Consumer<StudentVo> consumer2=(studentvo)->{
		if(studentvo.getCollegeName().equalsIgnoreCase("MRCE"))
		{
		System.out.println(studentvo);
		}
	};
	public static void main(String[] args) {
		allStudents = StudentDataBase.getAllStudents();

		Consumer consumer = (args)->System.out.println("this is fist consumer");

		consumer.accept(args);
		Consumer consumer2 = arg0 -> {
			System.out.println("this is second consumer ");
		};
		consumer2.accept(args);
		FisrtJava8Consumerinterface consumerinterface=new FisrtJava8Consumerinterface();
		consumerinterface.studentInformation();
	}

	public  void studentInformation()
	{
		allStudents.forEach(consumer.andThen(consumer2));
	}
}
