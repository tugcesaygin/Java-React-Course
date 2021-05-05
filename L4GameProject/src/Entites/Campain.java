package Entites;

import java.time.LocalDate;

public class Campain {

	public String campainName;
	private LocalDate startedAt;
	private LocalDate completedAt;
	private int discountRate;
	
	
	public Campain(String campainName, LocalDate startedAt, LocalDate completedAt, int discountRate) {
		super();
		this.campainName = campainName;
		this.startedAt = startedAt;
		this.completedAt = completedAt;
		this.discountRate = discountRate;
	}

	
	
	public String getCampainName() {
		return campainName;
	}

	public void setCampainName(String campainName) {
		this.campainName = campainName;
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


	

	
	