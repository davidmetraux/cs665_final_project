package cs665.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Faculty person1 = new Faculty("Alice");
        Faculty person2 = new Faculty("Bianca");
        Faculty person3 = new Faculty("Candace");
        Faculty person4 = new Faculty("Erica");

        System.out.println("\nSetting Alice as Chairperson then retrieving her");
        ChairpersonSingleton.ChairpersonSingleton(person1);
        System.out.println(ChairpersonSingleton.getChairperson());

        System.out.println("\nSetting Bianca as Chairperson then retrieving her");
        ChairpersonSingleton.ChairpersonSingleton(person2);
        System.out.println(ChairpersonSingleton.getChairperson());

        System.out.println("\nSetting Alice as Graduate Advisor then retrieving her");
        GraduateAdvisorSingleton.GraduateAdvisorSingleton(person1);
        System.out.println(GraduateAdvisorSingleton.getAdvisor());

        System.out.println("\nSetting Candace as Graduate Advisor then retrieving her");
        GraduateAdvisorSingleton.GraduateAdvisorSingleton(person3);
        System.out.println(GraduateAdvisorSingleton.getAdvisor());


        System.out.println("\nSetting Alice as Undergraduate Advisor then retrieving her");
        UndergraduateAdvisorSingleton.UndergraduateAdvisorSingleton(person1);
        System.out.println(UndergraduateAdvisorSingleton.getAdvisor());

        System.out.println("\nSetting Erica as Undergraduate Advisor then retrieving her");
        UndergraduateAdvisorSingleton.UndergraduateAdvisorSingleton(person4);
        System.out.println(UndergraduateAdvisorSingleton.getAdvisor());
    }
}
