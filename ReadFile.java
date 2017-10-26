/*	Homework 1, Question 4
 *	@author NinnYu Chin
 *	Instruction: 	Feed a file that contains numbers into your program using command line 
 *			redirection. Have your program read & print the file on the screen.
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
