/*
Create a superclass called Building with the following attributes: width, height, and length. Class
building will have as methods:
• method calculateSurface(): calculates the surface of the building.
• method calculateVolume(): calculates the volume of the building.
 */
package Entities;

import java.util.Scanner;

 public abstract class Building {
    protected int width;
    protected int height;
    protected int length;
    protected Scanner read = new Scanner(System.in).useDelimiter("\n");


    public Building() {
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Building{" + "width=" + width + ", height=" + height + ", length=" + length + '}';
    }
    
    public abstract void load();
    public abstract void calculateSurface();
    public abstract void calculateVolume();
    
}
