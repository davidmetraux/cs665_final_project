package cs665.behavioral.memento;

public class Course {
    private String name;

    public Course(String name){
        this.name= name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
