package com.zafar.java8.stream.filter;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.zafar.database.StudentDataBase;
import com.zafar.model.Book;
import com.zafar.model.StudentVo;

public class FilterFunctionimpl {
	
	public static void main(String[] args) {
		List<StudentVo> allStudents = StudentDataBase.getAllStudents();
		 Optional<List<Book>> optionalbooks = allStudents.stream().filter(studentVo->studentVo.getStudentName().equalsIgnoreCase("Zafar Imam")).
		filter(studentVo->studentVo.getBooks().size()>0).map(StudentVo::getBooks).findFirst();
		 if(optionalbooks.isPresent())
		 {
				System.out.println(optionalbooks.get());
		 }
		 Set<String> collect = optionalbooks.get().stream().filter(book->book.getAuthorName().equalsIgnoreCase("jamesh gosling")).map(Book::getBookName).collect(Collectors.toSet());
		 Set<String> collect1 = optionalbooks.get().stream().filter(book->book.getAuthorName().equalsIgnoreCase("jamesh gosling")).map(book->book.getBookName()).collect(Collectors.toSet());
		System.out.println(collect);
		System.out.println(collect1);
		 
	}

}
