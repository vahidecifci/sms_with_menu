package staffMage;
public class Technician extends Employee {

	
	private double salary;

	public Technician(String name, String birthDate, String gender, String address, String telephone,
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
