package practiceJava.OOPs1;

import java.util.ArrayList;
import java.util.List;

public class Student
{
    public String name;

    public String id;

    public int age;

    public final List<Course> courseList = new ArrayList<>();

    public Student( String name, String id, int age)
    {
        this.name = name;
        this.id = id;
        this.age = age;
    }
}