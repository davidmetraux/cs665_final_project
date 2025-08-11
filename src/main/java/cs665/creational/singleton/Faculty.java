package cs665.creational.singleton;


public class Faculty {
    private String name;

    public Faculty(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
