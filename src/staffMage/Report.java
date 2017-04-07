
package staffMage;

import java.util.ArrayList;

public  class Report {
	
	//=new ArrayList<>();
	public double totalAvarageSalaryProgrammer(ArrayList<Programmer> prolist) {

		double totalSalary = 0.0d;
		int countP = 0;
		if(prolist.size()>0){
			
			for (Programmer emp : prolist) {
				countP++;
				totalSalary += emp.getSalary();
			}
			return totalSalary / countP;
		}
		
	return 0;
		
	}
	
	public double totalAvarageSalaryTechnician(ArrayList<Technician> techlist) {

		double totalSalary = 0.0d;
		int countP = 0;
		for (Technician emp : techlist) {
				if(techlist.size()>0){
				countP++;
				totalSalary += emp.getSalary();
				return totalSalary / countP;
			}
		
		}
		
		return 0;
	}
	

	public void displayProg(ArrayList<Programmer> programmerList) {
		int countP = 0;
		if(programmerList.size()>0){
		for (Programmer emp : programmerList) {
			System.out.println(emp.getFullName() + " | " + emp.getAddress() + " |\t " + emp.getTelephone() + " |\t "
					+ emp.getEducation() + " |\t "+ emp.getSalary() + " |\t ");
			countP++;
		}
		}
	}

	public void displayTech(ArrayList<Technician> technicianList) {
		int countP = 0;
		if (technicianList.size() > 0) {
			for (Employee emp : technicianList) {
				System.out.println(emp.getFullName() + " | " + emp.getAddress() + " |\t " + emp.getTelephone() + " |\t "
						+ emp.getEducation() + " |\t ");
				countP++;
			}

		}
	}
}
