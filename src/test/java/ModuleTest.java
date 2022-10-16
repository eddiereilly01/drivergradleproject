import org.example.Lecturer;
import org.example.Module;
import org.example.Student;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class ModuleTest {


    @Test
    void addStudent() {
        Module module = new Module(1, "Programming", new Lecturer(1, "Bob Smith", 34, new DateTime(1984,1,1,1,1)));
        try{
            module.addStudent( new Student(1, "Jerry Smith", 20, new DateTime("2002-10-14T10:11:12.123")));
        }catch(Exception e){
            fail();
        }
    }


}
