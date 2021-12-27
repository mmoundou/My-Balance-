
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

    
    
    
    
    /*****
     * 
     * 
     * 
     * 
     * 
     *****/
    
    
    
    
    
     
    
    
    
    
        private class Acc {
    
            private Cust cust; 
            private int accNum, secCode, creditScore;
            private double accBal; 
            private String accHolderName, accHolderAddress, accHolderEmail; 
    
            private Acc() {
        
                accNum = secCode =  creditScore = -1;
                accBal = -1.0; 
                accHolderName = accHolderAddress = accHolderEmail = " ";  
        
            }
    
            private Acc(Cust cust) {
        
                this.cust = cust; 
                accNum = cust.getAccNum(); 
                secCode = cust.getSecCode();
                creditScore = -1;
                accHolderName = accHolderAddress = accHolderEmail = null; 
                accBal = 500; 

            }
    
            private boolean setAccNum (int accNum) {

                return true; //Stub
        
            }
    
            private boolean setSecCode(int secCode) {
        
                return true; //Stub
        
            }
    
            private boolean setAccHolderName(String name) {
        
                return true; //Stub
        
            }
    
            private boolean setAccHolderAddress(String address) {
        
                return true; //Stub
        
            }
    
            private void deposit(int deposit) {
                
                accBal += deposit; 
                
            }
            
            private void withdraw(double amt) {
                
                accBal -= amt; 
                
            }
            
            private double getAccBal() {
        
                double temp = accBal; 
                
                return temp;  
        
            }
            
            private String getAccStatement() {
                
                return " "; 
                
            }
            
            private int getAccNum () {
        
                int temp = this.accNum;
        
                return temp; //Stub 
        
            }
            
            private int getAccCreditScore() {
        
                return -1; //Stub 
        
            }
            
            private String getAccHolderName() {
        
                String temp = cust.getCustName();
 
                return temp; //Stub 
        
            }
    
            private String getAccHolderAddress() {
        
                String temp = cust.getCustAddress();
                
                return temp; 
        
            }

            private int getSecCode() {
        
                return -1; //Stub
        
            }
    
        }
        
    }
    
    /*private class ServerRepStewart {
        
        void locateRep() {
            
            Rep[] repList = new Rep[5]; 
        
            repList[0] = new Rep("John", 12345); 
            repList[1] = new Rep("Jane", 12345); 
            repList[2] = new Rep("David", 12345); 
            repList[3] = new Rep("Eric", 12345); 
            repList[4] = new Rep("Jennifer", 12345); 
            
        }
        
        void populate() {
            
        }
        
        
        private class ServerRep  {
            
            Rep rep; 
            
            String repName; 
            int repID; 
            String repInfo = repName + repID;
            int repPortNumber, bankPortNumber;
            ServerSt serverStewart;
            
            private ServerRep() {
                
            }
   
            
        }*/
    
    

