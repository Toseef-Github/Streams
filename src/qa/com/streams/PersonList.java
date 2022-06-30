package qa.com.streams;

import java.util.LinkedList;

public class PersonList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<PersonStream> person = new LinkedList<PersonStream>();
		
		person.add(new PersonStream ("Hazard", 31, "Footballer"));
		person.add(new PersonStream ("Todd", 38, "Doctor"));
		person.add(new PersonStream ("Bill", 34, "Singer"));
		person.add(new PersonStream ("Havertz", 22, "Footballer"));
		
	
	for (PersonStream p: person) {
		
		System.out.println(p.getName());
		}
	}
}
	
