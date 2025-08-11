package cs665.structural.facade;

import java.util.List;

public class CertificateProgram implements Program{
    private String name;
    private List<String> courses;

    public CertificateProgram(String name, List<String> courses){
        this.name = name;
        this.courses = courses;
    }

    @Override
    public String getDetails() {
        return String.format("%s Certificate. Courses: %s", this.name,  this.courses.toString());
    }
}