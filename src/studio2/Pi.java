package studio2;

import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
			int numdarts = in.nextInt();
     double x = Math.random();
     double y = Math.random();
     int hit = 0;
     for(int i=0; i <= numdarts; i++)
     {
    	 if(Math.sqrt(x*x + y*y) <= 1);
	     {
	    	 hit++;
	     }
     }
	     

	}

}
