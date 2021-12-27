
package Bank;


public class InvalidAccNumException extends RuntimeException {
    
    public InvalidAccNumException() {
        super();
    }
    
    public InvalidAccNumException(String message) {
        super(message); 
    }
    
}
