import java.util.Scanner;

public class CheckPrimeOrNot {

	public boolean checkPrime(Integer num) {
		int temp;
		boolean isPrime = true;

		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		Integer num = sc.nextInt();

		CheckPrimeOrNot obj = new CheckPrimeOrNot();
		Boolean isPrime = obj.checkPrime(num);
		System.out.println("Entered Number is Prime:" + isPrime);

	}

}
