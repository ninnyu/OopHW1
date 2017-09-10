import java.math.*;
import java.util.*;

/*	Homework 1, Question 6
	@author NinnYu Chin
	Description: 	Reads in the center of a circle and its radius.
					Determines whether the circles are separate from 
					each other, touching each other, overlapping each
					other, or completely within one another.
*/

public class WhereCircles {
	public static void main (String[] args) {
		double r1, r2, dist;
		Scanner sc = new Scanner (System.in);

		double[] c1 = {sc.nextDouble(), sc.nextDouble()};
		r1 = sc.nextDouble();
		double[] c2 = {sc.nextDouble(), sc.nextDouble()};
		r2 = sc.nextDouble();
		
		System.out.println("Your first circle has (" + c1[0] + ", " + c1[1] + ") as its center with a radius of " + r1 + ".");
		System.out.println("Your second circle has (" + c2[0] + ", " + c2[1] + ") as its center with a radius of " + r2 + ".");
		
		sc.close();
		
		dist = Math.sqrt(Math.pow((c2[0]-c1[0]), 2) + Math.pow((c2[1]-c1[1]), 2));
		dist = BigDecimal.valueOf(dist).setScale(5, RoundingMode.HALF_UP).doubleValue();
		
		double[][] cornersc1 = { 	{(c1[0]), (c1[1] + r1)},
									{(c1[0] + r1), (c1[1])},
									{(c1[0]), (c1[1] - r1)},
									{(c1[0] - r1), (c1[1]) } };
		double[][] cornersc2 = { 	{(c2[0]), (c2[1] + r2)},
									{(c2[0] + r2), (c2[1])},
									{(c2[0]), (c2[1] - r2)},
									{(c2[0] - r2), (c2[1]) } };
		
		//Determines if and which circle is inside one another.
		if ( cornersc1[0][1] > cornersc2[0][1] )
			if ( cornersc1[1][0] > cornersc2[1][0] )
				if ( cornersc1[2][1] < cornersc2[2][1] )
					if ( cornersc1[3][0] < cornersc2[3][0] )
						System.out.println("Your second circle is inside your first circle.");
		if ( cornersc1[0][1] < cornersc2[0][1] )
			if ( cornersc1[1][0] < cornersc2[1][0] )
				if ( cornersc1[2][1] > cornersc2[2][1] )
					if ( cornersc1[3][0] > cornersc2[3][0] )
						System.out.println("Your first circle is inside your second circle.");
		
		//Determines if the circles are overlapping or touching.
		if ( dist < (r1 + r2) )
			System.out.println("Your circles are overlapping.");
		if ( dist == (r1 + r2) )
			System.out.println("Your circles are touching.");
		if ( dist > (r1 + r2) )
			System.out.print("Your circles are separate from each other.");
	}
}
