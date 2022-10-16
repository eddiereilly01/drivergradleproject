import org.example.Lecturer;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LecturerTest {

    @Test
    void testGetUsername() {
        Lecturer lecturer1 = new Lecturer(1, "Jerry Smith", 20, new DateTime("2002-10-14T10:11:12.123"));
        assertNotNull(lecturer1.getUsername());
    }
}
