package cs665.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Student alice = new Student("Alice");
        Student bianca = new Student("Bianca");
        Student candace = new Student("Candace");
        Student daniela = new Student("Daniela");
        Student erica = new Student("erica");

        Chairperson charlotte = new Chairperson("Charlotte");

        //Chairperson will be added as an observer
        Course introCourse = new Course("Intro to CS", 2, charlotte);

        // students enrolling. If the course becomes filled, the chairperson will be notified by telling the subject to
        // notify the chairperson observer.
        // If the course is already filled, they will be added to a waitlist, and if they are the first student
        // in the waitlist, they will be made as an observer
        introCourse.addStudentToCourseOrWaitlist(alice);
        introCourse.addStudentToCourseOrWaitlist(bianca);
        introCourse.addStudentToCourseOrWaitlist(candace);

        //student dropping
        // If there is a student in the waitlist, the first student will be notified, removed from the waitlist,
        // and added to the students in the course. The next person in the waitlist will be made into an observer.
        introCourse.removeStudentFromCourse(alice);

        introCourse.addStudentToCourseOrWaitlist(daniela);
        introCourse.addStudentToCourseOrWaitlist(erica);

        introCourse.removeStudentFromCourse(bianca);
    }
}
