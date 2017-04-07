

package staffMage;

import java.util.ArrayList;
import java.util.Scanner;

public class ManegmentData {
	
	
	public static Programmer addProgrammer(){
		 String fullName;
		 String birthDate;
		 String gender;
		 String address;
		 String telephone;
		 String education;
		 char type = 'p';
		 double salary;
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter Name:\n");
		 fullName = input.nextLine();
		 
		 System.out.println("Enter Birthdate:\n");
		 birthDate = input.nextLine();
		 
		 System.out.println("Enter Gender:\n");
		 gender = input.nextLine();
		 
		 System.out.println("Enter Address:\n");
		 address = input.nextLine();
		 
		 System.out.println("Enter Telephone:\n");
		 telephone = input.nextLine();
		 
		 System.out.println("Enter Education:\n");
		 education = input.nextLine();
		 
		 System.out.println("Enter Salary:\n");
		 salary = input.nextDouble();
		 Programmer obj = new Programmer(fullName, birthDate, gender, address, telephone, education, salary, type);
		 return obj;
		 
		
	}
	
	
	public static Technician addTechnician(){
		 String fullName;
		 String birthDate;
		 String gender;
		 String address;
		 String telephone;
		 String education;
		 char type = 't';
		 double salary;
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter Name:\n");
		 fullName = input.nextLine();
		 
		 System.out.println("Enter Birthdate:\n");
		 birthDate = input.nextLine();
		 
		 System.out.println("Enter Gender:\n");
		 gender = input.nextLine();
		 
		 System.out.println("Enter Address:\n");
		 address = input.nextLine();
		 
		 System.out.println("Enter Telephone:\n");
		 telephone = input.nextLine();
		 
		 System.out.println("Enter Education:\n");
		 education = input.nextLine();
		 
		 System.out.println("Enter Salary:\n");
		 salary = input.nextDouble();
		 Technician obj = new Technician(fullName, birthDate, gender, address, telephone, education, salary, type);
		 return obj;
		 
		
	}
	

	
	public static Programmer updateProgrammer(Programmer obj){
		 
		 Scanner input = new Scanner(System.in);
		
		 System.out.println("Enter Address:\n");
		 obj.setAddress(input.nextLine()); 
		 
		 System.out.println("Enter Telephone:\n");
		 obj.setTelephone(input.nextLine());
		 
		 System.out.println("Enter Education:\n");
		 obj.setEducation(input.nextLine());
		 
		 System.out.println("Enter Salary:\n");
		 obj.setSalary(input.nextDouble());
		 
		 return obj;
		 
		
	}
	
	public static Technician updateTechnician(Technician obj){
		 
		 Scanner input = new Scanner(System.in);
		
		 System.out.println("Enter Address:\n");
		 obj.setAddress(input.nextLine()); 
		 
		 System.out.println("Enter Telephone:\n");
		 obj.setTelephone(input.nextLine());
		 
		 System.out.println("Enter Education:\n");
		 obj.setEducation(input.nextLine());
		 
		 System.out.println("Enter Salary:\n");
		 obj.setSalary(input.nextDouble());
		 
		 return obj;
		 
		
	}
	
	public static void deleteProgrammer(ArrayList<Programmer> list){
		
		System.out.println("Please Enter the name of programmer that you want to delete:\n");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		for(Programmer pro : list){
			if(pro.getFullName().equals(name)){
				list.remove(list.indexOf(pro));
			}
		}
		
	}
	
	
	public static void deleteTechnician(ArrayList<Technician> list){
		
		System.out.println("Please Enter the name of programmer that you want to delete:\n");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		for(Technician tech : list){
			if(tech.getFullName().equals(name)){
				list.remove(list.indexOf(tech));
			}
		}
		
	}

}
