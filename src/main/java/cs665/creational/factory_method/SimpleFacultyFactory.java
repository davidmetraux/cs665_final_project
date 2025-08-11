package cs665.creational.factory_method;


public class SimpleFacultyFactory {
    public Faculty createFaculty(String type, String name){
        Faculty faculty = null;

        switch(type) {
            case "chairperson":
                 faculty = new Chairperson(name);
                break;
            case "fulltime":
                 faculty = new FullTimeFaculty(name);
                break;
            case "parttime":
                 faculty = new PartTimeFaculty(name);
                 break;
            case "gradadvisor":
                faculty = new GraduateAdvisor(name);
                break;
            case "undergradadvisor":
                faculty = new UndergraduateAdvisor(name);
                break;
        }

        return faculty;
    }
}

