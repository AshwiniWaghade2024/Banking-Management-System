package BankingManagementSystem;

import java.util.Scanner;

public class User {
	private Scanner scan;
	
	public void register(){
		System.out.println("Enter fullname :");
		String fullname = scan.nextLine();
		
		System.out.println("Enter eamil :");
		String email = scan.nextLine();
		
		System.out.println("Enter password :");
		String password = scan.nextLine();
		
	}
	
	public String login() {
		System.out.println("Enter eamil :");
		String email = scan.nextLine();
		
		System.out.println("Enter passsword :");
		String password = scan.nextLine();
		
		return null;
	}
	
	public boolean userExist() {
		
		return false;//temporary
	}
}
