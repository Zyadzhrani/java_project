package Classes;

import Classes.Helper;
import Classes.Person;

public class WheelchairPerson extends Person {
    private boolean Permission;
    private Helper isHelperNeeded = new Helper(true);


    public WheelchairPerson(String Name,int age, String Stuff){
        super(Name,age,Stuff);
        this.Permission = Officer.givePermission(Stuff);

    }


    public WheelchairPerson(Helper state,String Name,int age, String Stuff){
        super(Name,age,Stuff);
        this.isHelperNeeded = state;
        this.Permission = Officer.givePermission(Stuff);

    }

    public boolean getPermission(){

        return this.Permission;
    }
}
