package cs665.creational.factory_method;

public class UndergraduateAdvisor extends FullTimeFaculty{
    public UndergraduateAdvisor(String name) {
        super(name);
    }

    public String toString() {
        return "UndergraduateAdvisor:"+super.toString();
    }
}
