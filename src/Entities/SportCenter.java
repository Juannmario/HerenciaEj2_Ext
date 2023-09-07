/*
Sports Center class with its name and type of facility that can be Roofed or
Opened, this class will implement the two abstract methods and the attributes of the parent.
 */
package Entities;


public class SportCenter extends Building {
    private int numero;
    private String tipo;
    private static final String[] tipos =  {"Abierto", "Techado"};
    
    @Override
    public void calculateSurface() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calculateVolume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
