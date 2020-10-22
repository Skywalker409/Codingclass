import java.lang.Math;
public class Fraction2 {
// we tried to do the fraction project with another way but that was poo so i made a whole new one and called it Fraction2 pls 
	//don't take points off
	//Partner = paul.epic


		
		private int num = 1;
		private int dem = 2;
		
		public static double posdiff(double a, double b) {
			return ((a/b)-(a/b));
			
		}
		
		 public static double add(double a, double b) {
				return ((a + a)/ b);
		 
		 }
		 public static double multi(double a, double b) {
			 b = b*b;
			 
				return (b);
		 }
		 public static double div(double a, double b) {
				return ((a/b)/ (a/b));
		 }
		 public  double change() {
			
			Fraction2 diff = new Fraction2();
			double ansdiff = diff.posdiff(num, dem);
			System.out.println(ansdiff);
			return ansdiff;
		 }
		 public   String ans(double num2, double dem1)
		 {
				
				Fraction2 poo = new Fraction2();
				double  sub = poo.posdiff(num, dem);
				System.out.println( "Subtraction: " + (int)sub + "/" + (int)sub);
				double add = poo.add(num, dem);
				System.out.println("Addition:"+(int)add+"/1");
				double mult = poo.multi(num, dem);
				System.out.println("Multiplication:" + num + "/"+(int)mult);
				double div = poo.div(num, dem);
				System.out.println("Divition:"+(int)div + "/1");
				return " ";
			 
			 
		 }
		}
		

