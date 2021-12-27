
package Bank;

import java.util.*; 
import Customer.Cust;

class AccSt {

        private Scanner input = new Scanner(System.in); 
        private AccSt leftSideChild, rightSideChild; 
        private Acc acc; 
       
        AccSt() throws DuplicateAccNumException {

            populate();

        }

        AccSt(Acc acc) {

            this.acc = acc; 

        }
        
        void start(int reqNum, Cust cust) {

            AccSt temp = searchForAcc(cust.getAccNum());
            
            switch(reqNum) {
            
                case 1: {

                    if(temp != null) {

                        double balance = temp.acc.getAccBal();
                        System.out.println("\nYour account balance is: $" +
                                                               balance + "\n");

                    }

                    else 
                        System.out.println("There was an error processing" +
                                                             " your request.");

                    break;

                }
            
                case 2: {

                    String accStmt = temp.acc.getAccStatement(); 

                    if(accStmt == null) 
                        System.out.println("It is null"); 

                    else
                        System.out.println(accStmt); 

                    break;

                }
            
                case 3: {

                    int depositAmount;  

                    System.out.print("Enter deposit amount: "); 
                    depositAmount = input.nextInt(); 
                    temp.acc.deposit(depositAmount);
                    System.out.println("It was successful");

                    break;

                }
            
                case 4: { 

                    double withdrawAmnt; 

                    System.out.print("Enter amount: "); 
                    withdrawAmnt = input.nextDouble(); 

                    if(withdrawAmnt > temp.acc.getAccBal())
                        System.out.println("Insufficient funds."); 

                    else {

                        temp.acc.withdraw(withdrawAmnt);
                        System.out.println("It was successful"); 

                    }

                    break;

                }
            
                case 5: {

                    //User must first be authenticated
                    /*resetPassword(); 
                    break;*/

                }
            
                //default: 
                
            }
            
        }

        Acc getAcc() {
            
            Acc temp = acc; 
            
            return temp; 
            
        }
        
        void addToStewartList(Acc acc, AccSt head) 
                                              throws DuplicateAccNumException {

            Acc val = null; 
            AccSt temp = head; 
            AccSt prev = null;   
            
            while(temp != null) { //We might need to restrict null values to preserve design integrity 
                
                prev = temp; 

                if(acc.getAccNum() == temp.getAcc().getAccNum())
                    throw new DuplicateAccNumException(); 
            
                else if(acc.getAccNum() < temp.getAcc().getAccNum()) 
                    temp = temp.leftSideChild;    

            
                else if(acc.getAccNum() > temp.getAcc().getAccNum())
                    temp = temp.rightSideChild;     

            } 
            
            if(prev == null) {
                
                temp.acc = acc; 
                AccSt newStwt = new AccSt(acc);
                temp = newStwt; 
                
            }
            
            else {
                
                if(acc.getAccNum() < prev.acc.getAccNum())
                    prev.setLeftSideChild(acc);

                else
                    prev.setRightSideChild(acc);

            }
         
        }                
                
        void setLeftSideChild(Acc acc) {
            
            this.leftSideChild = new AccSt(acc); 
       
        }       
            
        void setRightSideChild(Acc acc) { 
            
            this.rightSideChild = new AccSt(acc);
                
        }
            
        AccSt getLeftSideChild() {
                
            AccSt lsc = this.leftSideChild;
                
            return lsc; 
    
        }
            
        AccSt getRightSideChild() {
                
            AccSt rsc = this.rightSideChild;
                
            return rsc; 
                
        }
            
        void populate() throws DuplicateAccNumException {
                
            Acc[] ml = new Acc[5];
            
            Cust temp1 = new Cust(12345); 
            Acc acc1 = new Acc(temp1); 
            this.acc = acc1; 
           
               
        
            Cust temp2 = new Cust(12346); 
            Acc acc2 = new Acc(temp2); 
            addToStewartList(acc2, this);
            
            Cust temp3 = new Cust(12347);
            Acc acc3 = new Acc(temp3); 
            addToStewartList(acc3, this);
            
            Cust temp4 = new Cust(12348);
            Acc acc4 = new Acc(temp4); 
            addToStewartList(acc4, this);
            
            Cust temp5 = new Cust(12349);
            Acc acc5 = new Acc(temp5); 
            addToStewartList(acc5, this);
            
        }
            
        AccSt searchForAcc(int accNum) { 

            return searchHelper(accNum, this); 
            
        }
            
        AccSt searchHelper(int accNum, AccSt head) {
    
            AccSt val = null;  
    
            while(head != null) {
        
                if(accNum == head.getAcc().getAccNum())
                    return head; 

                else if((head.leftSideChild != null) 
                                       && (accNum < head.getAcc().getAccNum()))
                    head = head.leftSideChild;

                else if((head.rightSideChild != null) 
                                       && (accNum > head.getAcc().getAccNum())) 
                    head = head.rightSideChild; 
        
            }
    
            return val; 
    
        }
        
}

