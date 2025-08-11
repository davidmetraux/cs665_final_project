package cs665.creational.factory_method;

public class Main {
    public static void main(String[] args) {
        SimpleFacultyFactory facultyFactory =  new SimpleFacultyFactory();

        System.out.println("Creating chairperson");
        Faculty chairperson = facultyFactory.createFaculty("chairperson", "Ali");
        System.out.println(chairperson.toString());

        System.out.println("\nCreating part-time faculty");
        Faculty partTime = facultyFactory.createFaculty("parttime", "Bianca");
        System.out.println(partTime.toString());

        System.out.println("\nCreating full-time faculty");
        Faculty fullTime = facultyFactory.createFaculty("fulltime", "Candace");
        System.out.println(fullTime.toString());

        System.out.println("\nCreating graduate advisor faculty");
        Faculty gradAdvisor = facultyFactory.createFaculty("gradadvisor", "Daniela");
        System.out.println(gradAdvisor.toString());

        System.out.println("\nCreating undergraduate advisor faculty");
        Faculty undergraduateAdvisor = facultyFactory.createFaculty("undergradadvisor", "Erica");
        System.out.println(undergraduateAdvisor.toString());
    }
}
