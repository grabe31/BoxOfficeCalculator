package test;
import model.Movie;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Sep 4, 2023
 */
public class testMovie {
	Movie movie = new Movie();
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMovieName() {
		movie.setName("Barbie");
		assertNotNull(movie.getName());
	}
	
	@Test
	public void testImaxPremium() {
		movie.setImaxPremium(11.00);
		assertTrue(movie.getImaxPremium() == 11.00);
	}

}
