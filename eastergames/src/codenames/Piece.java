package codenames;

public class Piece {
	
	private String name;
	private char color;
	
	public Piece(String name, char color) {
		this.name = name;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	
	public char getColor() {
		return color;
	}

}
