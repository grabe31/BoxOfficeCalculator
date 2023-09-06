package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.Movie;
import model.BoxOfficeCalc;
/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Sep 4, 2023
 */
public class testBoxOfficeCalc {
	
	//create a movie with made up data
	Movie movie = new Movie("Barbie", 43230, 2800);
	BoxOfficeCalc boCalc = new BoxOfficeCalc();
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}


		
	@Test
	public void testStandardTotal() {
			
			double standardTotal = 389070.00;
			assertEquals(standardTotal, boCalc.standardTotal(movie), 0.0);
	}
		
	@Test
	public void testImaxTotal() {
			double imaxTotal = 56000;
			assertEquals(imaxTotal, boCalc.imaxTotal(movie), 0.0);
	}
		
		

}
