package Concrete;

import Abstract.ICampaignService;
import Entites.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void addNewCampaign(Campaign campain) {
		System.out.println("New Campaign added : " + campaign.campaignName);
		
	}

	@Override
	public void deleteCampaign(Campain campain) {
		
		System.out.println("Campaign deleted. : " + campaign.campaignName);
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		
		System.out.println("Campaign updated : " + campaign.campaignName);
	}

	
	
	
}
