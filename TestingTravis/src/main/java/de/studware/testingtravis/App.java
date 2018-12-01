package de.studware.testingtravis;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger LOG = Logger.getLogger(App.class.getName());
	
	public static void main(String[] args) {
		LOG.log(Level.INFO, "Hello World!");
	}
	
	public int add(int no1, int no2) {
		return no1 + no2;
	}
}
