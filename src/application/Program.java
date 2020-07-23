package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
		
		UI.printBoard(chessMatch.getpieces());
		System.out.println();
		System.out.println("source: ");
		ChessPosition source = UI.readChessPosition(sc);
		
		System.out.println();
		System.out.println("target: ");
		ChessPosition target = UI.readChessPosition(sc);
		
		ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		
	}
	}
}
