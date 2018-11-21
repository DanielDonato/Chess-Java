package com.danieldonato.application;

import com.danieldonato.boardgame.Board;
import com.danieldonato.boardgame.Position;
import com.danieldonato.chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
	}
}
