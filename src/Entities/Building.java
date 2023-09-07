/*
Create a superclass called Building with the following attributes: width, height, and length. Class
building will have as methods:
• method calculateSurface(): calculates the surface of the building.
• method calculateVolume(): calculates the volume of the building.
 */
package Entities;


 abstract class Building {
    protected int width;
    protected int height;
    protected int length;
    
    public abstract void calculateSurface();
    public abstract void calculateVolume();
}
