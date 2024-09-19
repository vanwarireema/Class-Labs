/**
 * Creates a class Teacher that extends person
 * 
 * Teacher has a string value of Subject
 * contains a double value of their salary
 * 
 * @author Reema Vanwari
 * @version 11/2/23
 * @author Period: 1
 * @author Assignment: A11_1Back_To_School
 * @author Sources: None
 * 
 */
public class Teacher extends Person {
    private String mySubject;
    private double mySalary;

    /**
     * Constructs a Teacher with name, age, gender
     * @param name - teacher name
     * @param age - age of teacher 
     * @param subject - subject teacher teaches
     * @param gender - gender of teacher
     * @param salary - salary of teacher
     */

    public Teacher(String name, int age, String gender,
            String subject, double salary) {
        super(name, age, gender);

        mySubject = subject;
        mySalary = salary;
    }

    /**
     * Returns a String
     * 
     * @return subject of teacher
     */
    public String getSubject() {
        return mySubject;
    }

    /**
     * contains a salary
     * 
     * @return double value of teacher salary
     */
    public double getSalary() {
        return mySalary;
    }

    /**
     * @param subject assigned to teacher subject
     */

    public void setSubject(String subject) {
        mySubject = subject;
    }

    /**
     * @param salary assigned to teacher salary
     */

    public void setSalary(double salary) {
        mySalary = salary;
    }

    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString() {
        return super.toString() + ", subject: " + mySubject +
                ", salary: " + mySalary;
    }
}
