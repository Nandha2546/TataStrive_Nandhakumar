package instance;

public class Employee {

	    private int emp_id;
	    private String name;
	    private int age;
	    private String department;
	    private String position;
	    private double salary;
	    private String hire_date;
	    private String address;

	    // Constructors
	    public Employee() {
	        // Default constructor
	    }

	    public Employee(int emp_id, String name, int age, String department, String position, double salary, String hire_date, String address) {
	        this.emp_id = emp_id;
	        this.name = name;
	        this.age = age;
	        this.department = department;
	        this.position = position;
	        this.salary = salary;
	        this.hire_date = hire_date;
	        this.address = address;
	    }

	    // Getters
	    public int getEmpId() {
	        return emp_id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public String getPosition() {
	        return position;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public String getHireDate() {
	        return hire_date;
	    }

	    public String getAddress() {
	        return address;
	    }

	    // Setters
	    public void setEmpId(int emp_id) {
	        this.emp_id = emp_id;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public void setPosition(String position) {
	        this.position = position;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    public void setHireDate(String hire_date) {
	        this.hire_date = hire_date;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    // toString method
	    @Override
	    public String toString() {
	        return "Employee{" +
	                "emp_id=" + emp_id +
	                ", name='" + name + '\'' +
	                ", age=" + age +
	                ", department='" + department + '\'' +
	                ", position='" + position + '\'' +
	                ", salary=" + salary +
	                ", hire_date='" + hire_date + '\'' +
	                ", address='" + address + '\'' +
	                '}';
	    }

	    public static void main(String[] args) {
	        // Creating 10 Employee objects
	        Employee[] employees = {
	                new Employee(1, "Alice Smith", 30, "HR", "Manager", 60000, "2021-01-15", "123 Maple St"),
	                new Employee(2, "Bob Johnson", 24, "IT", "Developer", 50000, "2022-03-12", "456 Oak St"),
	                new Employee(3, "Charlie Lee", 29, "Finance", "Analyst", 55000, "2019-07-19", "789 Pine St"),
	                new Employee(4, "Daisy Chen", 35, "Marketing", "Executive", 65000, "2018-05-10", "321 Birch St"),
	                new Employee(5, "Evan Davis", 40, "Sales", "Salesperson", 45000, "2020-11-30", "654 Cedar St"),
	                new Employee(6, "Fiona Garcia", 28, "IT", "Support", 40000, "2023-01-02", "987 Elm St"),
	                new Employee(7, "George White", 45, "Logistics", "Coordinator", 47000, "2017-04-15", "111 Spruce St"),
	                new Employee(8, "Hannah Wilson", 32, "Legal", "Lawyer", 70000, "2016-06-20", "222 Fir St"),
	                new Employee(9, "Ian Brown", 27, "R&D", "Researcher", 52000, "2021-09-25", "333 Ash St"),
	                new Employee(10, "Jill Black", 31, "Operations", "Supervisor", 48000, "2015-12-05", "444 Cherry St")
	        };

	        // Print the details of all employees
	        for (Employee employee : employees) {
	            System.out.println(employee);
	        }
	    }
	}


