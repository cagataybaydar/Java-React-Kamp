package Homework4.Concretes;

import Homework4.Entities.Game;

public class GameManager {
	public void add(Game game) {
		System.out.println(game.getGameName() + "isimli oyun eklendi");
	}
	
	public void update(Game game) {
		System.out.println(game.getGameName() + "isimli oyun güncellendi");
	}
	
	public void delete(Game game) {
		System.out.println(game.getGameName() + "isimli oyun silindi");
	}
}
