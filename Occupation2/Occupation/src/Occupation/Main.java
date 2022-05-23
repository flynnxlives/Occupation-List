package Occupation;

/*
 * Occupation Class Assignment
 * This package contains code that will do the following:
 * will produce a array with information on an occupation from the L&I database
 * then it will print the array for the user to view
 * then it will prompt the user to enter an OCC number to search the list
 *
 * the main method will initiate an instance of the OccupationList class
 * then it will call the methods from that class.
 *
 * package.Occupation
 * by Frederick Wright III
 * created 05/19/2021
 */

// public class for main method
public class Main {

    //main method to initiate an array and call methods from OccupationList class
    public static void main(String[] args) throws Exception {

        //initiate instance of OccupationList
        OccupationList myOccupationList = new OccupationList();

        //call method to load the array
        myOccupationList.loadList();

        //call method to print the list
        myOccupationList.printList();

        //call method for searching the list by OCC number
        myOccupationList.searchList();


    } // end main method

}// end mainClass
