package com.lti.classesandobjects;

public class ChainingConstr {

	public static void main(String[] args) {
		A a = new A("PeterParker123");

	}

}

class A{
	A(){
		System.out.println("Default Constructor: ");
	}
	
	A(String name){
		this("Peter",22);
		System.out.println("Name " +name);
	}
	
	A(String name, int age){
		this();
		System.out.println("Name " +name);
		System.out.println("Age " +age);
	}
}