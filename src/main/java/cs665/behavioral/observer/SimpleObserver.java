package cs665.behavioral.observer;


public class SimpleObserver implements Observer {
    private Person person;
    private String value;
    private Subject subject;

    public SimpleObserver(Subject subject, Person person){
        this.person = person;
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(String value) {
        this.value = value;
        this.display();

    }

    public void display() {
        System.out.println("Message received by "+this.person.getName()+" : "+ this.value);
    }
}
