/*
 * author = amar gaonkar
 */

package AMAR;

	import java.util.Scanner;

	public class Laptop {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			childLaptop();

			
			
			
			
				
			}
		
		
	public static void childLaptop() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number between 1 to 4 :");
		int num = s.nextInt();
		int a ;
		int b;
		
		while(num != 4) {
		
		
		switch (num) {

		case 1 :System.out.println("enter two number to added ");
		a = s.nextInt();
		b= s.nextInt();
		int c = a+b;
		System.out.println("the result is "+c);
		break;
		
		case 2 :System.out.println("enter two number to be subtracted ");
		a = s.nextInt();
		b= s.nextInt();
		int d = a-b;
		System.out.println("the result is "+d);
		break;
		
		case 3 :System.out.println("enter two number to multiply ");
		a = s.nextInt();
		b= s.nextInt();
		int e = a*b;
		System.out.println("the result is "+e);
		break;
		
		
		
		default : System.out.println("Error");
		
		}
		System.out.println("Enter the number between 1 to 4 :");
		num = s.nextInt();
		
		}
		System.out.println("Quit");
	}




                  }
