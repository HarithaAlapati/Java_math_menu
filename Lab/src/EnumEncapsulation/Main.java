package EnumEncapsulation;

import Encapsulation1.Person1;

public class Main {

	public static void main(String[] args) {
		op p = new op();
		op p1 = new op("H", "A", Gender.F);
		p.setfirst("Haritha");
		p.setlast("Alapati");
		p.setgender(Gender.F);
		System.out.println(p.getlast() +" " + p.getfirst() + " " +  p.getGender());
		System.out.println(p1.display());

	}

}
