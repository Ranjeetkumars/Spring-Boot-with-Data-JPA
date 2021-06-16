package com.examples.runners;

import java.io.FileInputStream;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.example.repo.StudentRepo;
import com.examples.model.Student;

@Component
public class StudentRunners implements CommandLineRunner {

	@Autowired
	StudentRepo repo;

	@Override
	public void run(String... args) throws Exception {

		FileInputStream fis = new FileInputStream("D:\\Images\\ranjeet.JPG");
		
		//available return file size in byte
		byte[] barr = new byte[fis.available()];
		fis.read(barr);

		String str = "nbdfqwhefhwhfcsadcjifindm m,qifjjkf,mnqjkefuiqwefnjkqwerqwjkd casdfjiqw78dfhcns dncoqiwd8uic";
		char ch[] = str.toCharArray();

		Date d = new Date(System.currentTimeMillis());
		Student stu = new Student(1, "Golden", d, barr, ch);
		repo.save(stu);
		
		
		

		fis.close();
		
		
		Student stu1 = new Student();
		stu1.setStuName("Golden");
		Example<Student> ex = Example.of(stu1);
		
		repo.findAll(ex).forEach(System.out::println);
	}

}
