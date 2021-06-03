package Homework4;

import Homework4.Abstracts.CustomerService;
import Homework4.Adapters.MernisServiceAdapter;
import Homework4.Concretes.CampaignManager;
import Homework4.Concretes.CustomerManager;
import Homework4.Concretes.GameManager;
import Homework4.Concretes.SaleManager;
import Homework4.Entities.Campaign;
import Homework4.Entities.Customer;
import Homework4.Entities.Game;

public class Main {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerManager(new MernisServiceAdapter());
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Çaðatay");
		customer.setLastName("Baydar");
		customer.setDateOfBirth(1995);
		customer.setNationalityId("123456789");
		
		customerService.add(customer);
		customerService.update(customer);
		customerService.delete(customer);
		
		Game game = new Game();
		game.setGameId(1);
		game.setGameName("CS:GO");
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		gameManager.update(game);
		gameManager.delete(game);
		
		Campaign campaign = new Campaign();
		campaign.setcampaignId(1);
		campaign.setcampaignName("Bahar Ýndirimi");
		campaign.setDiscount(35);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign);
		
		SaleManager saleManager = new SaleManager();
		saleManager.afterCampaignSale(game, customer, campaign);
		
		
		
	}

}
