package Pack;

import Pack.Student;
import Pack.Course;
import Pack.StudentRepository;
import Pack.CourseRepository;

public class EnrollmentService {
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public EnrollmentService(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    public void enrollStudentInCourse(String studentId, String courseId) {
        Student student = studentRepository.getStudentById(studentId);
        Course course = courseRepository.getCourseById(courseId);

        if (student != null && course != null) {
            student.enrollCourse(courseId);
            course.enrollStudent(studentId);
        }
    }
}