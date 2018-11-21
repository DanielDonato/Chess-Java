package com.danieldonato.chess.pieces;

import com.danieldonato.boardgame.Board;
import com.danieldonato.chess.ChessPiece;
import com.danieldonato.chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "R";
	}
	
}
