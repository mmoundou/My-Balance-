
package Bank;

import Bank.ServerSt;
import Bank.DuplicateAccNumException;
import java.util.*; 
import java.lang.*; 

public class Rep {
    
    private Scanner input = new Scanner(System.in); 
    private String repName; 
    private int repID; 
    private ServerSt serverStewart; 
    
    public Rep() {
        
    }
    
    public Rep(String repName, int repID) {
        
        this.repName = repName; 
        this.repID = repID;
        this.serverStewart = new ServerSt(); 
        
    }
    
    public int getRepID() {
        
        int temp = repID; 
        
        return temp; 
        
    }
    
    public void greetCustomer() {
        
        System.out.println("\nHello! I'm " + this.repName + ".\n");
        
    }
    
    public void takeRequest(boolean authSuccess) 
                      throws InvalidAccNumException, DuplicateAccNumException {

        serverStewart.start(authSuccess);
 
    }
    
    public void greetCustomerGoodbye() {
        
        System.out.print("It was a pleasure working with you. " 
                                 + "Have a wonderful day, and take care!\n\n");
        
    }
    
    private void faciliatePositiveExperience() {
        /* Not supported at the moment; will be implemented during asynchronous
        customer interactions */
    }
    
    

}
