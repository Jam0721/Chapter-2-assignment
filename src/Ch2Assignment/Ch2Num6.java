package Ch2Assignment;

import java.util.Scanner;

public class Ch2Num6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the Height of your rectangle");
		double Height = input.nextDouble();
		System.out.println("What is the Width of your rectangle");
		double Width = input.nextDouble();
		double Area = Height*Width;
		double Perimeter = 2*(Width+Height);
		System.out.println(" This is the area of your Rectangle " +Area);
		System.out.println(" This is the Perimeter of your Rectangle " +Perimeter);


	}

}
