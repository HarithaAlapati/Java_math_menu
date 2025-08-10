package Encapsulation;

public class Main {
	public static void main(String[] args) {
		Person p = new Person();
		Person p1 = new Person("H", "A", 'F');
		p.setfirst("Haritha");
		p.setlast("Alapati");
		p.setgender('F');
		System.out.println(p.getlast() +" " + p.getfirst() + " " +  p.getGender());
	}
}
