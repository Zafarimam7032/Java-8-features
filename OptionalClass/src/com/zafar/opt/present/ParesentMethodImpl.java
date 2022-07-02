package com.zafar.opt.present;

import java.util.List;
import java.util.Optional;

import com.zafar.database.StudentDataBase;
import com.zafar.model.StudentVo;

public class ParesentMethodImpl {

	public static void main(String[] args) {
		List<StudentVo> allStudents = StudentDataBase.getAllStudents();
		Optional<List<StudentVo>> ofNullable = Optional.ofNullable(allStudents);
		ofNullable.ifPresent(System.out::println);
		if (ofNullable.isPresent()) {
			System.out.println(ofNullable.get());
		}
	}
}
