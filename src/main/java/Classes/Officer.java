package Classes;

import Classes.CrowdManagment;

public class Officer extends Person implements CrowdManagment {

    private boolean Perform;


    public  Officer(String name , int age, String stuff){super(name,age,stuff);}

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

    public boolean givePermission(Person obj){
        // here some algorthim for permissions

        return true;
    }
}
