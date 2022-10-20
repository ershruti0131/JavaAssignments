import java.util.Scanner;

public class PalidromeCheck {

	public void CheckPalideome(String string) {
		String Original, Reverse = "";
		Original = string;
		for (int i = Original.length() - 1; i >= 0; i--) {
			Reverse = Reverse + Original.charAt(i);
		}
		if (Reverse.equals(Original))
			System.out.println("Entered number or string is Palidrome");
		else
			System.out.println("Entered number or string is Not Palidrome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number or String to check Palidrome: ");
		String str = sc.next();
		PalidromeCheck obj = new PalidromeCheck();
		obj.CheckPalideome(str);
	}

}
