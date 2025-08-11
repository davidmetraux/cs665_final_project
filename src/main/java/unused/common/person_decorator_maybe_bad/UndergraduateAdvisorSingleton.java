package unused.common.person_decorator_maybe_bad;

public class UndergraduateAdvisorSingleton {
    private static UndergraduateAdvisorSingleton single_instance = null;
    private static FullTimeFaculty advisor;

    private UndergraduateAdvisorSingleton(FullTimeFaculty advisor){
        setAdvisor(advisor);
    };

    private static void setAdvisor(FullTimeFaculty advisor){
        UndergraduateAdvisorSingleton.advisor = advisor;
    }

    public FullTimeFaculty getAdvisor() {
        return advisor;
    }

    public static UndergraduateAdvisorSingleton UndergraduateAdvisorSingleton(FullTimeFaculty advisor){
        if (single_instance == null) {
            single_instance = new UndergraduateAdvisorSingleton(advisor);
        } else {
            setAdvisor(advisor);
        }

        return single_instance;
    }


}
