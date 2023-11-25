package Classes;

import Classes.CrowdManagment;

public class Helper extends Person implements CrowdManagment {
    private boolean perform;

    // Default constructor
    public  Helper( boolean perform){this.perform = perform;}
    public Helper(String Name,int age, String Stuff){ super(Name,age,Stuff);}
    // Constructor with perform parameter
    public Helper( boolean perform,String Name,int age, String Stuff) {
        super(Name,age,Stuff);
        this.perform = perform;
    }

    @Override
    public String responsability() {
        if (perform) {
            return "Performing the task.";
        } else {
            return "Not performing the task.";
        }
    }

    // Getter for perform
    public boolean getPerform() {
        return this.perform;
    }

    // Setter for perform
    public void setPerform(boolean perform) {
        this.perform = perform;
    }


}
