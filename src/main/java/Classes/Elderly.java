package Classes;

public class Elderly extends Person {
    private boolean Permission;
    private Helper isHelperNeeded;


    public Elderly(String Name,int age, String Stuff){ super(Name,age,Stuff);}

    public Elderly(Helper state, String Name, int age, String Stuff){
        super(Name,age,Stuff);
        this.isHelperNeeded = state;
    }

    public boolean getPermission(){

        return this.Permission;
    }


}
