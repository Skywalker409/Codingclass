
public class NumberMethods {
	
	public static boolean isPrime(int n) {
		boolean prime = false;

	int isprime = 0;
		//n>=2
		//This method should set prime true if n is prime.
		//This method should set prime false if n is composite.
	
		
		for (int count = 2; count < n ; count++) {
			if(n % count == 0){
				isprime += count;
		
			
				
		}
	
			}
		if(isprime == 0) {
			prime = true;
			
		}
		else {
				prime = false;
			}
										
					
	return prime;
				}
		//This method should return isPrime;
	
		//your logic for checking for primeness goes here
		
	
	
	
	public static int divisorSum(int n) {
		int sum = 0;
		/*
		This method should return the sum of all of the divisors of n
		if divisorSum(8) is called, a value of 7 should be returned because
		the proper divisors of 8 are 1, 2, and 4.
		*/
		for (int num = 1; num < n; num++) {
			if (n % num == 0) {
				sum += num;
			}
			
		}
		return sum;
	}
	
	public static int isStrong(int n) {
		int  strong = 0;
		for (int count = 2; count < n ; count ++ ) {
		int summ =	divisorSum(n);
		boolean prime = isPrime(n);
		if(prime ==true ) {
			break;
		}
			if(n > summ && prime == false) {
				
				strong =1;								
			}
		 if(n < summ && prime == false) {
					strong = 2;
				}
			
		}
		return strong;
		// as you can see, i ran into a problem where all the prime numbers were also being printed because of the begining
		//declaration of strong = false. so i changed it to an int so i can have 0 which will never be used in the weak or strong prints and change 
		//strong to 1 and weak to 2. then in the print i changed them to booleans by saying of they were 1 or 2. then i was able to sort out all the primes from the composits.
		//yay!!!
		
	}
	
	public static void printDivisors(int n) {
		int sum = 0;
		String divisors ="The divisors are :";
		int divis = divisorSum(n);
		
		for (int num = 2; num < n; num++) {
			if (n % num == 0) {
				 divisors += num + " ";
				}
			}
			System.out.println(divisors);
				 /*
		 This method should print the divisors of n (not including n)
		 on a single line.
		 If printDivisors(12) is called, 1 2 3 4 should be printed.
		 */
		}
		
	
	
	public static void printPrimes(int n) {
		int count =0;
		boolean prim = isPrime(n);
		String ans = "Primes: ";
		for(count = 3; count < n; count++) {
			if (isPrime(count)==true) {
				ans += count + " ";
			
			}
		}
		
		System.out.print(ans);
		if(prim == true) {
			System.out.println("It is a prime");
		}
		else {
			System.out.println( "|" + n + " Is a composite");
		}
		
		/*
		boolean prim = isPrime(n);
		String ans = "";
		int prt = 0;
		int count;
		if ( prim = false) {
			System.out.println("yolo");
		}
		if ( prim = true) {
			
			for( count = 0; count < n; count++) {
					boolean	primcount = isPrime(count);
			
			if( primcount = false) {
				prt = count;
				ans = prt + "";
				System.out.println(ans);

				
			}
			}
		
		}
		*/
		//This method prints all prime numbers less than n on a single line
		//The call printPrimes(30) should print 2 3 5 7 11 13 17 19 23 29
		//This method MUST use the isPrime method
	}
	
	public static void printComposites(int n) {
		int count =0;
		boolean prim = isPrime(n);
		String ans = "Composties: ";
		for(count = 3; count < n; count++) {
			if (isPrime(count)==false) {
				ans += count + " ";
			
			}
		}
		
		System.out.print(ans);
		if(prim == true) {
			System.out.println("It is a prime");
		}
		else {
			System.out.println( "|" + n + " Is a composite");
		}
		//This method prints all composite numbers less than n on a single line
		//The call printComposites(30) should print 4 6 8 9 10 12 14 15 16 18 20 21 22 24 25 26 27 28 
		//This method MUST use the isPrime method
	}
	
	public static void printStrong(int n) {
		String ans = "The Strong Numbers are: ";
		for (int count = 2; count < n; count++) {
			int strong = isStrong(count);
			if (strong == 1) {
				ans += count + " ";
			
		}
			
		}
		System.out.println(ans);
		
		 {
			
		}
		
		//This method prints all the strong numbers less than n on a single line
		//The call printStrong(30) should print 4 8 9 10 14 15 16 21 22 35 26 27
		//This method MUST use the isStrong method
	}
	
	public static void printWeak(int n) {
		String ans = "The weak Numbers are: ";
		for (int count = 2; count < n; count++) {
			int strong = isStrong(count);
			if (strong == 2) {
				ans += count + " ";
			
		}
			
		}
		System.out.println(ans);
		
		 
			
		//This method prints all the weak numbers less than n on a single line
		//The call printWeak(30) should print 6 12 18 20 24 28
		//This method MUST use the isStrong method
	}
	
	public static void main(String[] args) {
	printDivisors(30);
		printComposites(30);
		printPrimes(30);
		printStrong(30);
		printWeak(30);
		
	}

}