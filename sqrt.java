	import java.text.DecimalFormat;
	import java.util.Scanner;

/***
 * Error Term computation for Square, Square Root & Cube
 * 
 * @author Puneet
 * 
 */
	
public class Sqrt {

		public static boolean operator(double n) {
			if (n==0.5) {
				boolean answer = true;
				return answer;
			}
			if (n==2) {
				boolean answer = true;
				return answer;
			}
			if (n==3) {
				boolean answer = true;
				return answer;
			}
			else {
				boolean answer = false;
				return answer;
			}
			

	}
		public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter the Value");
			double value1 = keyboard.nextDouble();
			
			System.out.println("Enter the Error Term");
			double errorTerm1 = keyboard.nextDouble();
				
			System.out.println("Enter 0.5 for Squareroot, 2 for Square and 3 for Cube");

			double n = keyboard.nextDouble();
			String result =computation(n, value1, errorTerm1);	
					System.out.println(result);
				
			keyboard.close();
			
		}

		public static String computation(double n, double value1, double errorTerm1) {
			if (operator(n)==true) {
				
			double errorFraction = errorTerm1 / value1;
			double p = Math.pow(value1, n);
			double powET = Math.abs(n * p * errorFraction);
			DecimalFormat q = new DecimalFormat("####.###");
			String errorTerm = q.format(powET);
			String measuredValue1 = q.format(p);
			String result = measuredValue1 +" \u00B1 " + errorTerm;
			return result;
			}
			else return "Please enter a valid number to choose the operator";
		}


}
