import java.util.Scanner;
import java.util.Random; 


public class PromTickets {

	
		 public String ticket() {
		int	cost = 0;
		Scanner scan =  new Scanner(System.in);
		System.out.println("Welcome to the Colgan Prom Ticket Booth.");
	System.out.println("What is your name?");
	String gamerans = scan.next();
	System.out.println(gamerans);
	System.out.println("What is your classification?");
	System.out.println("1 - Senior, 2 - Junior, 3 - Sophmore, 4 - Freshman");
	int gamerage = scan.nextInt();
	System.out.println("what Kind of ticket are you purchasing?");
	System.out.println("1 - Solo, 2 - Couple,  3 - Group");
	int gamertick = scan.nextInt();
	String ticktype = "";
	String ticknum = "";
	 if(gamerage == 1) {
		 cost += 10;
		  ticktype = "Senior ";
	 }
		if  (gamerage == 2) {
			cost += 20;
		 ticktype = "Junior ";
		 }
		if (gamerage == 3) {
			cost +=30;
			 ticktype = "Sophmore ";
		}
		if (gamerage == 4) {
			cost += 40;
			 ticktype = "Freshman ";
		}
		if (gamertick == 1) {
			cost += 10;
			ticknum = "loser";
		}
		if (gamertick == 2) {
			cost += 20;
			ticknum = "Couple";
		}
		if (gamertick == 3) {
			cost += 30;
			ticknum = "Group";
		}
					
			System.out.println("Thank you "+ gamerans+". You purchased a "+ ticktype+ ticknum +".");
			System.out.println("The cost of your Ticket is :" +cost);
			 Random generator = new Random();
			
		return "";	
		}
		
			public static String getpass() {
				String password = "";
					int rand = 0;
					//creates password
					String charecters = "ABCDEFGHIJKLMNOPQRSTUWXYZabcdefghijklmnopqrstuvwxyz0123456789";
					//genrate the first charectar of randomized password
					int counter = 0;
					while(counter < 8) {
						
					
					 rand = (int) (Math.random()*charecters.length());
					password += charecters.substring(rand, rand +1);
					counter++;
					
					
				}
					return password;
		
			
			
		}

}
	
		

	
