
package Bank;



import Customer.Cust;
import java.util.*; 
import java.lang.*; 

public class Server {
    
    private Scanner input;
    private char hierarchyLevel, actorType; 
    private AccSt accSt; 
    
    public Server() throws DuplicateAccNumException {
        
        input = new Scanner(System.in);
        accSt = new AccSt();  
        
    }
    
    public boolean locateAccount(int accNum) {
        
        return accSt.searchForAcc(accNum) != null;
        
    }
    
    public void processRequest(int reqNum, Cust cust) {
        
        accSt.start(reqNum, cust);
        
    }

}