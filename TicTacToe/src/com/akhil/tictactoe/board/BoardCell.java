package com.akhil.tictactoe.board;

public class BoardCell {
	private int x;
	private int y;
	private boolean isAvailable;
	private PieceType pieceType;
	
	public BoardCell(int x, int y) {
		this.x = x;
		this.y = y;
		this.isAvailable = true;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public PieceType getPieceType() {
		return pieceType;
	}

	public void setPieceType(PieceType pieceType) {
		this.pieceType = pieceType;
	}

	public void placePiece(PieceType pieceType) {
		this.pieceType = pieceType;
		this.isAvailable = false;
	}
}
