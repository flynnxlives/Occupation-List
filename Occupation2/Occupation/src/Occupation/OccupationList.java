package Occupation;

/*
 * Occupation Class Assignment
 * This package contains code that will do the following:
 * will produce a array with information on an occupation from the L&I database
 * then it will print the array for the user to view
 * then it will prompt the user to enter an OCC number to search the list
 *
 * the OccupationList class will contain methods to create an array with the Occupation objects with
 * data read from the file occMay2019.txt then
 * print the array out in a readable format, and then provide a search method for the user to
 * find occupations by OCC number
 *
 * package.Occupation
 * by Frederick Wright III
 * created 05/19/2021
 */

import java.util.Scanner;

class OccupationList {

    //declare array of objects
    private static final Occupation[] occupationList = new Occupation[1000];

    //declare variable to keep count of number of occupations
    private static int occNum = 0;

    //method to load array with data from the file
    public static void loadList() throws Exception {
        //declare temporary variables to hold data read from file
        String inOcc;//property to temporarily hold OCC number of an Occupation
        String inTitle;//property to temporarily hold the title of an Occupation
        int inEmployed;//property to temporarily hold the employed number of an Occupation
        double inHourly;//property to temporarily hold hourly rate of an Occupation
        double inAnnual;//property to temporarily hold annual pay of an Occupation

        //create a file class object linked to the occMay2019.txt file
        java.io.File occFile = new java.io.File("occMay2019.txt");

        //create scanner to read the input stream from the file
        Scanner inFile = new Scanner(occFile);

        //loop structured to load each field from the file into the specified property
        int i = 0;
        while (inFile.hasNextLine()) {

            //read data from file into temporary variables
            inOcc = inFile.nextLine();
            inTitle = inFile.nextLine();
            inEmployed = Integer.parseInt(inFile.nextLine());
            inHourly = Double.parseDouble(inFile.nextLine());
            inAnnual = Double.parseDouble(inFile.nextLine());

            //load Occupation objects into array
            occupationList[i] = new Occupation(inOcc, inTitle, inEmployed, inHourly, inAnnual);

            i++;//increment i to put each new object at different index of array

            //increment count of occupations
            occNum++;

        }//end while loop

        //close data file
        inFile.close();


    }//end loadList

    public static void printList() {

        //print header for each row
        System.out.println("Data from each Occupation is listed below.");
        System.out.printf("%-35s%-90s%6s%10s%11s%n", "OCC", "Title", "Employed", "Hourly", "Annual");

        //print data in the format created
        for (int i = 0; i < occNum; i++) {
            System.out.printf("%-10s", occupationList[i].getOcc());
            System.out.printf("%-115s", occupationList[i].getTitle());
            System.out.printf("%8s", occupationList[i].getEmployed());
            System.out.printf("%10s", occupationList[i].getHourly());
            System.out.printf("%11s%n", occupationList[i].getAnnual());

        }//end for loop
    }//end printList

    public static void searchList() {

        //declare boolean property to determine whether an occ was found
        boolean occFound = false;

        //create scanner function for userInput
        Scanner userKeyboard = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Please enter an OCC number to search the list:");
        String userInput = userKeyboard.nextLine();

        //loop to search each index of the occupationList
        for (int i = 0; i < occNum; i++) {
            if (occupationList[i] == null) {
                break;
            }
            if (occupationList[i].getOcc().equals(userInput)) {
                occFound = true;
                //create header
                System.out.printf("%-35s%-90s%6s%10s%11s%n", "OCC", "Title", "Employed", "Hourly", "Annual");
                //print data in the format created
                System.out.printf("%-10s", occupationList[i].getOcc());
                System.out.printf("%-115s", occupationList[i].getTitle());
                System.out.printf("%8s", occupationList[i].getEmployed());
                System.out.printf("%10s", occupationList[i].getHourly());
                System.out.printf("%11s%n", occupationList[i].getAnnual());
                break;
            }//end if statement
        }//end for loop
        if (!occFound) {
            System.out.println(userInput + "- This OCC has not been found in the file.");
        }//end if statement
    }//end searchList method
}//end OccupationList class
