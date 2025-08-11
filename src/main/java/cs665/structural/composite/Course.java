package cs665.structural.composite;

public class Course implements Formattable{
    private String name;
    private String description;
    private String syllabus;



    public Course(String name, String description, String syllabus){
        this.name = name;
        this.description = description;
        this.syllabus = syllabus;
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

    public String format(){
        return String.format("<div><div>%s</div><div>%s</div><div>%s</div></div>",this.getName(), this.getDescription(),this.getSyllabus());
    }
}
