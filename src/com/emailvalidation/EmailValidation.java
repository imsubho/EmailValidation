package com.emailvalidation;
import java.util.Scanner;
public class EmailValidation {
	
	
	String email[] = {"kmorden0@netscape.com","scrowhurst1@hhs.gov","mkarus2@sourceforge.net","jdabnor3@wikimedia.org",
		    "olangley4@1und1.de", "bkettlesing5@paypal.com", "bgurnee6@google.com", "mdominichelli7@paginegialle.it", 
		    "fraubenheimer8@pbs.org","avizor9@amazon.com"};
	
	static  boolean flag=false;
	public static void main(String[] args){
		
		if(flag){
			System.out.println("Please enter valid Email ID:");
			System.out.println("Enter Email ID again:");
			}
		
		else{
			System.out.println("Please enter Email ID :");
			}
		
		Scanner sc = new Scanner(System.in);
		String b = sc.next();
		EmailValidation emailid = new EmailValidation();
		boolean result = emailid.checkEmailID(b);
		
		if (result)
			System.out.println("Signed In");
		
		else {
			flag=true;
			main(new String[] { "" });
			}
		}
	
	public boolean checkEmailID(String MailID){
		for(int i=0; i<email.length; i++){
			String k=email[i];
			if(MailID.equals(k)){
				return true;
				}
			}
		return false;
		}
}




