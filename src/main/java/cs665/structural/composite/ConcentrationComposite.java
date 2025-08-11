package cs665.structural.composite;

import java.util.List;

public class ConcentrationComposite implements Formattable {
    private List<Formattable> coursesAndConcentrations;
    private String name;
    private String description;

    public ConcentrationComposite(String name, String description, List<Formattable> coursesAndConcentrations){
        this.coursesAndConcentrations = coursesAndConcentrations;
        this.name=name;
        this.description=description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }



    public List<Formattable> getFormattable() {
        return coursesAndConcentrations;
    }



    public String format(){
        String output = String.format("<div><div>%s</div><div>%s</div></div>", this.getName(), this.getDescription());
        for (Formattable courseOrConcentration : this.getFormattable()){
            output += courseOrConcentration.format();
        }

        return output;
    }



}
