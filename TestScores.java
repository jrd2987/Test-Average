/*
Programmer: Justin Doggett
Date: 5/30/2017
Description: This program will ask the user to enter three test scores and then assign the values entered to the variables.
             The program should display the average of the test scores and the letter grade that is assigned for the test
             score average.
*/

import javax.swing.JOptionPane; //Needed for JOptionPane

public class TestScores
{

	public static void main(String [] args)
	{
		//Global Variable Declarations

		JOptionPane.showMessageDialog(null, "Welcome to the Test Average Program.");

		//Method Call
		UsersTestScores();

	}
	public static void UsersTestScores()
	    {
					double score1; //holds the value of the first test score
					double score2; //holds the value of the second test score
					double score3; //holds the value of the third test score
					double average; //holds the value of the average of the three test scores.
					String input; //holds string input

					//Get the user's first test score
					input = JOptionPane.showInputDialog("Enter your first test score.");
					score1 = Double.parseDouble(input);

					//Get the user's second test score
					input = JOptionPane.showInputDialog("Enter your second test score.");
					score2 = Double.parseDouble(input);

					//Get the user's third test score
					input = JOptionPane.showInputDialog("Enter your third test score.");
					score3 = Double.parseDouble(input);


					//Calculate the Average of the three test scores and then display the average
					average = (score1 + score2 + score3) / 3;
					JOptionPane.showMessageDialog(null, "Your test average is: " + average);

					//Determine the test average for the course
					if(average >= 90 && average <= 100)
					{
						JOptionPane.showMessageDialog(null, "Your grade is an A.");
				    }
				    if(average >= 80 && average <= 89)
				    {
						JOptionPane.showMessageDialog(null, "Your grade is a B.");
				    }
				    if(average >= 70 && average <= 79)
					{
						JOptionPane.showMessageDialog(null, "Your grade is a C.");
				    }
				    if (average >= 60 && average <= 69)
				    {
						JOptionPane.showMessageDialog(null, "Your grade is a D.");
					}
					else if(average < 60)
					{
					    JOptionPane.showMessageDialog(null, "Your grade is an F, since the average is below 60.");
					}
					System.exit(0);

		}


}





