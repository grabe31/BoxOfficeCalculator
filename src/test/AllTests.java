package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Sep 5, 2023
 */
@RunWith(Suite.class)
@SuiteClasses({ testBoxOfficeCalc.class, testMovie.class })
public class AllTests {

}
