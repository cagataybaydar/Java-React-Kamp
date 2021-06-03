package Homework4.Entities;

import Homework4.Abstracts.Entity;

public class Campaign implements Entity {
	private int campaignId;
	private String campaignName;
	private double discount;
	
	public Campaign() {
		
	}

	public Campaign(int campaignId, String campaignName, double discount) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.discount = discount;
	}

	public int campaignId() {
		return campaignId;
	}

	public void setcampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getcampaignName() {
		return campaignName;
	}
	
	public void setcampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
}
