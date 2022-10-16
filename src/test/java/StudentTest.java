import org.example.Lecturer;
import org.example.Student;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StudentTest {
    @Test
    void testGetUsername() {
        Student student1 = new Student(1, "Jerry Smith", 20, new DateTime("2002-10-14T10:11:12.123"));
        assertNotNull(student1.getUsername());
    }
}
