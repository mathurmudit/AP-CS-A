import java.util.Scanner;
public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Coin Quarter = new Coin(25);
		Coin Dime = new Coin(10);
		Coin Nickel = new Coin(5);
		String go = "Y";

		int round = 1;
		int balance = 0;
		
		while (go.equals("Y")&&(balance < 100)) {
			System.out.println("Round " + round);
			Quarter.toss();
			Dime.toss();
			Nickel.toss();
			System.out.println("Quarter is " + Quarter.getSideUp());
			System.out.println("Dime is " + Dime.getSideUp());
			System.out.println("Nickel is " + Nickel.getSideUp());
			if(Quarter.isUp())
				balance += Quarter.getValue();
			if(Dime.isUp())
				balance += Dime.getValue();
			if(Nickel.isUp())
				balance += Nickel.getValue();
			System.out.println("Your total is now " + balance);
			round ++;
			if(balance < 100) {
			System.out.println("Another round? (Y or N)");
			go = sc.nextLine();
			}
		}
		if (go.equals("N"))
			System.out.println("Peace! Play again some time!");
		if (balance == 100)
			System.out.println("Congratulations, you win!");
		else if (balance > 100)
			System.out.println("Sorry, you've lost!");
	}
}
