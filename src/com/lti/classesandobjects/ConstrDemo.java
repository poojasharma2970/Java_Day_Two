package com.lti.classesandobjects;

public class ConstrDemo {

	public static void main(String[] args) {
		Bank b = new Bank("Pooja",21,214357);
		Bank b1 = new Bank("Avni", 21);

	}

}

class Bank{
	
	Bank(String name, int age){
		System.out.println("Name "+name);
		System.out.println("Age  "+age);
	}
	
	Bank(String name, int age, String NetBanking){
		System.out.println("Name "+name);
		System.out.println("Age  "+age);
		System.out.println("NetBanking "+NetBanking);
	}
	
	Bank(String name, int age, long DebitCard){
		System.out.println("Name "+name);
		System.out.println("Age  "+age);
		System.out.println("Debit Card "+DebitCard);
	}
	
	Bank(String name, int age, long DebitCard, String CreditCard, String NetBanking){
		System.out.println("Name "+name);
		System.out.println("Age  "+age);
		System.out.println("Debit Card "+DebitCard);
		System.out.println("Credit Card "+CreditCard);
	}	
}