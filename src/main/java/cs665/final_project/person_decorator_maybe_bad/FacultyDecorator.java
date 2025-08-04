package cs665.final_project.person_decorator_maybe_bad;

public abstract class FacultyDecorator implements Person{
    private Person decoratedFaculty;

    public FacultyDecorator(Person decoratedFaculty){
        this.decoratedFaculty = decoratedFaculty;
    }

    @Override
    public String getName() {
        return this.decoratedFaculty.getName();
    }
}
