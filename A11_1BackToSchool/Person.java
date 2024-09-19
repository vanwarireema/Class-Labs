/**
 * Creates a class Person
 * the superclass for the rest
 * a person has a name, age, gender
 * superclass
 * 
 * @author Reema Vanwari
 * @version 11/2/23
 * @author Period: 1
 * @author Assignment: A11_1Back_To_School
 * @author Sources: None
 */
public class Person {
    private String myName; // name of the person
    private int myAge; // person's age
    private String myGender; // 'M' for male, 'F' for female

    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    /**
     * Returns a string
     * 
     * @return name of person
     */
    public String getName() {
        return myName;
    }

    /**
     * Returns an int of the age
     * 
     * @return myAge
     */

    public int getAge() {
        return myAge;
    }

    /**
     * Returns an string of the gender
     * 
     * @return myGender of person
     */

    public String getGender() {
        return myGender;
    }

    /**
     * doesn't return - void
     * 
     * @param name sets name of person to myName
     */

    public void setName(String name) {
        myName = name;
    }

    /**
     * doesn't return - void
     * 
     * @param age sets age of person to myAge
     */

    public void setAge(int age) {
        myAge = age;
    }

    /**
     * doesn't return - void
     * 
     * @param gender string of person myGender
     */

    public void setGender(String gender) {
        myGender = gender;
    }

    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}