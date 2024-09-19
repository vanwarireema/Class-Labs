/**
 * creates the class Student which extends person
 * class contains student ID num & student GPA
 * 
 * @author Reema Vanwari
 * @version 11/2/23
 * @author Period: 1
 * @author Assignment: A11_1Back_To_School
 * @author Sources: None
 */

public class Student extends Person {
    private String myIdNum; // Student Id Number
    private double myGPA; // grade point average

    public Student(String name, int age, String gender, String idNum,
            double gpa) {
        // use the super class' constructor
        super(name, age, gender);

        // initialize what's new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }

    /**
     * Returns a String
     * 
     * @return private string ID num
     */

    public String getIdNum() {
        return myIdNum;
    }

    /**
     * Returns a double
     * 
     * @return double value of GPA
     */

    public double getGPA() {
        return myGPA;
    }

    /**
     * @param idNum assigned to student ID num
     */

    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    /**
     * @param gpa assigned to double value of student GPA
     */

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString() {
        return super.toString() + ", student id: " +
                myIdNum + ", gpa: " + myGPA;
    }
}
