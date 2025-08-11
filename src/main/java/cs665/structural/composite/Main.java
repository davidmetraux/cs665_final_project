package cs665.structural.composite;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Formattable course1 = new Course("Python Object Oriented", "Object oriented course for Python",
                "In this course, you will learn to use Python...");

        System.out.println("format of a single course, which is the leaf ");
        System.out.println(course1.format());

        Formattable course2 = new Course("Java Object Oriented", "Object oriented course for Java",
                "In this course, you will learn  use Java...");

        Formattable objectOrientedConcentration = new ConcentrationComposite("Object Oriented Languages", "This concentration focuses on using languages to implement Object Oriented design",
                Arrays.asList(course1, course2));

        System.out.println("\nformat of a concentration");
        System.out.println(objectOrientedConcentration.format());


        // making it empty because I already demonstrated adding courses
        Formattable proceduralConcentration = new ConcentrationComposite("Procedural Languages", "This concentration focuses on using languages to implement Procedural design",
               Arrays.asList());

        //I could add more courses here, but I don't want to make it more complicated
        Formattable programmingLanguagesConcentration = new ConcentrationComposite("Programming Languages", "This concentration focuses on programming languages in general",
                Arrays.asList(proceduralConcentration, objectOrientedConcentration));

        System.out.println("\nformat of a concentration that contains other concentrations");
        System.out.println(programmingLanguagesConcentration.format());
    }
}
