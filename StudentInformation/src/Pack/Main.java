package Pack;

import Pack.Student;
import Pack.Course;
import Pack.InMemoryStudentRepository;
import Pack.InMemoryCourseRepository;
import Pack.EnrollmentService;

public class Main {
    public static void main(String[] args) {
        // Create repositories
        InMemoryStudentRepository studentRepo = new InMemoryStudentRepository();
        InMemoryCourseRepository courseRepo = new InMemoryCourseRepository();
        
        // Create Enrollment Service
        EnrollmentService enrollmentService = new EnrollmentService(studentRepo, courseRepo);
        
        // Create some students
        Student student1 = new Student("John Doe", "S123");
        Student student2 = new Student("Jane Smith", "S456");
        
        // Add students to the repository
        studentRepo.addStudent(student1);
        studentRepo.addStudent(student2);
        
        // Create some courses
        Course course1 = new Course("C101", "Mathematics");
        Course course2 = new Course("C102", "Computer Science");
        
        // Add courses to the repository
        courseRepo.addCourse(course1);
        courseRepo.addCourse(course2);
        
        // Enroll students in courses
        enrollmentService.enrollStudentInCourse("S123", "C101");
        enrollmentService.enrollStudentInCourse("S456", "C102");
        
        // Print enrolled students for each course
        System.out.println("Students enrolled in Mathematics:");
        for (String studentId : course1.getEnrolledStudents()) {
            System.out.println(studentRepo.getStudentById(studentId).getName());
        }
        
        System.out.println("Students enrolled in Computer Science:");
        for (String studentId : course2.getEnrolledStudents()) {
            System.out.println(studentRepo.getStudentById(studentId).getName());
        }
    }
}
