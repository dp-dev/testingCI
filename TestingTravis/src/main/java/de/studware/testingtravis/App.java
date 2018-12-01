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
		App app = new App();
		app.add(2, 3);
	}
	
	public int add(int no1, int no2) {
		String msg = String.format("Add {0} + {1}", no1, no2);
		LOG.log(Level.INFO, msg);
		return no1 + no2;
	}
}
