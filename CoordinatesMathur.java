import java.util.Scanner;
public class CoordinatesMathur {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); //creates scanner 
	double x1; //creates variable for first x coordinate
	double y1; //creates variable for first y coordinate
	double x2; //creates variable for second x coordinate
	double y2; //creates variable for second y coordinate
	
	System.out.println("Enter the x-value of your first point."); //prompts user for x1
	x1 = sc.nextDouble();
	System.out.println("Enter the y-value of your first point."); //prompts user for y1
	y1 = sc.nextDouble();
	
	System.out.println("Enter the x-value for your second point."); //prompts user for x2
	x2 = sc.nextDouble();
	System.out.println("Enter the y-value for your second point."); //prompts user for y2
	y2 = sc.nextDouble();
	getMidpoint(x1,y1,x2,y2);
	getEquation(x1,y1,x2,y2);
	}
	
	
	public static void getMidpoint(double x1, double y1, double x2, double y2) {
		double midX = (x1+x2)/2;
		double midY = (y1+y2)/2;
		System.out.println("The midpoint of the coordinates is: ("+midX+","+midY+")");
	}
	
	public static void getEquation(double x1, double y1, double x2, double y2) {
		double m = (y2-y1)/(x2-x1);
		System.out.println("The equation of the line between the two points is: y-"+y1+" = "+m+"(x-"+x1+")");
		
	}
	
}


