import java.util.Scanner;
public class Lab01 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter your tab total.");
	double tabTotal = sc.nextDouble();
	
	System.out.println("Please enter the number of people splitting your tab.");
	int people = sc.nextInt();
	
	final double TAX = 0.06;
	double billWith15 = (tabTotal*TAX + tabTotal) + 0.15*(tabTotal + tabTotal*TAX);
	double billWith20 = (tabTotal*TAX + tabTotal) + 0.2*(tabTotal + tabTotal*TAX);
	
	double split15 = billWith15/people;
	double split20 = billWith20/people;
	
	System.out.println("Your bill's total, with a 15% tip included, will come out to $" + billWith15);
	System.out.println("Split " + people + " ways, each person should pay: $" + billWith15/people);
	
	System.out.println("Your bill's total with a 20% tip included will come out to $" + billWith20);
	System.out.println("Split " + people + " ways, each person should pay: $" + billWith20/people);
	

	}

}
