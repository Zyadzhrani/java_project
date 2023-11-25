package Classes;

public class Child extends Person   {

    private boolean Permission;


    public Child(String Name, int age, String Stuff) {
        super(Name, age, Stuff);
        this.Permission = Officer.givePermission(Stuff);

    }

    public boolean getPermission() {

        return this.Permission;
    }


}
