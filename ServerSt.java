
package Bank;

import Customer.Cust;
import Bank.DuplicateAccNumException;
import Bank.Server;
import java.util.*; 
import java.lang.*; 

class ServerSt {
    
    private Scanner input = new Scanner(System.in); 
    private Server server; 
    private LinkedList accNumList = new LinkedList();
    private boolean authSuccess; 
    
    ServerSt() {}
    
    boolean authenticate(Rep rep) { 
        
        boolean temp = authSuccess; 
        
        if(rep.getRepID() == 12345) {
            
            authSuccess = true;   
            temp = authSuccess; 
            
        }

        return temp; 
        
    }
    
    boolean getAuth() {
        
        boolean temp = authSuccess; 
        
        return temp; 
        
    }
    
    void start(boolean authSuccess) 
                      throws InvalidAccNumException, DuplicateAccNumException {
 
        if(authSuccess) {
            
            server = new Server();
            Cust cust = getAccNum();

            getReqNum(cust);
        
        }
        
    }
    
    private Cust getAccNum() throws InvalidAccNumException {
        
        int accNum, attempts = 1;
        
        System.out.print("Please enter your account number to begin: "); 
        
        accNum = input.nextInt(); 
        
        while(!server.locateAccount(accNum)) {
            
            attempts += 1;
            
            if(attempts <= 3) {
                
                System.out.print("The account number was not found. " 
                                                       + "Please try again: ");
                accNum = input.nextInt();
                
                
            }
            
            else 
                throw new InvalidAccNumException();
            
        } 
        
        Cust currentCustomer = new Cust(accNum); 
        
        return currentCustomer; 

    }
    
    private void getReqNum(Cust cust) throws DuplicateAccNumException {
        
        int reqNum, attempts = 0; 
        
        System.out.println("\nThank you! How may I help? (Select a number)"); 
        System.out.println("\n1. Display account balance\n"
                       +   "2. Display account statement\n"
                       +   "3. Deposit cash\n"
                       +   "4. Withdraw cash\n"
                       +   "5. Reset password\n");
        System.out.print(": "); 
        
        reqNum = input.nextInt(); 
        
        while((reqNum < 1 || reqNum > 5) && attempts < 5) {
            
            System.out.println("Please enter the appropriate " 
                                                        + "request number: ");
            reqNum = input.nextInt();
            attempts += 1; 
            
        }
        
        processRequest(reqNum, cust);
        
    }
 
    private void processRequest (int reqNum, Cust cust) 
                                              throws DuplicateAccNumException {
        
        Server serverPortal = new Server();
        
        serverPortal.processRequest(reqNum, cust);
        
    }
   
}

