		import java.util.Scanner;
	
public class Lightsabertests {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("what color do you want it to be?");
		String color = input.next(); 
		System.out.println("How many blades does it have?");
		int bladenum = input.nextInt();
		System.out.println(" Are you force sensitive:  posotive or negative?");
		String fs = input.next();
	
		
		lightsaberCore blueprt = new lightsaberCore(bladenum, color, fs);
		blueprt.holocron();
		System.out.println("Welcome to Starwars!");
	}
	
}

