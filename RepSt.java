
package Bank;

import Bank.Rep;
import Bank.InvalidRepInfoException;
import Bank.ServerSt;
import Bank.DuplicateAccNumException;
import java.util.*; 
import java.lang.*; 
import java.util.concurrent.ThreadLocalRandom; 

public class RepSt {
    
    private Scanner input = new Scanner(System.in);
    private int reqNum, accNum; 
    
    private Rep rep; 
    private ServerSt serverSt; 
    
    public RepSt() {}
    
    public void start() throws InvalidAccNumException, InvalidRepInfoException, 
                                                     DuplicateAccNumException { //last one needa be handled here
        
        serverSt = new ServerSt(); 
        rep = isAvailable(); 
        
        if(serverSt.authenticate(rep)) {

            rep.greetCustomer();
            rep.takeRequest(serverSt.getAuth());
            rep.greetCustomerGoodbye(); 
           
        }

        else 
            throw new InvalidRepInfoException();  
 
    }
    
    public Rep isAvailable() {
        
        Rep[] repList = new Rep[5]; 
        int randomNum = ThreadLocalRandom.current().nextInt(0, 4 + 1);
        
        repList[0] = new Rep("John", 12345); 
        repList[1] = new Rep("Jane", 12345); 
        repList[2] = new Rep("David", 12345); 
        repList[3] = new Rep("Eric", 12345); 
        repList[4] = new Rep("Jennifer", 12345); 

        return repList[randomNum]; 
        
    }
    
}
