/*	Homework 1, Question 4
	@author NinnYu Chin
	Description: 	Reads user input from standard out, then
	 				prints it back out.
*/

import java.util.*;

public class ReadFile {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		while (sc.hasNext()) {
			String s = sc.nextLine();
			System.out.println(s);
		}
		
		sc.close();
	}
}
