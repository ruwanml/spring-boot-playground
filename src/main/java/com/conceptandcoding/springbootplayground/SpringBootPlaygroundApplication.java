package com.conceptandcoding.springbootplayground;

import com.conceptandcoding.springbootplayground.dao.StudentDAO;
import com.conceptandcoding.springbootplayground.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringBootPlaygroundApplication {

	public static void main(String[] args) { SpringApplication.run(SpringBootPlaygroundApplication.class, args); }

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//createStudent(studentDAO);
			//readStudent(studentDAO);

			//queryForStudents(studentDAO);
			
			//queryForStudentsByLastName(studentDAO);

			//updateStudent(studentDAO);

			deleteStudent(studentDAO);
		};
	}

	private void deleteStudent(StudentDAO studentDAO) {
		studentDAO.delete(1);
	}

	private void updateStudent(StudentDAO studentDAO) {

		// retrieve student based on the id: primary key
		Student student = studentDAO.findById(1);

		// change last name to "Booh"
		student.setLastName("Booh");

		// update the student
		studentDAO.update(student);

		// display the updated student
		System.out.println(student);
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		
		// get the list of students
		List<Student> students = studentDAO.findByLastName("G");

		// display list of students
		for (Student student : students) {
			System.out.println(student);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {

		// get a list of students
		List<Student> students = studentDAO.findAll();

		// display list of students
		for (Student student : students) {
			System.out.println(student);
		}
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
