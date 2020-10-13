import java.util.Scanner;

public class LabTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float length = 0;
		float width = 0;
		float area = 0;
		float perimeter = 0;

		Scanner scnr = new Scanner(System.in);

		System.out.print("Enter Length: ");
		length = scnr.nextFloat();

		System.out.print("Enter width: ");
		width = scnr.nextFloat();

		area = length * width;
		perimeter = 2 * (length + width);

		System.out.println("Area: " + area + " sq. units.");
		System.out.println("Perimeter: " + perimeter + " units.");

	}

}
