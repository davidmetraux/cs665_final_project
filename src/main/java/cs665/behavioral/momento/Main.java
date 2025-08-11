package cs665.behavioral.momento;

public class Main {
    public static void main(String[] args) {
        Student alice = new Student("Alice");
        StudentCourseHistory studentCourseHistory = new StudentCourseHistory();

        Course course1 = new Course("Intro to CS");
        Course course2 = new Course("Intro to Python");

        alice.addCourse(course1);
        alice.addCourse(course2);

        StudentCoursesMomento semester1Memento = alice.createMemento();
        studentCourseHistory.addMemento(semester1Memento);

        System.out.println("Added courses to Alice for semester 1, saved a memento of this semester");
        System.out.println(alice);

        alice.newSemester();

        Course course3 = new Course("Outro to CS");
        Course course4 = new Course("Outro to Python");

        alice.addCourse(course3);
        alice.addCourse(course4);

        StudentCoursesMomento semester2Memento = alice.createMemento();
        studentCourseHistory.addMemento(semester2Memento);

        System.out.println("\nAdded courses to Alice for semester 2, saved a memento of this semester");
        System.out.println(alice);


        alice.restoreFromMemento(studentCourseHistory.getMemento(0));
        System.out.println("\nMaybe there was a mistake, and Alice didn't actuall attend semester 2. Reverting back to Semester 1");
        System.out.println(alice);

    }
}
