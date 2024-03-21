package Company;

import java.util.Scanner;

public class EmployeeRecordLinkedList {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		EmployeeRecordManagement mt = new EmployeeRecordManagement();
		
		Record record = new Record();
		
		record.setIdNumber(1864);
		record.setContactNumber(999);
		record.setName("Smith");
		
		mt.add(record);
		
		int option = 0;
		
		do {
			menu();
			option = scnr.nextInt();
			
			switch(option) {
			
			case 1:
				System.out.print("Enter the employee ID number: ");
				int employeeID = scnr.nextInt();
				
				System.out.print("Enter the employee contact number: ");			
				int empNumber = scnr.nextInt();				
				scnr.nextLine();
				
				System.out.print("Enter the employee name: ");			
				String name = scnr.nextLine();
				
				record = new Record(name, employeeID, empNumber);
				
				break;
				
			case 2:
				System.out.print("Enter the employee ID number: ");
				int deleteId = scnr.nextInt();
				
				mt.delete(deleteId);
				
				break;
				
			case 3:
				System.out.print("Enter the employee ID number: ");
				int updateId = scnr.nextInt();
				mt.update(updateId, scnr);
				
				break;
				
			case 4:
				System.out.print("Enter the employee ID number: ");
				int lookupId = scnr.nextInt();
				
				if(!mt.find(lookupId)) {
					System.out.println("Employee id doesn't exist\n");
				}
				
				break;
				
			case 5:
				mt.display();
				break;
				
			case 6:
				System.out.println("Thank you for using the program");
				System.exit(0);
				
				break;
				
			default:
				System.out.println("Invalid input");
				
				break;
			
			}
		}
		
		while(option != 6);
	}
	
	public static void menu() {
		
		System.out.println("\nMENU");
		System.out.println("1: Add Employee");
		System.out.println("2: Delete Employee");
		System.out.println("3: Update Employee");
		System.out.println("4: Search Employee");
		System.out.println("5: Display Employee");
		System.out.println("9: Exit the program");
		System.out.print("Enter a number: ");
	}
}

