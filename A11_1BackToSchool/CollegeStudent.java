/**
 * Creates a class collegestudent
 * extends a student
 * 
 * instance variables are year and major
 * college student accesses super class
 * 
 * @author Reema Vanwari
 * @version 11/2/23
 * @author Period: 1
 * @author Assignment: A11_1Back_To_School
 * @author Sources: None
 * 
 */
public class CollegeStudent extends Student {
    private int myYear;
    private String myMajor;

    /**
     * Constructs a CollegeStudent extended from student
     * @param name - student name
     * @param age - age of student 
     * @param gender - gender of student
     * @param idNum - student id num
     * @param gpa - average grade
     * @param year - year of schooling
     * @param major - major of student 
     */

    public CollegeStudent(String name, int age, String gender, String idNum,
            double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);

        myYear = year;
        myMajor = major;
    }

    /**
     * Returns an int of the year
     * 
     * @return myYear int instance data
     */

    public int getYear() {
        return myYear;
    }

    /**
     * Returns a String
     * 
     * @return string of the major name
     */

    public String getMajor() {
        return myMajor;
    }

    /**
     * an int of the year
     * 
     * @param year sets the grade
     */
    public void setYear(int year) {
        myYear = year;
    }

    /**
     * a String representation of this class.
     * 
     * @param major sets major
     */

    public void setMajor(String major) {
        myMajor = major;
    }

    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString() {
        return super.toString() + ", year: " + myYear +
                ", major: " + myMajor;
    }
}
