package Encapsulation1;

public class Main {
	public static void main(String[] args) {
		Person1 p = new Person1();
		Person1 p1 = new Person1("H", "A", 'F');
		p.setfirst("Haritha");
		p.setlast("Alapati");
		p.setgender('F');
		System.out.println(p.getlast() +" " + p.getfirst() + " " +  p.getGender());
		System.out.println(p1.display());
	}
}
