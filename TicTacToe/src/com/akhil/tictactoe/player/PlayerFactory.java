package com.akhil.tictactoe.player;

import com.akhil.tictactoe.board.PieceType;

public final class PlayerFactory {
	private PlayerFactory() {}
	
	public static Player getPlayer(int id, String name, PlayerType playerType, PieceType pieceType) {
		if (playerType.equals(PlayerType.HUMAN)) {
			return new HumanPlayer(id, name, pieceType);
		}
		return new BotPlayer(id, name, pieceType);
	}
}
