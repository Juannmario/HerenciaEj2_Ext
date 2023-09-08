
package herenciaej2_ext;

import Entities.Building;
import Entities.OfficeBuilding;
import Entities.SportCenter;
import java.util.ArrayList;

public class HerenciaEj2_Ext {

    
    public static void main(String[] args) {
        ArrayList <Building> buildings = new ArrayList<>();
        Building office1 = new OfficeBuilding();
        Building office2 = new OfficeBuilding();
        Building sportC1 = new SportCenter();
        Building sportC2 = new SportCenter();
        int roofed=0,open = 0;
        
        buildings.add(office1);
        buildings.add(office2);
        buildings.add(sportC1);
        buildings.add(sportC2);
        
       for (Building bld : buildings)
       {
            bld.load();
            if (bld instanceof OfficeBuilding)
            {
                 ((OfficeBuilding) bld).amountPeople();
            }
            else if (bld instanceof SportCenter)
            {
                if (((SportCenter) bld).getType().equalsIgnoreCase("roofed"))
                {
                    roofed++;
                }
                else{ open++;}
                             
            }
           
       }
       
        System.out.println("Amount of SC roofed: " + roofed + " open: " + open);
            
       
        
        
    }
    
}
