package AMAR;

import java.util.Scanner;
import ROHIT.Area;

public class AreaOFARectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length = ");
		int length = sc.nextInt();
		System.out.println("enter length = ");
		int bredth = sc.nextInt();
		Area a = new Area();
		a.calculateArea(length, bredth);
		
		

	}

}


package ROHIT;

public class Area {

	public void calculateArea(int length , int  bredth) {
		int area = length * bredth ;
		System.out.println("Area of Rectangle is = " + area);
	}

	

}
