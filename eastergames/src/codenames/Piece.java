package codenames;

public class Piece {
	
	private String name;
	private char color;
	
	public Piece(String name, char color) {
		this.name = name;
		this.color = color;
	}
	
	public String getName() {
		return this.name;
	}
	
	public char getColor() {
		return this.color;
	}

	@Override
	public String toString() {
		return "Piece [name=" + name + ", color=" + color + "]";
	}
	
	
	

	
}
