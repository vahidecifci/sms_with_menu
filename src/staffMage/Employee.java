package staffMage;

abstract public class Employee {

	private String fullName;
	private String birthDate;
	private String gender;
	private String address;
	private String telephone;
	private String education;
	private char type;
	public Employee(String fullName, String birthDate, String gender, String address, String telephone,
			String education, char type) {
		
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.gender = gender;
		this.address = address;
		this.telephone = telephone;
		this.education = education;
		this.type = type;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
}
