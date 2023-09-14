package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("The amount of money that you start with: ");
		double amount = in.nextDouble();
		System.out.print("The win probability(single play): ");
		double winChance = in.nextDouble();
		System.out.print("The win limit: ");
		double winLimit = in.nextDouble();
		System.out.print("Number of Simulations:");
		int totalSimulations = in.nextInt();

		int losses = 0;
		
		for(int i = 1; i <= totalSimulations; i++)
		{
			int counter = 0;
			double startAmount = amount;
			while(startAmount > 0 && startAmount < winLimit)
			{
				counter++;
				double randNum = Math.random();

				if(randNum<=winChance)
				{	
					startAmount++;
				}
				else
				{
					startAmount--;

				}
				if(startAmount == 0)
				{
					System.out.println("simulation " + i + ": " + counter + " LOSE");
					losses++;

				}
				if(startAmount == winLimit)
				{
					System.out.println("simulation " + i + ": " + counter + " WIN");
				}
				
				
			}
			
			
			
		}
		System.out.println("Losses: "+ losses + " Simulations: "+ totalSimulations);
		double ruinRate = (double)losses/totalSimulations;
		double expectedRuinRate;
		double a = (1-winChance)/winChance;
		if(winChance == .5)
		{
			expectedRuinRate = 1-(amount/winLimit);
		}
		else
		{
			expectedRuinRate = (Math.pow(a, amount)-Math.pow(a, winLimit))/(1-Math.pow(a, winLimit));
		}
		System.out.println("Ruin Rate from Simulation: " + ruinRate + " Expected Ruin Rate: " + expectedRuinRate);
		




	}

}
