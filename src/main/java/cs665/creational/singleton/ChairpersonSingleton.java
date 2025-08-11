package cs665.creational.singleton;



public class ChairpersonSingleton {
    private static ChairpersonSingleton single_instance = null;
    private static Faculty chairperson;

    private ChairpersonSingleton(Faculty chairperson){
        setChairperson(chairperson);
    };

    private static void setChairperson(Faculty chairperson){
        ChairpersonSingleton.chairperson = chairperson;
    }

    public static Faculty getChairperson() {
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
