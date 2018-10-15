package Ch2Assignment;

import java.util.Scanner;

public class Ch2Num5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radius of the circle");
		double Pie = 3.14;
		double Radius = input.nextDouble();
		double Area = Pie*(Radius*Radius);
		double Perimeter = 2*Radius*Pie;
		System.out.println(" This is the area of your circle " +Area);
		System.out.println(" This is the Perimeter of your circle " +Perimeter);

	}

}
