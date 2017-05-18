/*
Programmer: Justin Doggett
Date: 5/9/2017
Description: This program ask the user to enter three test scores, and then will display each test score as well as the average of the scores.
*/

import java.util.Scanner;

public class TestAverage
{
	public static void main(String [] args)
	{
		int testScore1; //holds the value of the first test score
		int testScore2; //holds the value of the second test score
		int testScore3; //holds the value of the third test score
		int testAverage; //holds the value of the average of the three test scores

		//Creates a scanner object for reading input
		Scanner keyboard = new Scanner(System.in);

		//Prompt the user to enter their first test score.
		System.out.println("Please enter your first test score.");
		testScore1 = keyboard.nextInt();
		System.out.println("The first test score is: " + testScore1); //displays the first test score

		//Prompt the user to enter their second second test score
		System.out.println("Please enter your second test score.");
		testScore2 = keyboard.nextInt();
		System.out.println("The second test score is: " + testScore2); //displays the second test score

		//Prompt the user to enter their third test score
		System.out.println("Please enter your third test score.");
		testScore3 = keyboard.nextInt();
		System.out.println("The third test score is: " + testScore3); //displays the third test score

                 keyboard.nextLine();

		//Calculates the average of the three test scores entered by the user
		testAverage = (testScore1 + testScore2 + testScore3) / 3;

		//Prints the user's average
		System.out.println("Your test average is: " + testAverage);
	}
}