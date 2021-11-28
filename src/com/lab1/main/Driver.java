package com.lab1.main;

import java.util.Scanner;

import com.lab1.model.Employee;
import com.lab1.services.CredentialService;

public class Driver {
	public static void main(String[] args) {
		CredentialService credentials = new CredentialService();
		Scanner sc = new Scanner(System.in);
		String company,firstName,lastName,fullName,emailAddress;
		char[] genaratedPassword;
		Employee employee = new Employee("sudeep", "patakota");
		firstName=employee.getFirstName();
		lastName=employee.getLastName();
		fullName=firstName+lastName;
		int option;
		do {
			System.out.println("\nPlease enter the department from the following:");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal\n");
			option = sc.nextInt();
			switch(option) {
			case 0:
				System.out.println("Thank you!!!");
				break;
			case 1:
				company="tech";
				emailAddress=credentials.genarateEmailAddress(firstName,fullName,company);
				genaratedPassword=credentials.genaratePassword();
				credentials.showCredetials(firstName,emailAddress,genaratedPassword);
				break;
			case 2:
				company="admin";
				emailAddress=credentials.genarateEmailAddress(firstName,fullName,company);
				genaratedPassword=credentials.genaratePassword();
				credentials.showCredetials(firstName,emailAddress,genaratedPassword);
				break;
			case 3:
				company="hr";
				emailAddress=credentials.genarateEmailAddress(firstName,fullName,company);
				genaratedPassword=credentials.genaratePassword();
				credentials.showCredetials(firstName,emailAddress,genaratedPassword);
				break;
			case 4:
				company="legal";
				emailAddress=credentials.genarateEmailAddress(firstName,fullName,company);
				genaratedPassword=credentials.genaratePassword();
				credentials.showCredetials(firstName,emailAddress,genaratedPassword);
				break;
			default:
				System.out.println("Invalid Input\n");
			}
		}while(option!=0);
		
	}

}
