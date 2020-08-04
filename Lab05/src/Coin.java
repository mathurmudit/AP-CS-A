
public class Coin {
	private int value;
	private String sideUp;
	
	public Coin (int newValue) {
		if (newValue == 25)
			value = 25;
		else if (newValue == 10)
			value = 10;
		else if (newValue == 5)
			value = 5;
		else value = 1;
	}
	
	public void toss() {
		int x = (int) (Math.random()*2);
		if (x == 0)
			sideUp = "HEADS";
		else
			sideUp = "TAILS";
	}
	
	public String getSideUp() {
		return sideUp;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isUp() {
		if (sideUp.equals("HEADS"))
			return true;
		else return false;
	}
	
	
	
	
	
	
	
	
	
	
}
