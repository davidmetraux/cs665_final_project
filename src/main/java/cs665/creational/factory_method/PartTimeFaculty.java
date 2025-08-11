package cs665.creational.factory_method;

public class PartTimeFaculty extends Faculty{
    public PartTimeFaculty(String name) {
        super(name);
    }

    public String toString() {
        return "PartTimeFaculty:"+super.toString();
    }
}
