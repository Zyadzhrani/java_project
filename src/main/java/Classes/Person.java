package Classes;

public class Person {

    private String name;
    private int Age;
    private String stuff;


    // Methods
    public Person(){}
    public Person(String Name,int age, String Stuff){

        this.name = Name;
        this.Age = age;
        this.stuff=Stuff;
    }
  public String getName(){
        return this.name;
  }

  public void setName(String s){
        this.name = s;
  }
  public String getStuff(){
        return this.stuff;
  }
  public void setStuff(String s){
        this.stuff = s;
  }
  public int getAge(){
        return this.Age;
  }
  public void setAge(int age){
        this.Age=age;
  }
}
