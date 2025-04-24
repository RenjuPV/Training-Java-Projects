package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.model.BillItem;
import com.training.model.Circle;
import com.training.model.Person;

public class Main09 {

	public static void main(String[] args) {

		List<Person> persons = new LinkedList<>();

		persons.add(new Person("Renju", 34));
		persons.add(new Person("Renjith", 37));
		persons.add(new Person("Rishan", 5));
		persons.add(new Person("Anju", 37));
		persons.add(new Person("Arun", 40));
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Sl No \t Name \t\t\t Age");
		System.out.println("-----------------------------------------------------------------------------");
		
		Person younger = persons.get(0);
		Person elder = persons.get(0);
		
		for(int i=0;i<persons.size();i++) {
			
			Person currentPerson=persons.get(i);
			
			System.out.println(i+1+" \t "+currentPerson.getName()
					+"\t\t\t"+currentPerson.getAge());
			
			
			if (currentPerson.compareTo(younger) < 0)
				younger = currentPerson;
			
			if (currentPerson.compareTo(elder)> 0)
				elder =  currentPerson;
					
			
		}
		
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Youngest Person :"+younger.getName());
		System.out.println("Eldest Persone:"+elder.getName());
		System.out.println("-----------------------------------------------------------------------------");
		

	}

}
