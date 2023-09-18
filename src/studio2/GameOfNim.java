package studio2;

import java.util.Scanner;

public class GameOfNim {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("How many sticks are there initially?");
		int sticks = Scan.nextInt();
		int rounds = 0;
	
		System.out.println("This is round 0 and there are " + sticks + " left");
		
		while (sticks > 1)
		{			
			System.out.println("How many sticks does human want to take?");
			int humanTake = Scan.nextInt();
			while (humanTake != 1 && humanTake !=2)
			{ 
				System.out.println("STOP CHEATING!!!!!!!!!!!!!");
				System.out.println("How many sticks does human want to take?");
				humanTake = Scan.nextInt();
			}
		
			sticks = sticks - humanTake;
			
			rounds ++;
			System.out.println("Round: " + rounds + ": human takes " + humanTake + " so " + sticks + " remain1.");
			
			//computer's turn
			double compProbability = Math.random();
			
			if (sticks > 2) ///act like normal
			{
				if (compProbability < 0.5)
				{
				int computerTakes1 = 1; 
				sticks = sticks - computerTakes1;	
				rounds ++;
				System.out.println("Round: " + rounds + ": computer takes " + computerTakes1 + " so " + sticks + " remain2.");
				}
					
				else
				{ 
				int computerTakes2 = 2;
				sticks = sticks - computerTakes2;
				rounds ++;
				System.out.println("Round " + rounds + ": computer takes " + computerTakes2 + " so " + sticks + " remain3.");
				}
			}
			else if (sticks == 0)
			{
				System.out.println("YOU WON COMPUTER LOST1");
				sticks = 0;
			}
			else 
			{
				rounds ++;
				sticks = 0;
				System.out.println("Round " + rounds + ": computer takes 1 " + "so 0 sticks remain4.");
				System.out.println("YOU LOST COMPUTER WON2");
			}
		}

		if (sticks == 1)
		{
			System.out.println("How many sticks does human want to take?5");
			int humanTake = Scan.nextInt();
			while (humanTake != 1 )
			{ 
				System.out.println("This is not possible");
				System.out.println("How many sticks does human want to take?");
				humanTake = Scan.nextInt();
			}
			rounds ++;
			sticks = 0;
			System.out.println("Round " + rounds + ": human takes 1 so 0 sticks remain5.");
			System.out.println("YOU WON COMPUTER LOST");
				
				
		}
	}
}







