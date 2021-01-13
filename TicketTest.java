import java.util.Scanner;
public class TicketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		PromTickets Cost = new PromTickets();
String cost =Cost.ticket();
String password = Cost.getpass();
System.out.println("");
System.out.println("Your confermation key is : "+password);
System.out.println("type 1 to continue. Type anything else to exit");
int gamer = Scan.nextInt();
	if(gamer == 1) {
		 cost =Cost.ticket();
		 password = Cost.getpass();
		System.out.println("");
		System.out.println("Your confermation key is : "+password);
		System.out.println("type 1 to continue. Type anything else to exit");
		 gamer = Scan.nextInt();
		
	}
	}

}
