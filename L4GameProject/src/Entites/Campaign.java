package Entites;

import java.time.LocalDate;

public class Campaign {

	public String campaignName;
	private LocalDate startedAt;
	private LocalDate completedAt;
	private int discountRate;
	
	
	public Campain(String campaignName, LocalDate startedAt, LocalDate completedAt, int discountRate) {
		super();
		this.campaignName = campaignName;
		this.startedAt = startedAt;
		this.completedAt = completedAt;
		this.discountRate = discountRate;
	}

	
	
	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public LocalDate getStartedAt() {
		return startedAt;
	}

	public void setStartedAt(LocalDate startedAt) {
		this.startedAt = startedAt;
	}

	public LocalDate getCompletedAt() {
		return completedAt;
	}

	public void setCompletedAt(LocalDate completedAt) {
		this.completedAt = completedAt;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	
}


	

	
	
