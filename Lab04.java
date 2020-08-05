import java.util.Scanner;
public class Lab04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int floors;
		System.out.println("Enter the number of floors:");
		int pfloors = sc.nextInt();
		while (pfloors < 1) {
			System.out.println("Invalid entry, try again!");
			pfloors = sc.nextInt();
		}
		floors = pfloors;
		int totalRoom=0;
		int occupRoom=0;
		
		for (int f = 1; f < floors+1; f++) {
			System.out.println("How many rooms are on floor " + f + "?");
			int prooms = sc.nextInt();
			while (prooms<10) {
				System.out.println("Invalid entry, try again!");
				prooms = sc.nextInt();
			}
			System.out.println("How many of these are occupied?");
			int proomsOcc = sc.nextInt();
			while ((proomsOcc > prooms) || (proomsOcc<0)) {
				System.out.println("Invalid entry, try again!");
				proomsOcc = sc.nextInt();
			}
			totalRoom += prooms;
			occupRoom += proomsOcc;	
		}
		
		double occRate = (double)(occupRoom)/totalRoom;
		
		System.out.println("This hotel has " + totalRoom + " rooms, and " + occupRoom + " are occupied.");
		System.out.println("The occupancy rate is " + (int)(occRate*100) + "%");
	}

}
