package com.akhil.tictactoe.game;

import java.util.ArrayDeque;
import java.util.Deque;

import com.akhil.tictactoe.board.Board;
import com.akhil.tictactoe.board.PieceType;
import com.akhil.tictactoe.gamemove.MoveHistory;
import com.akhil.tictactoe.player.Player;
import com.akhil.tictactoe.player.PlayerFactory;
import com.akhil.tictactoe.player.PlayerType;
import com.akhil.tictactoe.winStrategy.NinARowWinningStrategy;
import com.akhil.tictactoe.winStrategy.WinningStrategy;

public class GameSetupService {
	
	public GameState initializeGame(int boardSize){
		Board board = this.createBoard(boardSize);
		MoveHistory moveHistory = new MoveHistory();
		Deque<Player> players = new ArrayDeque<Player>();
		Player player1 = PlayerFactory.getPlayer(1, "Akhil", PlayerType.HUMAN, PieceType.X);
		Player player2 = PlayerFactory.getPlayer(2, "Krishna", PlayerType.HUMAN, PieceType.O);
		players.add(player1);
		players.add(player2);
		GameState state = new GameState(boardSize, board, players, moveHistory, player2, GameStatus.IN_PROGRESS);
		return state;
	}
	
	private Board createBoard(int boardSize) {
		return new Board(boardSize);
	}
}
