package com.akhil.tictactoe.gamemove;

import com.akhil.tictactoe.board.Board;
import com.akhil.tictactoe.board.BoardCell;

public final class MoveValidator {
	
	private MoveValidator() {}
	
	public static void isMoveValid(Board board, Move move) throws Exception {
		if(!isWithinBoundary(board.getSize(), move)) {
			throw new Exception("out of boundaries, retry with valid input");
		}
		
		BoardCell cell = board.getCells().get(move.x).get(move.y);
		if(!cell.isAvailable()) {
			throw new Exception("Cell is already used up, retry another cell");
		}
	}
	
	private static boolean isWithinBoundary(int boardSize, Move move) {
		return move.x >= 0 && move.x < boardSize && move.y >=0 && move.y < boardSize;
	}
}
