package cs665.final_project.courses;

import cs665.final_project.person_factory.FullTimeFaculty;

import java.util.ArrayList;
import java.util.List;

public class Concentration {
    private List<Course> courses;
    private List<Concentration> subconcentrations;
    private FullTimeFaculty coordinator;
    private String name;
    private String description;

    public Concentration(String name, String description, ArrayList<Course> courses, FullTimeFaculty coordinator){
        this.courses = courses;
        this.coordinator = coordinator;
        this.name=name;
        this.description=description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Concentration> getSubconcentrations() {
        return subconcentrations;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public FullTimeFaculty getCoordinator() {
        return coordinator;
    }

    public String format(){
        String output = String.format("<div><div>%s</div><div>%s</div><div>%s</div></div>", this.getName(), this.getCoordinator(), this.getDescription());
        for (Course course : this.getCourses()){
            output += course.format();
        }
        for (Concentration concentration : this.getSubconcentrations()){
            output += concentration.format();
        }

        return output;
    }


}
