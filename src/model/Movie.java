package model;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Sep 4, 2023
 */
public class Movie {
	
	private String name;
	private int standardTickets;
	private double standardCost;
	private int imaxTickets;
	private double imaxPremium;
	
	public Movie(){
		
	}
	
	public Movie(String name, int standard, int imax){
		this.setName(name);
		this.setStandardTickets(standard);
		this.setImaxTickets(imax);
		this.setStandardCost(9.00);
		this.setImaxPremium(11.00);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStandardTickets() {
		return standardTickets;
	}

	public void setStandardTickets(int standardTickets) {
		this.standardTickets = standardTickets;
	}

	public int getImaxTickets() {
		return imaxTickets;
	}

	public void setImaxTickets(int imaxTickets) {
		this.imaxTickets = imaxTickets;
	}

	public double getStandardCost() {
		return standardCost;
	}

	public void setStandardCost(double standardCost) {
		this.standardCost = standardCost;
	}

	public double getImaxPremium() {
		return imaxPremium;
	}

	public void setImaxPremium(double imaxPremium) {
		this.imaxPremium = imaxPremium;
	}

}
