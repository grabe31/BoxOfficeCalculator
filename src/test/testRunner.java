package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Sep 4, 2023
 */
public class testRunner {


	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(testBoxOfficeCalc.class, testMovie.class);
		
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}
	

}
