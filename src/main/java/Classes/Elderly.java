package Classes;

public class Elderly extends Person  {
    private boolean Permission;


    public Elderly(String Name,int age, String Stuff){ super(Name,age,Stuff);
        this.Permission = Officer.givePermission(Stuff);


    }

    public Elderly(Helper state, String Name, int age, String Stuff){
        super(Name,age,Stuff);
        this.Permission = Officer.givePermission(Stuff);
    }

    public boolean getPermission(){
        return this.Permission;
    }


}
