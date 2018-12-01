package de.studware.testingtravis;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger LOG = Logger.getLogger(App.class.getName());
	String msg;
	
	public static void main(String[] args) {
		App app = new App();
		app.add(2, 3);
	}
	
	public int add(int no1, int no2) {
		msg = String.format("Add %d + %d", no1, no2);
		LOG.log(Level.INFO, msg);
		return no1 + no2;
	}
	
	public int sub(int no1, int no2) {
		msg = String.format("Sub %d - %d", no1, no2);
		LOG.log(Level.INFO, msg);
		return no1 - no2;
	}
}
