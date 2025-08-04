package cs665.final_project.person_factory;


public class Faculty implements Person {
    private String name;

    public Faculty(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
