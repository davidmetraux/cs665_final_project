package cs665.creational.factory_method;

public class Chairperson extends Faculty{
    public Chairperson(String name) {
        super(name);
    }

    public String toString() {
        return "Chairperson:"+super.toString();
    }
}
