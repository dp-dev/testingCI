package de.studware.testingtravis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	private static final Logger log = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		App app = new App();
		app.checkAllMethods();
	}
	
	public void checkAllMethods() {
		add(2, 3);
		sub(8, 7);
	}
	
	public int add(int no1, int no2) {
		log.info("Add {} + {}", no1, no2);
		return no1 + no2;
	}
	
	public int sub(int no1, int no2) {
		log.info("Sub {} - {}", no1, no2);
		return no1 - no2;
	}
}
