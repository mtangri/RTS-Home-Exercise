package com.build.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class PrintAboveAndBelowCount {
	public static void main(String[] args) throws Exception {
		final Logger logger = Logger.getLogger(PrintAboveAndBelowCount.class.getName());
		Scanner numberForComp = new Scanner(System.in);
		logger.info("Enter the number to start comparsion:-");
		String givenInput = numberForComp.nextLine(); // Read input for number
		try {
			logger.info("Given input is : " + givenInput); // Output
			// convert input to integer for comparison
			Integer parseStringToInt = Integer.parseInt(givenInput);
			// create an array of integers
			List<Integer> listRandom = new ArrayList<Integer>();
			for (int i = 0; i < 115; i++) {
				listRandom.add(i);
			}
			Collections.shuffle(listRandom);
			int countAbove = 0;
			int countBelow = 0;
			for (int i = 0; i < listRandom.size(); i++) {
				if (listRandom.get(i) > parseStringToInt) {
					countAbove++;
				}
				if (listRandom.get(i) < parseStringToInt) {
					countBelow++;
				}

			}

			logger.info("Above: " + countAbove + ", Below :" + countBelow);
		} catch (NumberFormatException e) {
			logger.severe("Given input is invalid :" + e.getMessage());
		} finally {
			// close any connections such as db connections and others
			numberForComp.close();
		}

	}

}