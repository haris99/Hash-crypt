package sef.module8.activity;

/**
 * This class represents the exception that can be thrown if the
 * name given to an Account instance violates naming rules
 *
 * @author John Doe
 */
public class AccountException extends Exception {


    public static final String NAME_TOO_SHORT = "Name must be longer than 4 characters";
    public static final String NAME_TOO_SIMPLE = "Name must contain a combination of letters and numbers";


    private String name;
    private String message;

    /**
     * Constructs an AcountException
     *
     * @param message The message to be set explaining the name violation (see static attributes)
     * @param name    The actual name
     */
    public AccountException(String message, String name) {
    	this.name = name;
    	this.message = message;
    	if (message == NAME_TOO_SHORT){
    		//System.out.println("Name: "+name+" is too short");
    	}else
    		if (message==NAME_TOO_SIMPLE){
    			//System.out.println("Name: "+name+" is too simple");
    		}
    }

    /**
     * Returns the name passed to this Account exception
     *
     * @return
     */
    public String getName() {
        return name;
    }


}
