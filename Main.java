package practiceJava.OOPs1;
/*
 * Part 1: Packages, Access Modifiers and Encapsulation
Download the source code, import the project into IntelliJ Idea and run it to verify it works correctly.
Go through the entire project and read the different classes and components trying to understand the logic behind.
Create at least two packages to organize your project better. Move the corresponding classes to the packages.
Modify the Student class so it follows the encapsulation principle keeping data private to the class.
Modify the Course class so it follows the encapsulation principle keeping data private to the class.
Modify the StudentService class so it follows the encapsulation principle:
Make data private so it can only be modified inside the class.
Create a method that lets you add students and use that in the main function.
 */


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StudentService studentService = new StudentService();
		    //TODO refactor this code to use encapsulation inside studentsService
	        studentService.students.put( "1030", new Student( "Carlos", "1030", 31 ) );
	        studentService.students.put( "1040", new Student( "Ian", "1020", 28 ) );
	        studentService.students.put( "1050", new Student( "Elise", "1020", 26 ) );
	        studentService.students.put( "1020", new Student( "Santiago", "1020", 33 ) );

	        studentService.enrollStudents( "Math", "1030" );

	}

}
