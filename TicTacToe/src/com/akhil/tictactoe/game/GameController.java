package com.akhil.tictactoe.game;

import com.akhil.tictactoe.gamemove.Move;
import com.akhil.tictactoe.player.Player;

public class GameController {
	
	GameEngine engine;

	public GameController(GameEngine engine) {
		this.engine = engine;
	}
		
	public void playGame(GameState state) {
		while(GameStatus.IN_PROGRESS.equals(state.getStatus())) {
			Player currentPlayer = state.getPlayers().poll();
			if(state.getBoard().getCellsCovered() == state.getBoardSize() * state.getBoardSize()) {
				state.setStatus(GameStatus.TIE);
				continue;
			}
			Move move = currentPlayer.makeMove();
			try {
				state = engine.applyMove(state, move);
				state.players.add(currentPlayer);
			} catch(Exception e) {
				System.out.println("Invalid Move: " + e.getMessage());
				state.players.addFirst(currentPlayer);
			}		
		}
		
		if(GameStatus.WON.equals(state.getStatus())) {
			System.out.println("Game Won by " + state.getWinner().getName());
		} else {
			System.out.println("Game resulted in a Tie");
		}
	}
}
