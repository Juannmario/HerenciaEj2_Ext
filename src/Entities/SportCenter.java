/*
Sports Center class with its name and type of facility that can be Roofed or
Opened, this class will implement the two abstract methods and the attributes of the parent.
 */
package Entities;


public class SportCenter extends Building {
    private int number;
    private String type;
   // private static final String[] types =  {"Abierto", "Techado"};

  

    public SportCenter() {
    }
    
    
    @Override
    public void calculateSurface() {
        System.out.println("Surface in m2 is:" + super.length*super.width);
    }

    @Override
    public void calculateVolume() {
        System.out.println("Volume in cm3 is: " + super.length*super.width*super.height);
    }

    @Override
    public void load() {
       
        System.out.println("Please, enter the length of the Sport Center: ");
        super.length = read.nextInt();
        System.out.println("Please, enter the width: ");
        super.width = read.nextInt();
        System.out.println("Please, enter the height : ");
        super.height = read.nextInt();
        System.out.println("Please, enter the type (roofed or open) : ");
        type= read.next();
        System.out.println("Please, enter the number of the Sport Center: ");
        number= read.nextInt();
 
    
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
