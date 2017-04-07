package staffMage;


public class Programmer extends Employee {
	
	private double salary;

	public Programmer(String name, String birthDate, String gender, String address, String telephone,
			String education, double salary,char type) {
		super(name, birthDate, gender, address, telephone, education,type);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	

}
