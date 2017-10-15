/**
 * 
 */
package com.ntv.callback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author PhamQuocHiep
 *
 */
public class App {
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Task task = new SimpleTask();
		Callback callback = new Callback() {
			public void call() {
				LOGGER.info("I'm done now.");
			}
		};
		task.executeWith(callback);
	}
}
