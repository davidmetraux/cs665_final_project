package cs665.structural.facade;

import java.util.List;

public class DegreeProgram implements Program{
    private String name;
    private String type;
    private List<String> coreCourses;
    private List<String> electiveCourses;

    public DegreeProgram(String name, String type, List<String> coreCourses, List<String> electiveCourses){
        this.name = name;
        this.type = type;
        this.coreCourses = coreCourses;
        this.electiveCourses = electiveCourses;
    }

    @Override
    public String getDetails() {
        return String.format("%s:%s Degree. Core Courses: %s. Elective Courses: %s", this.name, this.type, this.coreCourses.toString(), this.electiveCourses.toString());
    }
}
