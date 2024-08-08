package Pack;

import Pack.Course;

public interface CourseRepository {
    void addCourse(Course course);
    Course getCourseById(String id);
}
