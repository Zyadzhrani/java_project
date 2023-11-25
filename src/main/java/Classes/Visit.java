package Classes;

import Classes.Person;

import java.util.ArrayList;
import java.util.Date;

public class Visit {

    private int Number_of_total_persons;
    private Date Time_spend;
    private ArrayList<Person> people;
    private String protocol;

    public Visit(){}

    public Visit(int number_of_total_persons,ArrayList people){
        this.Number_of_total_persons=number_of_total_persons;
        this.Time_spend = new Date();
        this.people = people;


    }
    public Visit(int number_of_total_persons,ArrayList people,String protocol){
        this.Number_of_total_persons=number_of_total_persons;
        this.Time_spend = new Date();
        this.people = people;
        this.protocol = protocol;

    }
    public int getNumber_of_total_persons(){return this.Number_of_total_persons;}

    public Person getpersonInfo(int PersonNumber){
         Person personinfo = people.get(PersonNumber);
        return personinfo;
    }
    public ArrayList get_All_persons(){

        return this.people;
    }

    public void setProtocol(String protocol){
        this.protocol = protocol;
    }

    public String getProtocol(){
        return this.protocol;
    }
}
