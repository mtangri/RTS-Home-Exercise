package com.build.base;

import java.util.Scanner;
import java.util.logging.Logger;

public class RotateStringByOffset {
	public static void main(String[] args) throws Exception {
		final Logger logger = Logger.getLogger(RotateStringByOffset.class.getName());
		Scanner numberForRot = new Scanner(System.in);
		logger.info("Enter the number to rotate the string:-");
		String givenInput = numberForRot.nextLine(); // Read input for number
		//convert input rotate number to integer
		Integer givenInputInt = Integer.parseInt(givenInput);
		numberForRot = new Scanner(System.in);
		logger.info("Enter the string to rotate:-");
		String givenString = numberForRot.nextLine(); // Read input for number
		
		try {
			logger.info("Given rotate by number is : " + givenInput); // Output rotate 
			logger.info("Given string is : " + givenString); // Output string
			String afterOffSet = givenString.substring(givenString.length() - givenInputInt, givenString.length());
			String beforeOffSet = givenString.substring(0, givenString.length() - givenInputInt);
			logger.info(givenString +" rotated by " +givenInputInt +" is " +afterOffSet+beforeOffSet);
			
			
		} catch (NumberFormatException e) {
			logger.severe("Given rotation number input is invalid :" + e.getMessage());
		} catch (StringIndexOutOfBoundsException e) {
			logger.severe("Given input String is too small for rotation :" + e.getMessage());
		}	finally {
			// close any connections such as db connections and others
			numberForRot.close();
		}

	}

}