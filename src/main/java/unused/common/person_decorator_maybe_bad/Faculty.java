package unused.common.person_decorator_maybe_bad;

public class Faculty implements Person{
    private String name;

    public Faculty(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
