package codenames;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class Game {

	private Piece[][] pieces;
	private String[] wordList = new String[] {"Jeg", "gikk", "en", "tur", "paa", "stien", "og", "hoerte"};
	
	public Game() {
		ArrayList<Piece> piecesList = new ArrayList<Piece>();
		for (int i = 0; i < 8; i++) {
			piecesList.add(new Piece(wordList[i],'h'));
		}
		Collections.shuffle(piecesList);
		
		int counter = 0;
		
		pieces = new Piece[2][4];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				pieces[i][j] = piecesList.get(counter++);
			}
		}
	}

	@Override
	public String toString() {
		return "Game [pieces=" + Arrays.toString(pieces) + "]";
	}
	
	public static void main (String[] args) {
		Game test = new Game();
		System.out.println(test);
	}
}
