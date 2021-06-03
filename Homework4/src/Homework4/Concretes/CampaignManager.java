package Homework4.Concretes;

import Homework4.Abstracts.CampaignService;
import Homework4.Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getcampaignName() + " isimli oyuna kampanya eklendi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getcampaignName()+ " isimli oyunun kampanyasý güncellendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getcampaignName() + " isimli oyunun kampanyasý kaldýrýldý");
		
	}
	
}
