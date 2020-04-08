package codenames;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class Game {

	private static final int BOARD_SIZE = 5;
	private static final String COLORS = "RRRRRRRRRBBBBBBBBXGGGGGGG";
	private Piece[][] pieces;
	private String[] wordList = new String[] {"Jeg", "gikk", "en", "tur", "paa", "stien", "og", "hoerte", "skogens", "rop", "da", "bord", "flaske", "juice", "lampe", "lys", "kopp", "kaffe", "spill", "telefon", "kjokken", "datamaskin", "trapp", "bilde", "speil"};
	
	public Game() {
		ArrayList<Piece> piecesList = new ArrayList<Piece>();
		for (int i = 0; i < BOARD_SIZE*BOARD_SIZE; i++) {
			piecesList.add(new Piece(wordList[i],COLORS.charAt(i)));
		}
		Collections.shuffle(piecesList);
		
		int counter = 0;
		
		pieces = new Piece[BOARD_SIZE][BOARD_SIZE];
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				pieces[i][j] = piecesList.get(counter++);
			}
		}
	}

	public Piece[][] getPieces() {
		return pieces;
	}
	
	@Override
	public String toString() {
		return "Game [pieces=" + Arrays.toString(pieces) + "]";
	}
	
	public static void main (String[] args) {
		Game test = new Game();
		int counter = 0;
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				System.out.println(test.getPieces()[i][j]);
				counter++;
			}
		}
		System.out.println(counter);
	}
}
