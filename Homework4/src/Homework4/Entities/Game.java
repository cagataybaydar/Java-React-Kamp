package Homework4.Entities;

import Homework4.Abstracts.Entity;

public class Game implements Entity {
	private int gameId;
	private String gameName;
	
	public Game() {
		
	}

	public Game(int gameId, String gameName) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
	
}
