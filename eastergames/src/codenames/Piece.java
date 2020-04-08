package codenames;

public class Piece {
	
	private String name;
	private String color;
	
	public Piece(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getColor() {
		return this.color;
	}

	@Override
	public String toString() {
		return "Piece [name=" + name + ", color=" + color + "]";
	}
	
	
	

	
}
