package com.akhil.tictactoe.player;

import com.akhil.tictactoe.board.Board;
import com.akhil.tictactoe.board.Pair;
import com.akhil.tictactoe.board.PieceType;
import com.akhil.tictactoe.gamemove.Move;

public abstract class Player {
	private int id;
	public String name;
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public PieceType getPieceType() {
		return pieceType;
	}
	final PieceType pieceType;
	
	public Player(int id, String name, PieceType pieceType) {
		this.id = id;
		this.name = name;
		this.pieceType = pieceType;
	}
	
	
	public abstract Pair getMoveCordinates();
	public abstract Move makeMove();
}
