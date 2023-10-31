package studio2;

import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many darts?");
		int numdarts = in.nextInt();
		int hit = 0;
		for(int i=0; i <= numdarts; i++)
		{
			double x = Math.random();
			double y = Math.random();
			double num = Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)));
			if(num <= 1.0)
			{
				hit++;
			}
		}
		double pi = hit*4.0;
		System.out.println(pi);
	}

}
