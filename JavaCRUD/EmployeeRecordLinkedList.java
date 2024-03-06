package Company;

import java.util.Scanner;

public class EmployeeRecordLinkedList {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		EmployeeRecordMT mt = new EmployeeRecordMT();
		
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
				
				System.out.print("Write the employee name: ");			
				String name = input.nextLine();
				
				record = new Record(name, employeeID, empNumber);
				
				break;
				
			case 2:
				
			}
		}
	}
}