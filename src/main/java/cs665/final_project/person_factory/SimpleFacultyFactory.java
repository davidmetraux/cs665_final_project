package cs665.final_project.person_factory;

public class SimpleFacultyFactory {
    public Faculty createFaculty(String type, String name){
        Faculty faculty = null;

        switch(type) {
            case "chairperson":
                 faculty = new Faculty(name);
                 ChairpersonSingleton.ChairpersonSingleton(faculty);
                break;
            case "fulltime":
                 faculty = new FullTimeFaculty(name);
                break;
            case "parttime":
                 faculty = new PartTimeFaculty(name);
                 break;
            case "gradadvisor":
                faculty = new FullTimeFaculty(name);
                GraduateAdvisorSingleton.GraduateAdvisorSingleton((FullTimeFaculty) faculty);
                break;
            case "undergradadvisor":
                faculty = new FullTimeFaculty(name);
                UndergraduateAdvisorSingleton.UndergraduateAdvisorSingleton((FullTimeFaculty) faculty);
                break;
        }

        return faculty;
    }
}

