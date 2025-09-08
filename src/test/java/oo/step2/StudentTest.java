package oo.step2;

import oo.Person;
import oo.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StudentTest {

    // when introduce a student, then return a message with name and age
@Test
void should_introduce_itself_when_given_a_person_of_student(){
    Student student=new Student(1,"Tom",18);
    assertEquals("My name is Tom. I am 18 years old. I am a student.",student.introduce());
}
    // when equals two same id student then return true
    @Test
    void should_return_true_when_equals_given_has_same_id(){
    Student student1=new Student(1,"Tom",18);
    Student student2=new Student(1,"Tom",19);
    assertEquals(student1,student2);
    }
    // when equals two different id student then return true
    @Test
    void should_return_true_when_equals_given_has_difference_id(){
        Student student1=new Student(1,"Tom",18);
        Student student2=new Student(3,"Tom",19);
        assertNotEquals(student1,student2);
    }
}
