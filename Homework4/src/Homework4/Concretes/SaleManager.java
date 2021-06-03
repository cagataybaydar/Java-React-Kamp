package Homework4.Concretes;

import Homework4.Abstracts.SaleService;
import Homework4.Entities.Campaign;
import Homework4.Entities.Customer;
import Homework4.Entities.Game;

public class SaleManager implements SaleService{

	@Override
	public void sale(Game game, Customer customer) {
		System.out.println(game.getGameName() + " " + "oyunu" + " " 
	+ customer.getFirstName() + " " + "isimli oyuncuya satýldý.");
		
	}

	@Override
	public void afterCampaignSale(Game game, Customer customer, Campaign campaign) {
		System.out.println(game.getGameName() + " " 
	+ "oyunu" + " " + customer.getFirstName() + " " + "isimli oyuncuya" + " " + campaign.getcampaignName()+ " " + "kampanyasý uygulanarak satýldý.");
	}



}

