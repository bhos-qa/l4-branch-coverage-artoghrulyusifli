import my_classroom.Classroom;
import java.util.*;
import java.lang.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ClassroomTest {
    Classroom cybsec = new Classroom(2019,"Infosec",24,24,150,"Karam Karimov");

    @Test
    void test1(){
        assertEquals(2019, cybsec.getEntryYear());
    }
    @Test
    void test2(){
        assertEquals(1200, cybsec.getMinimumTotalCredits());
    }
    @Test
    void test3(){
        assertEquals(24, cybsec.getTotalNumberOfStudents());
    }
    @Test
    void test4(){
        assertEquals(2024, cybsec.getGraduationYear());
    }
    @Test
    void test5(){
        assertEquals("Karam Karimov", cybsec.getNameOfCurator());
    }
}
