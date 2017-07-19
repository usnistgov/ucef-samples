package UtilityProject;

public class Configuration {
	
	private int maxHouses = 50;	// maximum houses supported
	private double pricebulk = 0.07;	// price per kwh bulk power
	private double pricesolar = 0.0;	// price for solar per kwh
	private double pricefixed = 0.04;	// fixed capital costs per kwh
	private double solarpowerperdirectsolar=1000.0;	// solar energy produced based on direct insolation
	
	public int getMaxHouses() {
		return maxHouses;
	}
	public void setMaxHouses(int maxHouses) {
		this.maxHouses = maxHouses;
	}
	public double getPricebulk() {
		return pricebulk;
	}
	public void setPricebulk(double pricebulk) {
		this.pricebulk = pricebulk;
	}
	public double getPricesolar() {
		return pricesolar;
	}
	public void setPricesolar(double pricesolar) {
		this.pricesolar = pricesolar;
	}
	public double getPricefixed() {
		return pricefixed;
	}
	public void setPricefixed(double pricefixed) {
		this.pricefixed = pricefixed;
	}
	public double getSolarpowerperdirectsolar() {
		return solarpowerperdirectsolar;
	}
	public void setSolarpowerperdirectsolar(double solarpowerperdirectsolar) {
		this.solarpowerperdirectsolar = solarpowerperdirectsolar;
	}
}
