package com.assignment2.mahesh;


class Employee {
	 private String name;
	 private String address;
	 private double salary;
	 private String jobTitle;
	
	 public Employee(String name, String address, double salary, String jobTitle) {
	     this.name = name;
	     this.address = address;
	     this.salary = salary;
	     this.jobTitle = jobTitle;
	 }
	
	 public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public double calculateBonus() {
	     
	     return 0.05 * salary;
	 }

 public void generatePerformanceReport() {
     
     System.out.println("Generating performance report for  " + this.name);
     
 }


}


class Manager extends Employee {
	int number;
 public Manager(String name, String address, double salary) {
     super(name, address, salary, "Manager");
     
 }

 @Override
 public double calculateBonus() {
     
     return 0.1 * getSalary();
 }

 public void manageProjects() {
     
     System.out.println("Managing projects as a Manager");
 }
}


class Developer extends Employee {
	 public Developer(String name, String address, double salary) {
	     super(name, address, salary, "Developer");
	 }
	
	 @Override
	 public double calculateBonus() {
	     
	     return 0.08 * getSalary();
	 }
	
	 public void writeCode() {
	     
	 System.out.println("Writing code as a Developer");
	 }
	}


class Programmer extends Developer {
	 public Programmer(String name, String address, double salary) {
	     super(name, address, salary);
	     setJobTitle("Programmer");
	 }
	
	 @Override
	 public double calculateBonus() {
	     
	     return 0.07 * getSalary();
	 }
	
	 public void debugCode() {
	     
	     System.out.println("Debugging code as a Programmer");
	 }
	}

public class Run {

		 public static void main(String[] args) {
		     Manager manager = new Manager(" MAHEsH", "chennai", 80000);
		     Developer developer = new Developer("MANI", "hyderabad", 70000);
		     Programmer programmer = new Programmer("RAMU", "vzm", 60000);

		     System.out.println("Manager bonus: " + manager.calculateBonus());
		     manager.manageProjects();
		     manager.generatePerformanceReport();

		     System.out.println("Developer bonus: " + developer.calculateBonus());
		     developer.writeCode();
		     developer.generatePerformanceReport();
		     

		     System.out.println("Programmer bonus: " + programmer.calculateBonus());
		     programmer.debugCode();
		     programmer.generatePerformanceReport();
		     
		 }
		}


