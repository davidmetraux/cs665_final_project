package cs665.creational.factory_method;

public class GraduateAdvisor extends FullTimeFaculty{
    public GraduateAdvisor(String name) {
        super(name);
    }

    public String toString() {
        return "GraduateAdvisor:"+super.toString();
    }
}
