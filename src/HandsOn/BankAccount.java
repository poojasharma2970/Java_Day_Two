package HandsOn;
import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
	     Last b=new Last();
	     b.update();
	}

}

class Account{
	int id;
	String name;
	int amount;
	void get() {
		System.out.println("enter acc id:");
		Scanner s=new Scanner(System.in);
        id=s.nextInt();
        System.out.println("Enter your Name:");
        name=s.next();
        System.out.println("Enter the Amount:");
		amount=s.nextInt();
	    
	}

	void show() {
		System.out.println("id :"+id+" name :"+name);
		System.out.println("Amount : "+amount);
	}
	
}

class SavingAccount extends Account{
	int interest;
	
	void cal(int i) {
		System.out.println(amount);
		interest=i;
		amount=interest+amount;
        System.out.println("New amount : "+amount);
		}
}

class CurrentAccount extends SavingAccount{
	int draft=1000;
	void data(int i) {
		if(i>1000) {
			System.out.println("Extends limit");
		}
		else {
			super.cal(i);
		}	
		}
	}
class Last extends CurrentAccount
{
	    void update()
	    {
	    super.get();
	    super.show();
		System.out.println("Enter the Interest : ");
		Scanner s=new Scanner(System.in);
		interest=s.nextInt();
	    super.data(interest);
	}
}