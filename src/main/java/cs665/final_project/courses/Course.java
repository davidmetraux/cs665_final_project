package cs665.final_project.courses;

import cs665.final_project.person_factory.Faculty;

public class Course {
    private String name;
    private String description;
    private String syllabus;
    private Faculty professor;


    public Course(String name, String description, String syllabus, Faculty professor){
        this.name = name;
        this.description = description;
        this.syllabus = syllabus;
        this.professor = professor;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription() {
        return description;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public Faculty getProfessor() {
        return professor;
    }

    public String format(){
        return String.format("<div><div>%s</div><div>%s</div><div>%s</div><div>%s</div></div>",this.getName(), this.getProfessor(), this.getDescription(),this.getSyllabus());
    }
}
