package com.conceptandcoding.springbootplayground;

import com.conceptandcoding.springbootplayground.dao.StudentDAO;
import com.conceptandcoding.springbootplayground.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootPlaygroundApplication {

	public static void main(String[] args) { SpringApplication.run(SpringBootPlaygroundApplication.class, args); }

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//createStudent(studentDAO);
			readStudent(studentDAO);
		};
	}

	private void readStudent(StudentDAO studentDAO) {

		// retrieve student based on the id: primary key
		Student student = studentDAO.findById(1);

		// display student
		System.out.println("found the student: " + student);
	}

	private void createStudent(StudentDAO studentDAO) {

		// create the student object
		System.out.println("Creating new student object..");
		Student tempStudent = new Student("Maal", "G", "maal@gmail.com");

		// save the student object
		System.out.println("Saving the student..");
		studentDAO.save(tempStudent);

		// display the id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());

	}

}
