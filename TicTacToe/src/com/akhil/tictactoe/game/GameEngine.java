package com.akhil.tictactoe.game;

import com.akhil.tictactoe.board.Board;
import com.akhil.tictactoe.gamemove.Move;
import com.akhil.tictactoe.gamemove.MoveValidator;
import com.akhil.tictactoe.winStrategy.WinningStrategy;

public class GameEngine {
	WinningStrategy winningStrategy;
	
	public GameEngine(WinningStrategy winningStrategy){
		this.winningStrategy = winningStrategy;
	}
	
	public GameState applyMove(GameState state, Move move) throws Exception {
		MoveValidator.isMoveValid(state.getBoard(), move);	
		state.getBoard().applyMove(move);
		state.getMoveHistory().addMove(move);
		if(this.checkWin(state.getBoard(), move, state.getBoardSize())) {
			state.setStatus(GameStatus.WON);
			state.setWinner(move.getPlayer());
		}
		return state;
	}
	
	public boolean checkWin(Board board, Move move, int n) {
		return this.winningStrategy.checkWin(board, move, n);
	}
}
