package com.lti.classesandobjects;

public class AssociationDemo {
	
	public static void main(String[] args) {
		Ford f = new Ford();
		f.carInfo();
		f.property();
	}
}

class Car{
	 String color= "red";
	 int maxSpeed = 140;
	 void carInfo() {
		 System.out.println("Color : "+color+"\nMaxSpeed : "+maxSpeed);
	 }
}

class Ford extends Car{
	 
	 void property() {
		 Engine e = new Engine();
		 e.start();
		 Sunroof s = new Sunroof();
		 s.openroof();
	 }
}

class Engine{
	void start() {
		System.out.println("Engine Started");
	}
	void stop(){
		System.out.println("Engine Stop");
	}
}

class Sunroof{
	void openroof() {
		System.out.println("Opened");
	}
	void closeroof() {
		System.out.println("Closed");
	}
}