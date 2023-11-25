package Classes;

import java.util.ArrayList;

public class Officer extends Person implements CrowdManagment {

    private boolean Perform;


    public  Officer(String name , int age, String stuff){super(name,age,stuff);}
    public Officer(){}
    public  Officer(boolean perform,String name , int age, String stuff){
        super(name,age,stuff);
        this.Perform = perform;
    }

    @Override
    public String responsability() {
        return null;
    }

    public boolean getPerform(){
        return this.Perform;
    }


    @Override
    public void setPerform(boolean state){
        this.Perform = state;
    }

    public static boolean givePermission(String obj){
        // here some algorthim for permissions
        ArrayList<String> notAllowedStuff = new ArrayList<String>();

        notAllowedStuff.add("Back bag");
        notAllowedStuff.add("Forbidden item");
        notAllowedStuff.add("Another prohibited item");
        String person_item = obj;
        boolean found = notAllowedStuff.contains(person_item);
        if (found) {return false;}
        else {return true;}


    }

}
