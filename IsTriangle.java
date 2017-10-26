/*	Homework 1, Question 5
 *	@author NinnYu Chin
 *	Instruction: 	Write a program that reads three 2D points A, B, and C from the user. 
 *			Next, calculate the length of each side of the triangle using the 
 *			distance formula: sqrt((x2-x1)^2+(y2-y1)^2). Finally, determine if it's a 
 *			real triangle. For a triangle to be real, the sum of any two sides needs 
 *			to be greater than the third. Make sure your output has some real and at 
 *			least one fake triangle.
 *	Reference: 	https://stackoverflow.com/questions/14845937/java-how-to-set-precision-for-double-value
 */

import java.math.*;
import java.util.*;

public class IsTriangle {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		double distAB, distAC, distBC;

		double[] a = {sc.nextDouble(), sc.nextDouble()};
		double[] b = {sc.nextDouble(), sc.nextDouble()};
		double[] c = {sc.nextDouble(), sc.nextDouble()};
		
		sc.close();
		
		distAB = Math.sqrt(Math.pow((b[0]-a[0]), 2) + Math.pow((b[1]-a[1]), 2));
		distAC = Math.sqrt(Math.pow((c[0]-a[0]), 2) + Math.pow((c[1]-a[1]), 2));
		distBC = Math.sqrt(Math.pow((b[0]-c[0]), 2) + Math.pow((b[1]-c[1]), 2));
		
		distAB = BigDecimal.valueOf(distAB).setScale(5, RoundingMode.HALF_UP).doubleValue();
		distAC = BigDecimal.valueOf(distAC).setScale(5, RoundingMode.HALF_UP).doubleValue();
		distBC = BigDecimal.valueOf(distBC).setScale(5, RoundingMode.HALF_UP).doubleValue();
		
		double[] distances = {distAB, distBC, distAC};
		Arrays.sort(distances);
				
		//Determines if the sum of the two smaller sides is bigger than the largest side.
		if ( (distances[0] + distances[1]) > distances[2] )
			System.out.println("The points you entered A(" + a[0] + ", " + a[1] +
					"), B(" + b[0] + ", " + b[1] + "), C(" + c[0] + ", " + c[1] + ") make a true triangle!");
		else
			System.out.println("The points you entered A(" + a[0] + ", " + a[1] +
					"), B(" + b[0] + ", " + b[1] + "), C(" + c[0] + ", " + c[1] + ") DO NOT make a true triangle!");
	}
}
