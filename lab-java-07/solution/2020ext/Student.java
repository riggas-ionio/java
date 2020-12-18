import java.util.*;

public class Student extends Academic{
    public Student(String name){
        super(name, 1, 3);
    }

    @Override
    public String toString(){
        return "Student "+ super.toString();
    }
}
