package Classes;

import Classes.Helper;
import Classes.Person;

public class WheelchairPerson extends Person {
    private boolean Permission;
    private Helper isHelperNeeded;


    public WheelchairPerson(String Name,int age, String Stuff){
        super(Name,age,Stuff);
    }


    public WheelchairPerson(Helper state,String Name,int age, String Stuff){
        super(Name,age,Stuff);
        this.isHelperNeeded = state;
    }

    public boolean getPermission(){

        return this.Permission;
    }
}
