package com.akhil.tictactoe.winStrategy;

import com.akhil.tictactoe.board.Board;
import com.akhil.tictactoe.gamemove.Move;

public interface WinningStrategy {
	boolean checkWin(Board board, Move move, int n);
}
