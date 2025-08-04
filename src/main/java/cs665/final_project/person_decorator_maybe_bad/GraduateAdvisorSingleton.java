package cs665.final_project.person_decorator_maybe_bad;

public class GraduateAdvisorSingleton {
    private static GraduateAdvisorSingleton single_instance = null;
    private static FullTimeFaculty advisor;

    private GraduateAdvisorSingleton(FullTimeFaculty advisor){
        setAdvisor(advisor);
    };

    private static void setAdvisor(FullTimeFaculty advisor) {
        GraduateAdvisorSingleton.advisor = advisor;
    }

    public FullTimeFaculty getAdvisor() {
        return advisor;
    }

    public static GraduateAdvisorSingleton GraduateAdvisorSingleton(FullTimeFaculty advisor){
        if (single_instance == null) {
            single_instance = new GraduateAdvisorSingleton(advisor);
        } else {
            setAdvisor(advisor);
        }

        return single_instance;
    }


}
