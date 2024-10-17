package day4;

public class Test {
	public static void main(String[] args) {
		Manager Emp=new Manager("nandha",1001,45000,"Developement");
		Emp.displayDetails();
		System.out.println("--------------------");
		Developer dep=new Developer("nandha",1001,45000,"Java_Developer");
		dep.displayDetails();
		
	}

	}

