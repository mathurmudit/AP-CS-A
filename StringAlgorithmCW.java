import java.util.Scanner;
public class StringAlgorithmCW
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word to see if it is abecedarian (if the letters are in alphabetical order)!");
		String s = sc.nextLine();
		
		if(isAbecedarian(s))
		{
			System.out.println("The word " + s + " is abecederian!");
		}
		else 
		{
			System.out.println("The word " + s + " is not abecedarian");
		}
	}
	
	public static boolean isAbecedarian(String s)
	{
		boolean solution = true;
		
		for(int i = 0; i < s.length()-2; i++)
		{
			if(s.charAt(i+1) < s.charAt(i))
			{
				solution = false;
			}
		}
		return solution;
	}
}