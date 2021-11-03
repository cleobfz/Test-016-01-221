package tiere;
/**
 * Eine Welliklasse
 * 
 * @author Marcus Pautsch
 *
 */
public class Welli {
	
	private String name;

	public Welli(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Welli [name=" + name + "]";
	}
}
