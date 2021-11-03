package tiere;

public class Papagei {

	private String name;

	private Papagei(String name) {
		this.name = name;
	}
	
	public void sprechen() {
		System.out.println("Hallo, ich bims "+name);
	}
}
