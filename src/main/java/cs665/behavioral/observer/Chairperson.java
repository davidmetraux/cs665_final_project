package cs665.behavioral.observer;

public class Chairperson implements Person{
    private String name;

    public Chairperson(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
