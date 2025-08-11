package cs665.creational.factory_method;

public class FullTimeFaculty extends Faculty{
    public FullTimeFaculty(String name) {
        super(name);
    }

    public String toString() {
        return "FullTimeFaculty:"+super.toString();
    }
}
