package cs665.creational.singleton;


public class UndergraduateAdvisorSingleton {
    private static UndergraduateAdvisorSingleton single_instance = null;
    private static Faculty advisor;

    private UndergraduateAdvisorSingleton(Faculty advisor){
        setAdvisor(advisor);
    };

    private static void setAdvisor(Faculty advisor){
        UndergraduateAdvisorSingleton.advisor = advisor;
    }

    public static Faculty getAdvisor() {
        return advisor;
    }

    public static UndergraduateAdvisorSingleton UndergraduateAdvisorSingleton(Faculty advisor){
        if (single_instance == null) {
            single_instance = new UndergraduateAdvisorSingleton(advisor);
        } else {
            setAdvisor(advisor);
        }

        return single_instance;
    }


}
