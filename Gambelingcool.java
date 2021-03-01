import java.util.Scanner;
import java.util.Random; 
public class Gambelingcool {
private static int slot1;
private static int slot2;
private static int slot3;
private static int winnings;



public static String spin() {
	double rand1= Math.random()*9+1;
	double rand2= Math.random()*9+1;
	double rand3= Math.random()*9+1;
	slot1 = (int) rand1;
	slot2 = (int) rand2;
	slot3 = (int) rand3;
	
if(slot1==slot2 && slot1 ==slot3 && slot2 == slot3) {
	winnings+= 1000;
	
}else if (slot1 == slot2 || slot1 == slot3 || slot2 == slot3) {
	winnings+=25;
}else if(slot1!=slot2&&slot1!=slot3&&slot2!=slot3){
	winnings -= 15;
}
return ("you rolled " + slot1+slot2+slot3+"you are at:" +winnings);


}

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		// TODO Auto-generated method stub
int addiction = 0;

while( addiction == 0) {
	System.out.println("Your winnings are :" + winnings);
System.out.println("would you like to test your luck? Type 1 if so...");
System.out.println("but if you are a loser enter anything else");
	int ans = scan.nextInt();

if (ans==1) {

	System.out.println(spin());

}
else if (ans !=1) {
	addiction +=1;

}
}

	}

}
