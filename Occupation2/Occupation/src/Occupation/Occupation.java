package Occupation;

/*
 * Occupation Class Assignment
 * This package contains code that will do the following:
 * will produce a array with information on an occupation from the L&I database
 * then it will print the array for the user to view
 * then it will prompt the user to enter an OCC number to search the list
 *
 * the Occupation class will define the object Occupation with 5 properties and the corresponding getter
 * methods
 *
 * package.Occupation
 * by Frederick Wright III
 * created 05/19/2021
 */

// Occupation class
public class Occupation {

    //declare properties
    private String occ; //occ, The Occupational Classification Code to identify primary occupation
    private String title; //title, the official dept. of labor title for an occupation
    private int employed; //employed, the number of people currently employed in an occupation
    private double hourly; //hourly, the average hourly wage of the occupation
    private double annual; //annual, the average annual wage of the occupation

    //constructor methods  ************************************

    public Occupation() //null constructor
    {
    }//end null constructor

    //constructor for each each instance
    public Occupation(String occ, String title, int employed, double hourly, double annual) {

        this.occ = occ;
        this.title = title;
        this.employed = employed;
        this.hourly = hourly;
        this.annual = annual;

    }//end occupation(String, String, int, double, double)


    //accessor methods  ***************************************
    public String getOcc() {

        return occ;
    }//end getOCC method

    public String getTitle() {

        return title;
    }//end getTitle method

    public double getAnnual() {

        return annual;
    }//end getAnnual method

    public double getHourly() {

        return hourly;
    }//end getHourly method

    public int getEmployed() {

        return employed;
    }//end getEmployed method

} // end occupation class
