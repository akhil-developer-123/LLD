package com.akhil.tictactoe.game;

import java.util.Deque;

import com.akhil.tictactoe.board.Board;
import com.akhil.tictactoe.gamemove.MoveHistory;
import com.akhil.tictactoe.player.Player;
import com.akhil.tictactoe.winStrategy.WinningStrategy;

public class GameState {
	int boardSize;
	Board board;
	Deque<Player> players;
	MoveHistory moveHistory;
	Player winner;
	GameStatus status;
	public int getBoardSize() {
		return boardSize;
	}
	public Board getBoard() {
		return board;
	}
	public Deque<Player> getPlayers() {
		return players;
	}
	public MoveHistory getMoveHistory() {
		return moveHistory;
	}
	public Player getWinner() {
		return winner;
	}
	public GameStatus getStatus() {
		return status;
	}
	
	public GameState(int boardSize, Board board, Deque<Player> players, MoveHistory moveHistory, Player winner,
			GameStatus status) {
		this.boardSize = boardSize;
		this.board = board;
		this.players = players;
		this.moveHistory = moveHistory;
		this.winner = winner;
		this.status = status;
	}
	public void setStatus(GameStatus status) {
		this.status = status;
	}
	public void setWinner(Player player) {
		this.winner = player;
	}

}
