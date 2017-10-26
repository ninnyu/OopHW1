/*	Homework 1, Question 2
 *	@author NinnYu Chin
 *	Instruction: 	In a loop, read radiuses from a user. Calculate the area of a circle using 
 *			the formula PI*r^2. Use the pow function, and the PI constant in the Math 
 *			class. Pick your data types wisely. Exit when the user sends EOF (either 
 *			ctrl-d, or ctrl-z depending on your operating system). Show your output.
 */

import java.util.*;

public class AreaCircle {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList<Double> radii = new ArrayList<Double>();
		ArrayList<Double> areas = new ArrayList<Double>();
		
		//Checks for the next input. If it's not a number, tells user to try again.
		while (sc.hasNext()) {
			if ( sc.hasNextDouble() ) {
				double r = sc.nextDouble();
			
				//Checks if the input number is valid.
				if (r < 0)
					System.out.println(r + " is not a valid number. Must be greater than 0. Cannot calculate area.");
			
				//Adds the user's input as a radius into the array radii.
				//Adds the area's calculation into the array areas.
				if (r >= 0) {
					radii.add(r);
					areas.add(Math.PI * Math.pow(r, 2));
				}
			}
			else
				System.out.println("\"" + sc.next() + "\"" + " is not a number. Try again.");
			}
		
		sc.close();
		
		//Prints out the results.
		for (int i = 0; i < radii.size(); i++)
			System.out.println("With a radius of " + radii.get(i) + " , the area of a circle is " + areas.get(i) + ".");
	}
}
