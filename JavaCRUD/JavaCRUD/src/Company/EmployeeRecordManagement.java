package Company;

import java.util.LinkedList;
import java.util.Scanner;


public class EmployeeRecordManagement {

	LinkedList<Record> list;
	
	public EmployeeRecordManagement() {
		list = new LinkedList<>();
	}
	
	public void add(Record record) {
		
		if(!find(record.getIdNumber())) {
			list.add(record);
		}
		else {
			System.out.println("Record already exist. Try again");
		}
	}
	
	public boolean find(int idNumber) {
		
		for(Record l : list) {
			if(l.getIdNumber() == idNumber) {
				System.out.println(l);
				return true;
			}
		}
		return false;
	}
	
	public void delete(int recIdNumber) {
		
		Record recordDelete = null;
		
		for (Record ll : list) {
			
			if(ll.getIdNumber() == recIdNumber) {
				recordDelete = ll;
			}
		}
		
		if(recordDelete == null) {
			System.out.println("Invalid record ID");
		}
		else {
			list.remove(recordDelete);
			
			System.out.println("Record removed successfully!");
		}
	}
	
	public Record findRecord(int idNumber) {
		for(Record l : list) {
			if(l.getIdNumber() == idNumber) {
				return l;
			}
		}
		return null;
	}
	
	public void update(int id, Scanner input) {
		if(find(id)) {
			Record rec = findRecord(id);
			
			System.out.print("What is the new Employee ID? ");
			int idNumber = input.nextInt();
			
			System.out.print("What is the new employee number? ");
			int contactNumber = input.nextInt();
			input.nextLine();
			
			System.out.print("What the new Employee name? ");
			String name = input.nextLine();
			
			rec.setIdNumber(idNumber);
			rec.setName(name);
			rec.setContactNumber(contactNumber);
			System.out.println("Record updated successfully!");
		}
		else {
			System.out.println("Record was not found, Try again");
		}
	}

}











