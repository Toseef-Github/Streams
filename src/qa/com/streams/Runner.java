package qa.com.streams;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PersonStream p1 = new PersonStream("Hazard", 31, "Footballer");
PersonStream p2 = new PersonStream("Drogba", 40, "Footballer");
PersonStream p3 = new PersonStream("Abel", 32, "Artist");
PersonStream p4 = new PersonStream("Khabib", 26, "Fighter");

System.out.println(p1.toString());
System.out.println(p2.toString());
System.out.println(p3.toString());
System.out.println(p4.toString());
	}

}
