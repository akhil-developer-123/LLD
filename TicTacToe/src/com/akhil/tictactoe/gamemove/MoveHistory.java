package com.akhil.tictactoe.gamemove;

import java.util.Stack;

public class MoveHistory {
	Stack<Move> moves;
	
	public MoveHistory(){
		this.moves = new Stack<Move>();
	}
	
	public void addMove(Move move) {
		moves.add(move);
	}
	
	public Stack<Move> getMoves() {
		return moves;
	}

	public void setMoves(Stack<Move> moves) {
		this.moves = moves;
	}

	public void undoMove() {
		if (!moves.empty()) {
			Move move = moves.removeLast();	
			System.out.println("Last move undone " + move.toString());
		}
	}
}
