package practiceJava.OOPs1;


	@SuppressWarnings("serial")
	public class StudentNotFoundException extends Exception
{

    public StudentNotFoundException( )
    {
        super( "Student not found!" );
    }
}