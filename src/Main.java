
public class Main {


	public static void main(String[] args) {
//		Employee employee=new Employee();
//		employee.employeeName="MindlessWorker";
//		employee.salary=1000;
		
//		employee.setEmployeeName("MindlessWorker ");
//		employee.setSalary(1000);
		
//		employee.salary=employee.increaseSalary(500, employee.salary);
		
		
//		System.out.println(employee.displayInfo(employee.salary, employee.employeeName));
	
//	Employee employee2 = new Employee();
	
//	employee2.setEmployeeName("Pista");
//	employee2.setSalary(2000);
	
//	System.out.println(employee.displayInfo() + employee2.displayInfo());
	
//	System.out.println(employee.isInSalaryRange(500, 3000)+" "+ employee.getTax()+" "+employee.hasHigherSalary(employee2));
	
	
	Employee[] employeeArray = new Employee[10];
	
	for(int i=0; i<employeeArray.length; i++){
		employeeArray[i]=new Employee();
		employeeArray[i].setSalary(i*1000+i*200);
		employeeArray[i].setEmployeeName("MindlessWorker"+i);
		}
	
	int maxindex=0;
	for(int i=1; i<employeeArray.length; i++){
		if(employeeArray[maxindex].hasHigherSalary(employeeArray[i])){
			maxindex=i;
		}
	}
	System.out.println("Maxindex: "+maxindex);
	

	int db=0;
	long salaryStart=3000;
	long salaryEnd=6000;
	
	for(int i =0; i<employeeArray.length; i++){
		if(employeeArray[i].isInSalaryRange(salaryStart,salaryEnd)){
			db++;
			
		}
	}
	System.out.println("Employees salary between intervallums: "+db);

	long avg=0;
	for(Employee employee : employeeArray){
		avg+=employee.getSalary();
	}
	avg/=employeeArray.length;
	
	

	
}
}