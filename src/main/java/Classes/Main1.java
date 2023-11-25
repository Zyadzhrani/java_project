package Classes;

import java.util.ArrayList;
import java.util.Random;
import java.util.Date;



public class Main1 {
    public static void main(String[] args) {
    	
    	int totalLines = 5;
        Date startTime = new Date();
        int totalPeople = 100;
        ArrayList<Person> people = generatePeople(totalPeople);
    
    
     	
    	ArrayList<ArrayList<Person>> lines = new ArrayList<>(totalLines);
    	for (int i = 0; i < totalLines; i++) {
    		lines.add(new ArrayList<>());
    	}
    	Random random = new Random(System.currentTimeMillis());
        for (Person person : people) {
            int lineIndex = random.nextInt(totalLines);
            lines.get(lineIndex).add(person);
        }
        Date endTime = new Date();

        int totalTime = calculateTotalTime(lines);
        
        long elapsedTimeMillis = endTime.getTime() - startTime.getTime();
        long elapsedTimeSeconds = elapsedTimeMillis / 1000;
        
        System.out.println("Total time taken for all people to move through the room: " + totalTime + " seconds");
        System.out.println("Elapsed time: " + elapsedTimeSeconds + " seconds");        
        
        
    }
    public static ArrayList<Person> generatePeople(int totalPeople) {
    	ArrayList<Person> people = new ArrayList<>();
        Random random = new Random();

        int adultCount = (int) (totalPeople * 0.50); // 50% adults
        int childrenCount = (int) (totalPeople * 0.10); // 10% children
        int elderlyCount = (int) (totalPeople * 0.25); // 25% elderly
        int wheelchairCount = (int) (totalPeople * 0.15); // 15% wheelchair persons

        for (int i = 0; i < adultCount; i++) {
            // Generate adults
            int randomAge = random.nextInt(46) + 14; // Adults between 14 and 59 years old
            String randomName = generateRandomName();
            String randomStuff = generateRandomStuff();
            Adult adult = new Adult("", 0, ""); 
            adult.setAge(randomAge);
            adult.setName(randomName);
            adult.setStuff(randomStuff);
            people.add(adult);
        }

        for (int i = 0; i < childrenCount; i++) {
            int randomAge = random.nextInt(14); // Children under 14 years old
            String randomName = generateRandomName();
            String randomStuff = generateRandomStuff();
            Child child = new Child("", 0, ""); 
            child.setAge(randomAge);
            child.setName(randomName);
            child.setStuff(randomStuff);
            people.add(child);   
        }

        for (int i = 0; i < elderlyCount; i++) {
            // Generate elderly
            int randomAge = random.nextInt(51) + 60; // Elderly between 60 and 110 years old
            String randomName = generateRandomName();
            String randomStuff = generateRandomStuff();
            Elderly elderly = new Elderly("", 0, ""); 
            elderly.setAge(randomAge);
            elderly.setName(randomName);
            elderly.setStuff(randomStuff);
            people.add(elderly);    
        }

        for (int i = 0; i < wheelchairCount; i++) {
            int randomAge = random.nextInt(101); // Wheelchair persons between 0 and 100 years old
            String randomName = generateRandomName();
            String randomStuff = generateRandomStuff();
            WheelchairPerson wheelchairPerson = new WheelchairPerson("", 0, ""); 
            wheelchairPerson.setAge(randomAge);
            wheelchairPerson.setName(randomName);
            wheelchairPerson.setStuff(randomStuff);
            people.add(wheelchairPerson);  
        }
        return people;
        
    }
    	
    
    public static String generateRandomName() {
    		final String[] firstNames = {
    		    "Ahmad", "Mohammed", "Youssef", "Ali", "Omar", "Khalid", "Ibrahim", "Hassan", "Abdullah", "Sami",
    		    "Faisal", "Nasser", "Adham", "Tariq", "Hadi", "Mustafa", "Majid", "Rashid", "Jamal", "Karim",
    		    "Nabil", "Jawad", "Saeed", "Mahmoud", "Anwar", "Raed", "Tamer", "Waleed", "Hisham", "Zakaria",
    		    "Yasin", "Amr", "Faris", "Bilal", "Hatem", "Amin", "Sultan", "Salem", "Rami", "Hazem",
    		    "Ismail", "Kareem", "Marwan", "Osama", "Samir", "Yahya", "Walid", "Imad", "Majed"
    			};

    		final String[] lastNames = {
    		    "Ahmed", "Khalid", "Ali", "Said", "Hassan", "Abdullah", "Mahmoud", "Rashid", "Nasser", "Gaber",
    		    "Salah", "Omar", "Fahmy", "Tawfik", "Saeed", "Gad", "Hakim", "Ibrahim", "Hamdi", "Amer",
    		    "Farag", "Hussein", "Shalaby", "Sharif", "Mansour", "Badawi", "Rizk", "Hegazy", "Sobhy",
    		    "Ayyad", "Magdy", "Taha", "Hammad", "Naguib", "Haroun", "Sakr", "Shawky", "Bakr", "El-Din",
    		    "Khattab", "Makram", "Serry", "Gomaa", "Radwan", "Hamouda", "El-Sayed", "El-Dawla", "Fathy",
    		    "El-Sherif", "Attia"
    			};
            Random random = new Random();
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            String randomFirstandSecondNames = firstName + " " + lastName;
            return randomFirstandSecondNames; 
    }
    public static String generateRandomStuff() {
    	final String[] stuff = {"null", "back bag", "shoes", "hand bag"};
        Random random = new Random();
    	String aStuff = stuff[random.nextInt(stuff.length)];
    	return aStuff;
    }
    public static int calculateTotalTime(ArrayList<ArrayList<Person>> lines) {
//        int totalTime = 0;
//
//        boolean peopleLeft = true;
//
//        while (peopleLeft) {
//            peopleLeft = false;
//
//            for (ArrayList<Person> line : lines) {
//                if (!line.isEmpty()) {
//                    peopleLeft = true;
//                    Person currentPerson = line.remove(0);
//                    int delay = calculateDelay(line, currentPerson);
//                    totalTime += delay;
//                }
//            }
//        }
    	int totalTime = 0;

        while (!allLinesEmpty(lines)) {
            for (ArrayList<Person> line : lines) {
                if (!line.isEmpty()) {
                    Person currentPerson = line.remove(0);
                    int delay = calculateDelay(line, currentPerson);
                    totalTime += delay;
                }
            }
        }

      
        return totalTime;
    }
    public static int calculateDelay(ArrayList<Person> line, Person currentPerson) {
        int movementSpeed;
        if (currentPerson instanceof Elderly) {
            movementSpeed = 2; 
        } else if (currentPerson instanceof WheelchairPerson) {
            movementSpeed = 3; 
        } else if (currentPerson instanceof Child) {
            movementSpeed = 4; 
        } else {
            movementSpeed = 5; 
        }

        if (!line.isEmpty()) {
            Person personInFront = line.get(0);
            int delay = calculateTime(movementSpeed) - calculateTime(getSpeed(personInFront));
            return Math.max(delay, 0); 
        }

        return 0;
    }
    public static int getSpeed(Person person) {
        if (person instanceof Elderly) {
            return 2;
        } else if (person instanceof WheelchairPerson) {
            return 3;
        } else if (person instanceof Child) {
            return 4;
        } else {
            return 5;
        }
    }
    public static int calculateTime(int speed) {
        
        int distance = 200; 

        // Time = Distance / Speed
        return distance / speed;
    }
    public static boolean allLinesEmpty(ArrayList<ArrayList<Person>> lines) {
        for (ArrayList<Person> line : lines) {
            if (!line.isEmpty()) {
                return false;
            }
        }
        return true;
    }
    
}