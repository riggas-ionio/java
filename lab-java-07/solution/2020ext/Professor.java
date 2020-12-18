import java.util.*;

public class Professor extends Academic{
    public Professor(String name){
        super(name, 3, 8);
    }

    @Override
    public String toString(){
        return "Prof. "+ super.toString();
    }
}
