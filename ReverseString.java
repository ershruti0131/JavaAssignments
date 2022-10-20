import java.util.Scanner;

public class ReverseString {

	public void reverseCharArray(String string) {
		System.out
				.println("Reverse string by convert in to char arrat and print reverse String using for loop .....\n");
		String str = string;
		char[] chararr = str.toCharArray();
		for (int i = chararr.length - 1; i >= 0; i--) {
			System.out.print(chararr[i]);

		}

	}

	public void reverseStringBySplit(String string) {
		System.out.println("Reverse string using split method ....\n");
		String str = string;
		String[] token = str.split("");
		for (int i = token.length - 1; i >= 0; i--) {
			System.out.print(token[i]);
		}
	}

	public String reverseUsingScanner()

	{
		System.out.println("enter string ");
		String original, reverse = "";
		try (Scanner sc = new Scanner(System.in)) {
			original = sc.nextLine();
		}
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}

		return reverse;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HunnyBunny";
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		str2 = str2.reverse();// using String builder to reverse the string
		// System.out.println("Reverse String:" + str2);
		ReverseString obj = new ReverseString();
		// obj.reverseCharArray("Hunny bunny");
		// obj.reverseStringBySplit("job seekers");

		String reverse = obj.reverseUsingScanner();
		System.out.println(reverse);

	}

}
