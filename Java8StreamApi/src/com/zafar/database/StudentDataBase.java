package com.zafar.database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.zafar.model.Book;
import com.zafar.model.StudentVo;

public class StudentDataBase {

	public static List<StudentVo> getAllStudents() {
		return Arrays.asList(new StudentVo(1, "Zafar Imam", "Siwan Bihar", "+917032871006", "MRCE",Arrays.asList(
					new Book(1, "C language", "jamesh gosling"),
					new Book(2, "java language", "jamesh gosling"),
					new Book(3, "java script language", "more people"),
					new Book(4, "python language", "jamesh gosling"))),
				new StudentVo(2, "Piyush Katiyar", "Agara UP", "+919661928243", "DU",Arrays.asList(
						new Book(1, "C language", "jamesh gosling"),
						new Book(2, "java language", "jamesh gosling"),
						new Book(3, "java script language", "more people"),
						new Book(4, "pthon language", "jamesh gosling"))),
				new StudentVo(3, "Bunty Raj", "Tundala UatarPardesh", "+917329919855", "PU",Arrays.asList(
						new Book(1, "C language", "jamesh gosling"),
						new Book(2, "java language", "jamesh gosling"),
						new Book(3, "java script language", "more people"),
						new Book(4, "python language", "jamesh gosling"))),
				new StudentVo(4, "Harsh kumar", "Agra UtarPardesh", "+9194301991", "RU",Arrays.asList(
						new Book(1, "C language", "jamesh gosling"),
						new Book(2, "java language", "jamesh gosling"),
						new Book(3, "java script language", "more people"),
						new Book(4, "python language", "jamesh gosling"))),
				new StudentVo(5, "Manoj Kumar", "Tundala Utar pradesh", "+919507028361", "BHU",Arrays.asList(
						new Book(1, "C language", "jamesh gosling"),
						new Book(2, "java language", "jamesh gosling"),
						new Book(3, "java script language", "more people"),
						new Book(4, "python language", "jamesh gosling"))),
				new StudentVo(6, "Ateef Eqbal", "Siwan Bihar", "+919931790188", "MLRD",Arrays.asList(
						new Book(1, "C language", "jamesh gosling"),
						new Book(2, "java language", "jamesh gosling"),
						new Book(3, "java script language", "more people"), 
						new Book(4, "python language", "jamesh gosling"))));
	}

}
