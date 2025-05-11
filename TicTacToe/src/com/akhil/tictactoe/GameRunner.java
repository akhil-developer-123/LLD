package com.akhil.tictactoe;

import java.util.Scanner;

import com.akhil.tictactoe.game.GameController;
import com.akhil.tictactoe.game.GameEngine;
import com.akhil.tictactoe.game.GameSetupService;
import com.akhil.tictactoe.game.GameState;
import com.akhil.tictactoe.winStrategy.WinningStrategy;
import com.akhil.tictactoe.winStrategy.NinARowWinningStrategy;

public class GameRunner {
	
	public static void main(String[] args) {
		WinningStrategy winStrategy = new NinARowWinningStrategy();
		GameEngine engine = new GameEngine(winStrategy);
		GameController game = new GameController(engine);
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter board size:");
	    int boardSize = scanner.nextInt();
	    GameSetupService setupService = new GameSetupService();
		GameState state = setupService.initializeGame(boardSize);
		game.playGame(state);
	}
	
}
