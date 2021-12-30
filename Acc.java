/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

import Customer.Cust;

/**
 *
 * @author matthieu
 */
class Acc {
    
            private Cust cust; 
            private int accNum, secCode, creditScore;
            private double accBal; 
            private String accHolderName, accHolderAddress, accHolderEmail; 
    
            Acc() {
        
                accNum = secCode =  creditScore = -1;
                accBal = -1.0; 
                accHolderName = accHolderAddress = accHolderEmail = " ";  
        
            }
    
            Acc(Cust cust) {
        
                this.cust = cust; 
                accNum = cust.getAccNum(); 
                secCode = cust.getSecCode();
                creditScore = -1;
                accHolderName = accHolderAddress = accHolderEmail = null; 
                accBal = 500; 

            }
    
            boolean setAccNum (int accNum) {

                return true; //Stub
        
            }
    
            boolean setSecCode(int secCode) {
        
                return true; //Stub
        
            }
    
            boolean setAccHolderName(String name) {
        
                return true; //Stub
        
            }
    
            boolean setAccHolderAddress(String address) {
        
                return true; //Stub
        
            }
    
            boolean setAccPwd() {
                
                boolean success = false; 
                
                return success; 
                
            }
            
            void deposit(int deposit) {
                
                accBal += deposit; 
                
            }
            
            void withdraw(double amt) {
                
                accBal -= amt; 
                
            }
            
            double getAccBal() {
        
                double temp = accBal; 
                
                return temp;  
        
            }
            
            String getAccStatement() {
                
                return " "; 
                
            }
            
            int getAccNum () {
        
                int temp = this.accNum;
        
                return temp; //Stub 
        
            }
            
            int getAccCreditScore() {
        
                return -1; //Stub 
        
            }
            
            String getAccHolderName() {
        
                String temp = cust.getCustName();
 
                return temp; //Stub 
        
            }
    
            String getAccHolderAddress() {
        
                String temp = cust.getCustAddress();
                
                return temp; 
        
            }

            int getSecCode() {
        
                return -1; //Stub
        
            }
    
}
        
    
