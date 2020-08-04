import java.util.Scanner;
public class Lab03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount of US dollars to be exchanged.");
		double amount = sc.nextDouble();
		System.out.println(amount+" US dollars exchanges to:");
		
		System.out.println("\n" +getEuro(amount)+ " European Euros");
		System.out.println(getPeso(amount)+ " Mexican Pesos");
		System.out.println(getYen(amount)+ " Japanese Yen");
		System.out.println(getCan(amount)+ " Canadian Dollars");
		System.out.println("\nProcess completed.");
	}
	public static double getEuro(double amount) {
	final double EURO_EXCHANGE = 0.817;
	double amountEuro = amount*EURO_EXCHANGE;
	return amountEuro;
	}
	
	public static double getPeso(double amount) {
	final double MPESO_EXCHANGE = 17.0119;
	double amountPeso = amount*MPESO_EXCHANGE;
	return amountPeso;
	}
	
	public static double getYen(double amount) {
	final double YEN_EXCHANGE = 96.6095;
	double amountYen = amount*YEN_EXCHANGE;
	return amountYen;
	}
	
	public static double getCan(double amount) {
	final double CAN_EXCHANGE = 1.167;
	double amountCan = amount*CAN_EXCHANGE;
	return amountCan;
	}
}
