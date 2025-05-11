package com.akhil.tictactoe.winStrategy;

import java.util.ArrayList;

import com.akhil.tictactoe.board.Board;
import com.akhil.tictactoe.board.BoardCell;
import com.akhil.tictactoe.board.PieceType;
import com.akhil.tictactoe.gamemove.Move;

public class NinARowWinningStrategy implements WinningStrategy{
	
	@Override
	public boolean checkWin(Board board, Move move, int n) {
		int boardSize = board.getSize();
		if (n > boardSize) {
			return false;
		}
		int curRow = move.getX();
		int curCol = move.getY();
		PieceType pieceType= move.getPlayer().getPieceType();
		int rowsCovered = 0;
		int colsCovered = 0;
		int leftDiagCovered = 0;
		int rightDiagCovered = 0;
		
		
		for(int i=0;i<boardSize;i++) {
			BoardCell cell = board.getCells().get(i).get(curCol);
			if (!cell.isAvailable() && cell.getPieceType().equals(pieceType)) rowsCovered += 1;
			BoardCell cell2 = board.getCells().get(curRow).get(i);
			if (!cell2.isAvailable() && cell2.getPieceType().equals(pieceType)) colsCovered += 1;
			BoardCell cell3 = board.getCells().get(i).get(i);
			if (!cell3.isAvailable() && cell3.getPieceType().equals(pieceType)) leftDiagCovered += 1;
			BoardCell cell4 = board.getCells().get(i).get(boardSize - i - 1);
			if (!cell4.isAvailable() && cell4.getPieceType().equals(pieceType)) rightDiagCovered += 1;
		}
		
		ArrayList<Integer> listOfCovered = new ArrayList<Integer>();
		listOfCovered.add(rowsCovered);
		listOfCovered.add(colsCovered);
		listOfCovered.add(leftDiagCovered);
		listOfCovered.add(rightDiagCovered);
		return listOfCovered.contains(n);
	}
}
