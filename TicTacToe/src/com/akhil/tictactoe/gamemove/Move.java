package com.akhil.tictactoe.gamemove;

import com.akhil.tictactoe.board.Pair;
import com.akhil.tictactoe.player.Player;

public class Move {
	int x;
	int y;
	Player player;
	
	public Move(Pair cords, Player player) {
		this.x = cords.getX();
		this.y = cords.getY();
		this.player = player;
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

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}
