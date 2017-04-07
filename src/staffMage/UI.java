package staffMage;
import java.util.Scanner;

public class UI {

	
 public static byte showaddMenu(){
		
		byte btyInput = 0;
		String strMessage = "";
		strMessage += "Please choose an item from menu below\n";
		strMessage += "1.Add Programmer.\n2.Add Technician.\n";
		System.out.println(strMessage);
		Scanner in = new Scanner(System.in);
		btyInput = in.nextByte();
		if (btyInput == 1 || btyInput == 2)
			return btyInput;
		else{
			System.out.println("Wrong input try again!");
		return 0;
		}
		
	}

	
  public static byte showUpdateMenu(){
	byte btyInput = 0;
	String strMessage = "Choose what do you want:\n";
	strMessage += "1.Edit a Programmer.\n2.Edit a Technician.\n";
	System.out.println(strMessage);
	Scanner in = new Scanner(System.in);
	btyInput = in.nextByte();
	if (btyInput == 1 || btyInput == 2)
		return btyInput;
		else{
			System.out.println("Wrong input try again!");
		return 0;
		}
}
	
	
		
		
//-----------------------------------------------------------------------------------------------

	
	
	
	
	
	public static byte showDeleteMenu(){
		byte btyInput = 0;
		String strMessage = "Choose what do you want:\n";
		strMessage += "1.Delete a Programmer \n2.Delete a Technician\n";
		System.out.println(strMessage);
		Scanner in = new Scanner(System.in);
		btyInput = in.nextByte();
		if (btyInput == 1 || btyInput == 2 )
			return btyInput;
			else{
				System.out.println("Wrong input try again!");
			return 0;
			}
	}
	
	
	public byte showSecraterySubMenu(){
		byte btyInput = 0;
		String strMessage = "Choose what do you want:\n";
		strMessage += "1.Add a Secretary.\n2.Edit information.\n3.Delete Secretary.\n";
		System.out.println(strMessage);
		Scanner in = new Scanner(System.in);
		btyInput = in.nextByte();
		if (btyInput == 1 || btyInput == 2 || btyInput ==3)
			return btyInput;
			else{
				System.out.println("Wrong input try again!");
			return 0;
			}
	}
	
	public byte showProgrammerSubMenu(){
		byte btyInput = 0;
		String strMessage = "Choose what do you want:\n";
		strMessage += "1.Add a Programmer.\n2.Edit information.\n3.Delete Programmer.\n";
		System.out.println(strMessage);
		Scanner in = new Scanner(System.in);
		btyInput = in.nextByte();
		if (btyInput == 1 || btyInput == 2 || btyInput ==3)
			return btyInput;
			else{
				System.out.println("Wrong input try again!");
			return 0;
			}
	}
	
	public byte showTechnicianSubMenu(){
		byte btyInput = 0;
		String strMessage = "Choose what do you want:\n";
		strMessage += "1.Add a Technician.\n2.Edit information.\n3.Delete Technician.\n";
		System.out.println(strMessage);
		Scanner in = new Scanner(System.in);
		btyInput = in.nextByte();
		if (btyInput == 1 || btyInput == 2 || btyInput ==3)
			return btyInput;
			else{
				System.out.println("Wrong input try again!");
			return 0;
			}
	}
}
