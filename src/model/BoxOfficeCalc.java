package model;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Sep 4, 2023
 */
public class BoxOfficeCalc {
	public BoxOfficeCalc() {
		
	}
	
	public double standardTotal(Movie movie) {
		return movie.getStandardTickets()*movie.getStandardCost();
	}
	
	public double imaxTotal(Movie movie) {
		return movie.getImaxTickets()*(movie.getStandardCost()+movie.getImaxPremium());
	}
	
	public double sum(double a, double b) {
		return a + b;
	}
	
	public String boxOfficeTotal(Movie movie) {
		return "This week " + movie.getName() + " made $" + sum(this.standardTotal(movie), this.imaxTotal(movie)) + " at the box office.";
	}

}
