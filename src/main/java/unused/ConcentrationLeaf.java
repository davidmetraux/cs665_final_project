package unused;


import cs665.structural.composite.Course;

import java.util.List;


public class ConcentrationLeaf implements Concentration {

    private List<Course> courses;
    private String name;
    private String description;

    public ConcentrationLeaf(String name, String description, List<Course> courses){
        this.courses = courses;
        this.name=name;
        this.description=description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Course> getCourses() {
        return courses;
    }


    public String getCoordinator(){
        return "Coordinator";
    }



    public String format(){
        String output = String.format("<div><div>%s</div><div>%s</div></div>", this.getName(), this.getDescription());
        for (Course course : this.getCourses()){
            output += course.format();
        }
        return output;
    }
}
