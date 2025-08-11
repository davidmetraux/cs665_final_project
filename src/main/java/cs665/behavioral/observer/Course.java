package cs665.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private List<Student> studentsInCourse = new ArrayList<>();
    private List<Student> waitList = new ArrayList<>();
    private int maxSize;
    private String name;

    private final SimpleSubject waitListSubject = new SimpleSubject();
    private SimpleObserver waitListObserver;

    private final SimpleSubject chairPersonSubject = new SimpleSubject();

    public Course(String name, int maxSize, Person chairperson){
        this.name = name;
        this.maxSize = maxSize;
        new SimpleObserver(this.chairPersonSubject, chairperson);
    }

    public void addStudentToCourseOrWaitlist(Student student){
        if (studentsInCourse.size() == maxSize){
            waitList.add(student);

            if (this.waitListObserver == null){
                this.waitListObserver = new SimpleObserver(this.waitListSubject, student);
            }


        } else {
            studentsInCourse.add(student);
            if (studentsInCourse.size() == maxSize) {
                this.chairPersonSubject.setValue(this.name+" is full.");
            }
        }
    }

    public void removeStudentFromCourse(Student student){
        Boolean removed = studentsInCourse.remove(student);
        if (removed && !waitList.isEmpty()){
            Student movedStudent = waitList.getFirst();
            this.studentsInCourse.add(movedStudent);
            this.waitList.removeFirst();

            //notify movedStudent
            this.waitListSubject.setValue("You are now registered for " + this.name);

            // remove student from subject and stop keeping track of them
            this.waitListSubject.removeObserver(this.waitListObserver);
            this.waitListObserver = null;

            // get new Student Observer
            if (!waitList.isEmpty()){
                this.waitListObserver = new SimpleObserver(this.waitListSubject, this.waitList.getFirst());
            }
        }

    }
}
