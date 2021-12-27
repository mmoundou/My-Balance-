
package Runtime;

import Bank.RepSt;
import java.util.*; 
import java.lang.*; 

class CustSt {
    
    private Scanner input = new Scanner(System.in); 
    private RepSt repSt;
    
    CustSt() {
        
        repSt = new RepSt();
 
    }
    
    public void start() {

        repSt.start();
        
    } 
    
    RepSt getRepSt() {
        
        RepSt temp = repSt; 
        
        return temp; 
        
    }
           
}
