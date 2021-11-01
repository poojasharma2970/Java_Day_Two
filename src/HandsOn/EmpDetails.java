package HandsOn;

public class EmpDetails {

	public static void main(String[] args) {
		employee e = new employee("Pooja",24,21,"Trainee","Mumbai",5);

	}
	
}

class employee{ 
	employee(String empName){
		System.out.println("Employee Name = "+empName);
	}

	employee(String empName, int empId){
		System.out.println("Employee Name = "+empName);
		System.out.println("Employee Id = "+empId);
	}

	employee(String empName, int empId, int empAge){
		System.out.println("Employee Name = "+empName);
		System.out.println("Employee Id = "+empId);
		System.out.println("Employee Age = "+empAge);
	}

	employee(String empName, int empId,String empDesgn){
		System.out.println("Employee Name = "+empName);
		System.out.println("Employee Id = "+empId);
		System.out.println("Employee Designation = "+empDesgn); 
	}

	employee(String empName, int empId, int empAge,String empDesgn){
		System.out.println("Employee Name = "+empName);
		System.out.println("Employee Id = "+empId);
		System.out.println("Employee Age = "+empAge);
		System.out.println("Employee Designation = "+empDesgn); 		
	}

	employee( int empId, int empAge, String empLocation){ 
		System.out.println("Employee Id = "+empId);
		System.out.println("Employee Age = "+empAge);
		System.out.println("Employee Location = "+empLocation); 
	}

	employee(String empName, int empId, int empAge,int empExpInYrs ){
		System.out.println("Employee Name = "+empName);
		System.out.println("Employee Id = "+empId);
		System.out.println("Employee Age = "+empAge);
		System.out.println("Employee Experience in Years = "+empExpInYrs); 		
	}

	employee(String empName, int empId, String empDesgn,int empExpInYrs){
		System.out.println("Employee Name = "+empName);
		System.out.println("Employee Id = "+empId); 
		System.out.println("Employee Designation = "+empDesgn); 	
		System.out.println("Employee Experience in Years = "+empExpInYrs); 		
	}

	employee(String empName, int empId, String empDesgn, String empLocation,int empExpInYrs){
		System.out.println("Employee Name = "+empName);
		System.out.println("Employee Id = "+empId); 
		System.out.println("Employee Designation = "+empDesgn); 	
		System.out.println("Employee Location = "+empLocation); 
		System.out.println("Employee Experience in Years = "+empExpInYrs); 		
	}

	employee(String empName, int empId, int empAge, String empDesgn, String empLocation,int empExpInYrs){
		System.out.println("Employee Name = "+empName);
		System.out.println("Employee Id = "+empId); 
		System.out.println("Employee Age = "+empAge);
		System.out.println("Employee Designation = "+empDesgn); 	
		System.out.println("Employee Location = "+empLocation); 
		System.out.println("Employee Experience in Years = "+empExpInYrs); 		
	}
}


