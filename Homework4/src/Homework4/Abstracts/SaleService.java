package Homework4.Abstracts;

import Homework4.Entities.Campaign;
import Homework4.Entities.Customer;
import Homework4.Entities.Game;


public interface SaleService {
	public void sale(Game game, Customer customer);
	public void afterCampaignSale(Game game,Customer customer,Campaign campaign);
	
}
