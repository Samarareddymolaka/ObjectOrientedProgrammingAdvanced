Object Oriented Programming - Advanced


Part 1: Packages, Access Modifiers and Encapsulation
Go through the entire project and read the different classes and components trying to understand the logic behind.
Created at least two packages to organize your project better. Move the corresponding classes to the packages.
Modify the Student class so it follows the encapsulation principle keeping data private to the class.
Modify the Course class so it follows the encapsulation principle keeping data private to the class.
Modify the StudentService class so it follows the encapsulation principle:
Make data private so it can only be modified inside the class.
Create a method that lets add students and use that in the main function.
Part 2: Using collections with objects
Implment the following functions in the StudentService class:
   public void showEnrolledStudents(String courseId){
        //TODO implement using collections loops
   }
   
   public void showAllCourses(){
       //TODO implement using collections loops
   }
Part 3: Using Java Exeptions
Modify the enrollStudents method to verify:
if the Course does not exists throw a CourseNotFoundException.
if the Student does not exists throw a StudentNotFoundException.
       public void enrollStudents( String courseName, String studentID )
    {
        Course course = courseList.get( courseName );

        if ( !coursesEnrolledByStudents.containsKey( studentID ) )
        {
            coursesEnrolledByStudents.put( studentID, new ArrayList<>() );
        }
        coursesEnrolledByStudents.get( studentID ).add( course );
    }
Challenge yourselff
Modify the unEnrollStudents method to verify:
if the Course does not exists throw a CourseNotFoundException.
if the Student does not exists throw a StudentNotFoundException.
       public void enrollStudents( String courseName, String studentID )
    {
        Course course = courseList.get( courseName );

        if ( !coursesEnrolledByStudents.containsKey( studentID ) )
        {
            coursesEnrolledByStudents.put( studentID, new ArrayList<>() );
        }
        coursesEnrolledByStudents.get( studentID ).add( course );
    }
