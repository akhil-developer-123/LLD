package com.akhil.tictactoe.board;
import java.util.ArrayList;

import com.akhil.tictactoe.gamemove.Move;

public class Board {
	int size;
	ArrayList<ArrayList<BoardCell>> cells;
	int cellsCovered;
	
	public Board(int size) {
		this.size = size;
		this.addCells(size);
		this.cellsCovered = 0;
	}
	
	public void addCells(int size) {
		this.cells = new ArrayList<ArrayList<BoardCell>>();
		for (int i=0; i< size; i++) {
			ArrayList<BoardCell> curRow = new ArrayList<BoardCell>();
			for(int j=0; j< size; j++) {
				curRow.add(new BoardCell(i, j));
			}
			this.cells.add(curRow);
		}
	}
	
	public void applyMove(Move move) {
		BoardCell cell = this.cells.get(move.getX()).get(move.getY());
		cell.placePiece(move.getPlayer().getPieceType());
		this.cellsCovered += 1;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public ArrayList<ArrayList<BoardCell>> getCells() {
		return cells;
	}

	public void setCells(ArrayList<ArrayList<BoardCell>> cells) {
		this.cells = cells;
	}

	public int getCellsCovered() {
		return cellsCovered;
	}

	public void setCellsCovered(int cellsCovered) {
		this.cellsCovered = cellsCovered;
	}
	
}
