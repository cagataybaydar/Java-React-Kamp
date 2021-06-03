package Homework4.Entities;

import Homework4.Abstracts.Entity;

public class Sale implements Entity{
	private String gameId;
	private double price;
	private int stockAmount;
	
	public Sale() {
		
	}

	public Sale(String gameId, double price, int stockAmount) {
		super();
		this.gameId = gameId;
		this.price = price;
		this.stockAmount = stockAmount;
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	
	
}
