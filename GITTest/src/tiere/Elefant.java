package tiere;

public class Elefant {
	
	private String name;
	public Elefant(String name) {
		this.name = name;
	}
	
	public void verwandeln() {
		System.out.println("Ich heisse immer noch "+name+" aber nun bin ich ein Ottifant!");
	}

	public String getName() {
		return name;
	}
	
}
