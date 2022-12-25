package com.emailValidator;
import java.util.regex.Pattern;
import java.util.*;

public class EmailValidator {
	
    public static boolean isValid(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        
        if (email == null) 
        	return false;
        return pat.matcher(email).matches();
    }
  
    public static void main(String[] args) {
    	
    	while(true) {
    		Scanner scan = new Scanner(System.in);
        	System.out.print("\nEnter an Email id: ");
        	String emailEnteredByUser = "";
        	emailEnteredByUser = scan.next();
            
            if (isValid(emailEnteredByUser))
                System.out.println("It is a valid Email Id");
            else
                System.out.println("It is not a valid Email Id");
    	}
    }
}