package cs665.structural.facade;

public class Main {
    public static void main(String[] args) {
        ProgramProvider programProvider = new ProgramProviderImplementation();

        System.out.println("\nGetting Undergrad Degree in CS");
        System.out.println(programProvider.getUndergradCS().getDetails());

        System.out.println("\nGetting Undergrad Degree in CIS");
        System.out.println(programProvider.getUndergradCIS().getDetails());

        System.out.println("\nGetting Grad Degree in CS");
        System.out.println(programProvider.getGradCS().getDetails());

        System.out.println("\nGetting Grad Degree in CIS");
        System.out.println(programProvider.getGradCIS().getDetails());

        System.out.println("\nGetting Grad Degree in Digital Arts");
        System.out.println(programProvider.getGradDA().getDetails());

        System.out.println("\nGetting Certificate in Security");
        System.out.println(programProvider.getCertSec().getDetails());

        System.out.println("\nGetting Certificate in Web Technologies");
        System.out.println(programProvider.getCertWeb().getDetails());

        System.out.println("\nGetting Certificate in Analytics");
        System.out.println(programProvider.getCertAnalytics().getDetails());
    }
}
