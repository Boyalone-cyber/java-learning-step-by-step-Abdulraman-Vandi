import java.util.Scanner;
public class code{
	public static void main(String[] args) {
		Scanner area = new Scanner(System.in);
		System.out.println("Hello Daddy");
		System.out.println("What shpae are you working today?");
		area.next();
		System.out.println("What is the length of tile?");
		double length1 = area.nextDouble();
		System.out.println("What is the Width of tile?");
		double width1 = area.nextDouble();
		System.out.println("What is the length of the room?");
		double length2 = area.nextDouble();
		System.out.println("What is the Width of the room?");
		double width2 = area.nextDouble();
		// the calculation stage add the magnitudes of the tile, and also the magnitudes of the room 
				// tiles calculation and room areas determination process
				double Area1 = length1 * width1; // tiles calculation
				double Area2 = length2 * width2; // room calculation
				// total tiles needed
				double Total= Area2 / Area1;
				String aft = "tiles are needed for this room";
				System.out.println(Total+""+aft);
	}
}		
		
		
		
		