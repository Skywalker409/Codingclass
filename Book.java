import java.util.Scanner;
public class Book {
	Scanner scan = new Scanner(System.in);
	int ans = 0;
	int numbooks;
		public String bookid(){
			while(ans ==0) {	
				System.out.println("what is the name of the book?");
		String Name = scan.next();
		System.out.println("what is the authors name?");
		
		String author = scan.next();
		System.out.println("whats the genre?");
		String genre = scan.next();
		System.out.println("How many pages are there?");
		int pages = scan.nextInt();
		 numbooks += 1;
				System.out.println("would you like to add another book?(type 1 if so type 2 to stop)");
				int asnwer = scan.nextInt();
				if(asnwer == 1) {
					ans +=0;
					
				}else if (asnwer == 2){
					ans+=1;
					System.out.println("there are "+ numbooks + " books stored in the system");
				}
				
		}
	return ("");
		
		}
	
	}
		
		
		
		
	
	
	
	
	
	
	

