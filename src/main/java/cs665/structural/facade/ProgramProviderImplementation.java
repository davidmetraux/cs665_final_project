package cs665.structural.facade;


import java.util.Arrays;
import java.util.List;

public class ProgramProviderImplementation implements ProgramProvider{

    //Imagine each variable that mentions a database is getting those values from a database
    @Override
    public Program getUndergradCS() {
        List<String> coreCoursesFromDB = Arrays.asList("Intro to CS", "Programming on Purpose", "Python", "Java", "etc");
        List<String> electiveCoursesFromDB = Arrays.asList("Javascript", "Databases", "etc");
        return new DegreeProgram("Computer Science", "Undergraduate", coreCoursesFromDB, electiveCoursesFromDB);
    }

    @Override
    public Program getUndergradCIS() {
        List<String> coreCoursesFromDB = Arrays.asList("Intro to CIS", "Information Systems", "Python", "Java", "etc");
        List<String> electiveCoursesFromDB = Arrays.asList("Django", "Databases", "etc");
        return new DegreeProgram("Computer & Information Systems", "Undergraduate", coreCoursesFromDB, electiveCoursesFromDB);
    }

    @Override
    public Program getGradCS() {
        List<String> coreCoursesFromDB = Arrays.asList("Advanced CS", "Advanced Programming on Purpose", "Python", "Java", "etc");
        List<String> electiveCoursesFromDB = Arrays.asList("Javascript", "Databases", "etc");
        return new DegreeProgram("Computer Science", "Graduate", coreCoursesFromDB, electiveCoursesFromDB);
    }

    @Override
    public Program getGradCIS() {
        List<String> coreCoursesFromDB = Arrays.asList("Advanced CIS", "Advanced Information Systems", "Python", "Java", "etc");
        List<String> electiveCoursesFromDB = Arrays.asList("Django", "Databases", "etc");
        return new DegreeProgram("Computer & Information Systems", "Graduate", coreCoursesFromDB, electiveCoursesFromDB);
    }

    @Override
    public Program getGradDA() {
        List<String> coreCoursesFromDB = Arrays.asList("Advanced DA", "Making your Art Look Good", "Photoshop", "Web Design");
        List<String> electiveCoursesFromDB = Arrays.asList("Vector Graphics", "Flexbox", "etc");
        return new DegreeProgram("Digital Art", "Graduate", coreCoursesFromDB, electiveCoursesFromDB);
    }

    @Override
    public Program getCertSec() {
        List<String> coursesFromDB = Arrays.asList("Security", "How not to share passwords", "How to deal with malware", "How to close endpoints");
        return new CertificateProgram("Security",coursesFromDB);
    }

    @Override
    public Program getCertWeb() {
        List<String> coursesFromDB = Arrays.asList("Javascript", "Flexbox", "Container Module", "HTML");
        return new CertificateProgram("Web Technology",coursesFromDB);
    }

    @Override
    public Program getCertAnalytics() {
        List<String> coursesFromDB = Arrays.asList("R", "Statistics", "Databases", "Google Analytics");
        return new CertificateProgram("Analytics",coursesFromDB);
    }
}
