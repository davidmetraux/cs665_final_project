package cs665.final_project.person_factory;

public class ChairpersonSingleton {
    private static ChairpersonSingleton single_instance = null;
    private static FullTimeFaculty chairperson;

    private ChairpersonSingleton(Faculty chairperson){
        setChairperson(chairperson);
    };

    private static void setChairperson(Faculty advisor){
        ChairpersonSingleton.chairperson = chairperson;
    }

    public FullTimeFaculty getChairperson() {
        return chairperson;
    }

    public static ChairpersonSingleton ChairpersonSingleton(Faculty chairperson){
        if (single_instance == null) {
            single_instance = new ChairpersonSingleton(chairperson);
        } else {
            setChairperson(chairperson);
        }

        return single_instance;
    }


}
