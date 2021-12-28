
package Customer;


import java.util.*; 
import java.lang.*; 

public class Cust {
   
    private String custName, custAddress, custPhoneNum, custEmail, custPwd;
    private int accNum, secCode; 
    
    public Cust(int accNum) {
        
        this.accNum = accNum; 
        custName = custAddress = custPhoneNum = custEmail = custPwd = null; 
        secCode = -1; 
        
    }

    public Cust(int accNum, int secCode) {

        this.accNum = accNum; 
        this.secCode = secCode; 

    }
    
    public Cust(String custName, String CustAddress, String custPhoneNum,
                String custEmail, String custPwd, int accNum, int secCode) {
        
        
    
    }
    
    public void greetRep() {
        
        System.out.println("Hello!");

    }

    public String getCustName() {
        
        String temp = custName;
        
        return temp; 
        
    }
    
    public String getCustAddress() {
        
        String temp = custAddress;
        
        return temp; 
        
    }
    
    public String getCustPhoneNumber() {
        
        String temp = custPhoneNum; 
        
        return temp; 
        
    }
    
    public String getCustEmail() {
        
        String temp = custEmail; 
        
        return temp; 
        
    }  
    
    public String getAccInfo() {
        
        String temp = accNum + " " + secCode; 
        
        return temp; 
        
    }
    
    public int getAccNum() {
        
        int temp = accNum; 
        
        return temp; 
        
    }
    
    public int getSecCode() {
        
        int temp = secCode; 
        
        return temp; 
        
    }
    
    public String getPwd() {
        
        String temp = custPwd; 
        
        return temp; 
        
    }
    
    public void setCustName(String custName) {
        
        this.custName = custName;  
        
    }
    
    public void setCustAddress(String custAddress) {
        
        this.custAddress = custAddress; 
        
    }
    
    public void setCustPhoneNumber(String custPhoneNum) {
        
        this.custPhoneNum = custPhoneNum; 
        
    }
    
    public void setCustEmail(String custEmail) {
        
        this.custEmail = custEmail;
        
    }  
    
    public void setAccInfo() {
 
        
    }

    private void setSecCode(int secCode) {
        
        this.secCode = secCode;  
        
    }
    
    private void setPwd(String custPwd) {
        
        this.custPwd = custPwd; 
        
    }
    
}
