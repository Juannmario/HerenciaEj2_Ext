/*
In this class we are interested in knowing how many people can work in the entire building, the
user will say how many people enter each office, how many offices and the floor number
(assuming that there is an office on each floor). Create the method cantPersons(), which returns
how many people would enter a floor and how many in the whole building.
 */
package Entities;

import java.util.Scanner;


public class OfficeBuilding extends Building {
    private int numOffices;
    private int numPeopleByOffice;
    private int numFloor;
    private final Scanner read = new Scanner(System.in).useDelimiter("\n");
    public void cargar()
    {
        System.out.println("Please, enter the length of the building: ");
        super.length = read.nextInt();
        System.out.println("Please, enter the width of the building: ");
        super.width = read.nextInt();
        System.out.println("Please, enter the height of the building: ");
        super.height = read.nextInt();
        System.out.println("Please, enter the floor number: ");
        numFloor = read.nextInt();
        System.out.println("Please, enter the number of offices: ");
        numFloor = read.nextInt();
        System.out.println("Please, enter the number of people by office: ");
        numFloor = read.nextInt();
    }
    @Override
    public void calculateSurface() {
        
        System.out.println("Surface in m2 is:" + super.length*super.width);
    }

    @Override
    public void calculateVolume() {
        System.out.println("Volume in cm3 is: " + super.length*super.width*super.height);
    }
    
    
          
}
