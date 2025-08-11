package unused;

import cs665.structural.composite.Course;

import java.util.List;

public interface Concentration {
    String getName();
    String getDescription();
    List<Course> getCourses();
    String format();
    String getCoordinator();
}
