
package Runtime;

import Bank.InvalidAccNumException;
import Bank.InvalidRepInfoException;
import java.util.*; 
import java.lang.*; 

public class Stage {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        CustSt custSt = new CustSt();

        try {
            custSt.start();
        }
        
        catch(InvalidAccNumException | InvalidRepInfoException e) {
            System.out.println("\nThere was an error processing your request." +
                                                   " Please try again later."); 
        }
        
    }
    
}
