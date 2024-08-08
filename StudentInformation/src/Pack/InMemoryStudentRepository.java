package Pack;

import java.util.HashMap;
import java.util.Map;
import Pack.Student;

public class InMemoryStudentRepository implements StudentRepository {
    private Map<String, Student> students = new HashMap<>();

    @Override
    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public Student getStudentById(String id) {
        return students.get(id);
    }
}
