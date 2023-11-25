package Classes;

public class Adult extends Person {

    private boolean Permission;


    public Adult(String Name, int age, String Stuff) {
        super(Name, age, Stuff);
    }

    public boolean getPermission() {

        return this.Permission;
    }
}
