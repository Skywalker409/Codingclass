
		import java.util.Scanner;
		public class EmailAdress {

			public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Hello Fellow shark!");
			System.out.println("I am here to assist you in ");
			System.out.println("making you new email.");
			System.out.println("What is your first name?");
			String Name = input.nextLine();
			System.out.println("what is your middle name? (Put a \"- \"if you dont have one)");
			String Middle= input.nextLine();
			System.out.println("what is your Last name?");
			String LastName = input.nextLine();
			System.out.println("birthday? (MMDDYYYY)");
			int Age = input.nextInt();
			System.out.println("Here is your email: ");
			String abb1 = (LastName);
			String abb15 = Middle.substring(0, 1);
			String abb2 = Name.substring(0, 1);
			String abb25 = abb2.toUpperCase();
			
			
			System.out.println(abb1 + abb15+ abb25 + "@sharkmail.com");
			System.out.println("Temp Password:   " +Age);
			System.out.println("***This temporary password is very insecure. Please change it ");
			System.out.println("immediately! ***");
			}

		

	}


