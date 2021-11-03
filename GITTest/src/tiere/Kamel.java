package tiere;

public class Kamel {
	private String name;
	
	public String getName() {
		return name;
	}

	public Kamel(String name) {
		this.name=name;
	}
	
	public void spucken() {
		System.out.println("Spuck !!* Spuck !!* Spuck !!* ");
	}
	
	public void laufen(int meter) {
		System.out.println(name+" läuft "+meter+" meter !");
	}
	
	
}

