package Pack;

import Pack.Course;
import java.util.HashMap;
import java.util.Map;

public class InMemoryCourseRepository implements CourseRepository {
    private Map<String, Course> courses = new HashMap<>();

    @Override
    public void addCourse(Course course) {
        courses.put(course.getId(), course);
    }

    @Override
    public Course getCourseById(String id) {
        return courses.get(id);
    }
}
