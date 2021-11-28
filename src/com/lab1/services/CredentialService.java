package com.lab1.services;

import java.util.Random;

public class CredentialService {
	String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallChars = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String symbols = "!@#$%^&*_=+-/.?<>)";
	int length = 8;
	
	public char[] genaratePassword() {
        String values = capitalChars + smallChars +numbers + symbols;
        Random randomValue = new Random();
  
        char[] password = new char[length];
  
        for (int i = 0; i < length; i++)
        {
            password[i] =values.charAt(randomValue.nextInt(values.length()));
        }
        return password;
	}
	
	public String genarateEmailAddress(String firstName,String fullName,String company) {
		return fullName+"@"+company+".abc.com";
		
	}
	public void showCredetials(String firstName,String email,char[] pasword) {
		System.out.println("\nDear "+firstName+" your generated credentials are as follows:\n");
		System.out.println("\nEmail -->"+email+"\n");
		System.out.println("\nPassword -->"+String.valueOf(pasword)+"\n");
	}

}
