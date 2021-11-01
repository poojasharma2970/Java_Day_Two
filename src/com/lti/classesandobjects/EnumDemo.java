package com.lti.classesandobjects;
import java.util.Scanner;
import com.lti.classesandobjects.DiplomaCourse.type;

public class EnumDemo {

	public static void main(String[] args) {
//		DegreeCourse dd=new DegreeCourse();
//		dd.getDataa();
//		dd.showData();
//		dd.check();
//		dd.CalculateMonthlyFees();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Professional or academic");
		String str=s.next();
		DiplomaCourse dc=new DiplomaCourse(type.valueOf(str));
		dc.getDataa();
		dc.display();
		dc.CalculateMonthlyFees();
	}

}

class course{
	int id;
	String name;
	int duration;
	double fees;
	
	void getDataa()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Name");
		name=s.next();
		System.out.println("ID");
		id=s.nextInt();
		System.out.println("FEES");
		fees=s.nextDouble();
	}
	
	void CalculateMonthlyFess() {
		System.out.println("Fees Details");
	}
}

class DegreeCourse extends course{
	enum level{Bachelors,Masters};
	boolean isPlacementAvailable;
	void check()
	{
		level l=level.Bachelors;
		System.out.println(l);
	}
	
	void showData() {
		System.out.println("Name"+name);
	}
	
	void CalculateMonthlyFees() {
		super.CalculateMonthlyFess();
		Scanner s=new Scanner(System.in);
		System.out.println("is placement availabe");
		isPlacementAvailable=s.hasNextBoolean();
		if(isPlacementAvailable==true) {
			fees=fees+(fees*0.1);
			System.out.println("Fees:"+fees);
			
		}
		else {
			System.out.println("Fees:"+fees);
		}
	}
}

class DiplomaCourse extends course{
	enum type{Professional,Academic};//10%,5%
	type t;
	public DiplomaCourse(type t)
	{
		this.t=t;
	}
	void display() {
		System.out.println("Name:"+name);
	}
	
	void CalculateMonthlyFees()
	{
		super.CalculateMonthlyFess();
//		type t=type.academic;
//		if(t==type.Professional)
//		{
//			fees=fees+(fees*0.1);
//			System.out.println("Fees:"+fees);
//		}
//		else
//		{
//			fees=fees+(fees*0.05);
//			System.out.println("Fees:"+fees);
//		}
		
		switch(t) {
		case Professional:
			fees=fees+(fees*0.1);
			System.out.println("Fees:"+fees);
			break;
		case Academic:

			fees=fees+(fees*0.05);
			System.out.println("Fees:"+fees);
			break;
		}
	}
}