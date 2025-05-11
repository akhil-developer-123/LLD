package com.akhil.tictactoe.player;

import java.util.Scanner;

import com.akhil.tictactoe.board.Pair;
import com.akhil.tictactoe.board.PieceType;
import com.akhil.tictactoe.gamemove.Move;

public class HumanPlayer extends Player{
	int id;
	String name;
	PieceType pieceType;
	
	public HumanPlayer(int id, String name, PieceType pieceType) {
		super(id, name, pieceType);
	}
	
	@Override
	public Pair getMoveCordinates(){
	    Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter x and y:");
	    int x = myObj.nextInt();
	    int y = myObj.nextInt();
	    return new Pair(x, y);
	}
	
	@Override
	public Move makeMove() {
		Pair cords = this.getMoveCordinates();
		return new Move(cords, this);
	}
}
