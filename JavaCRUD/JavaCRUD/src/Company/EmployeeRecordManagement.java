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

}
