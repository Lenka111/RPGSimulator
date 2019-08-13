

import java.util.Random;

/**
 *
 * @author Elena Voinu
 */
public class RPGSimulator
{
   public static void main(String[] args) {
        // TODO code application logic here
        Random rand1 = new Random();
		Random rand2 = new Random();
								
		String mission1 = "Capture the Castle";
		String mission2 = "Enter the Hidden City";
		String mission3 = "Rescue the Princess";
		String mission4 = "Traverse the Forest";
		String mission5 = "Locate the Tunnel Entrance";
		String mission6 = "Fight the monster";
                String mission7 = "Exit the castle";
		String player1 = "", player2 = "", player3 = "";
							
		char letter = '\0', role = '\0';
		
		// initial health and treasures for the two players
		int number = 0, mission = 0, health1 = 100, health2 = 100, health3 = 100;
		int treasure1 = 100, treasure2 = 100, encounter = 0;
                char cloakingMode='\0'; // activate the cloak
                // define your role
		role = (char)(rand1.nextInt(26) + 'a');
		if(role >= 'a' && role <= 'm') 
		{
			player1 = "protagonist";
			player2 = "opponent";
                        player3 = "Helper";
		}
		else 
		{
			player1 = "opponent";
			player2 = "protagonist";
                        player3 = "Helper";
		}
		System.out.println("you are the " + player1);
		// define your mission
		number = rand2.nextInt(5) + 1;
		System.out.print("your mission is: ");
		switch(number)
		{
		  case 1: System.out.println(mission1); mission = 1; break;
		  case 2: System.out.println(mission2); mission = 2; break;
		  case 3: System.out.println(mission3); mission = 3; break;
		  case 4: System.out.println(mission4); mission = 4; break;
		  case 5: System.out.println(mission5); mission = 5; break;
                  case 6: System.out.println(mission6); mission = 6; break;
		}
		System.out.println("");
		
		// let the game simulation commence (limit the # of encounters)
		for (encounter = 1; encounter <= 20; encounter++)
		{
			letter = (char)(rand1.nextInt(5) + 'a');
			number = rand2.nextInt(10) + 1;
			// randomly encounter the enemy
			if(letter == 'a' || letter == 'b')
			//if(mission == 1 || mission == 2 || mission == 3)
			{
			  health1 -= 10;
			  health2 += 15;
			  treasure1 += 10;
			  treasure2 -= 10;
			  //Thread.sleep(5000);
			  System.out.print("battle: " + encounter);
			  System.out.println("\t" + "health" + "\t" + "treasure");
			  System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
			  System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
			  System.out.println("");
			  //encounter++;
			}	
                        else if(letter == 'c' || letter == 'd')
		{
		  health1 += 20;
		  health2 -= 30;
                  health3 += 25;
		  treasure1 += 40;
		  treasure2 -= 20;
		  //Thread.sleep(500);
		  System.out.print("battle: " + encounter);
		  System.out.println("\t" + "health" + "\t" + "treasure");
		  System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
		  System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
                  System.out.println(player3 + "\t" + health3 + "\t" + treasure3);
		  System.out.println("");
		  //break;
		}
                        else if(letter == 'e' || letter == 'f')
                        {
                  health1 += 20;
		  health2 -= 25;
		  treasure1 += 35;
		  treasure2 -= 15;
                  //Thread.sleep(500);
		  System.out.print("battle: " + encounter);
		  System.out.println("\t" + "health" + "\t" + "treasure");
		  System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
		  System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
		  System.out.println("");
		  //break;
                            
                        }
		else
		{
		  health1 += 30;
		  health2 -= 20;
		  treasure1 -= 30;
		  treasure2 += 20;
		  //Thread.sleep(500);
		  System.out.print("battle: " + encounter);
		  System.out.println("\t" + "health" + "\t" + "treasure");
		  System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
		  System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
		  System.out.println("");
		  //break;
		 }
		 health1 -= 5;
		 health2 -= 5;
		 treasure1 -= 5;
		 treasure2 -= 5;
                 
		 if (health1 <= 0 || health2 <= 0 || treasure1 <= 0 || treasure2 <= 0)
		 {
		  //System.out.print("encounter: " + encounter + " action status: ");
		  break;
		 }
		}
		System.out.println("simulation has ended\n");
		System.out.println("results:\n");
		System.out.println("\t\t" + "health" + "\t" + "treasure");
		System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
		System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
	}
}



        
    
   

