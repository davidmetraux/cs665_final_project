package cs665.creational.factory_method;


public class Faculty {
    private String name;

    public Faculty(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString(){
        return this.getName();
    }
}
