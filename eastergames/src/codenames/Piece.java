package codenames;

public class Piece {
	
	private String name;
	private char color;
	private boolean isRevealed; 
	
	public Piece(String name, char color) {
		this.name = name;
		this.color = color;
		this.isRevealed = false;
	}
	
	public String getName() {
		return this.name;
	}
	
	public char getColor() {
		return this.color;
	}
	
	public void setRevealed() {
		this.isRevealed = !this.isRevealed;
	}
	
	public boolean getRevealed() {
		return this.isRevealed;
	}

	@Override
	public String toString() {
		return "Piece [name=" + name + ", color=" + color + "]";
	}
	
	
	

	
}
