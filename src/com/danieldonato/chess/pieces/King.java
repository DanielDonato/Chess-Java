package com.danieldonato.chess.pieces;

import com.danieldonato.boardgame.Board;
import com.danieldonato.chess.ChessPiece;
import com.danieldonato.chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}
}
