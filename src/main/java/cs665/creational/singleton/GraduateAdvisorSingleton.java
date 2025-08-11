package cs665.creational.singleton;

public class GraduateAdvisorSingleton {
    private static GraduateAdvisorSingleton single_instance = null;
    private static Faculty advisor;

    private GraduateAdvisorSingleton(Faculty advisor){
        setAdvisor(advisor);
    };

    private static void setAdvisor(Faculty advisor) {
        GraduateAdvisorSingleton.advisor = advisor;
    }

    public static Faculty getAdvisor() {
        return advisor;
    }

    public static GraduateAdvisorSingleton GraduateAdvisorSingleton(Faculty advisor){
        if (single_instance == null) {
            single_instance = new GraduateAdvisorSingleton(advisor);
        } else {
            setAdvisor(advisor);
        }

        return single_instance;
    }


}
