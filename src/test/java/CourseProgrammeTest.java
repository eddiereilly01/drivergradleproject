import org.example.CourseProgramme;
import org.example.Lecturer;
import org.example.Student;
import org.example.Module;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class CourseProgrammeTest {


    @Test
    void addStudent() {
        CourseProgramme course = new CourseProgramme("CS&IT", new DateTime(2022, 9, 10, 0, 0), new DateTime(2023, 5, 20, 0, 0));
        try{
            course.addStudent(new Student(1, "Jerry Smith", 20, new DateTime("2002-10-14T10:11:12.123")));
        }catch(Exception e){
            fail();
        }
    }

    @Test
    void addModule() {
        CourseProgramme courseProgramme = new CourseProgramme("CS&IT", new DateTime(2022, 9, 10, 0, 0), new DateTime(2023, 5, 20, 0, 0));
        try{
            courseProgramme.addModule(new Module(1, "Programming",  new Lecturer(1, "Jerry Smith", 20, new DateTime("2002-10-14T10:11:12.123"))));
        }catch(Exception e){
            fail();
        }
    }

}
