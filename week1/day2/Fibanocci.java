package week1.day2;

public class Fibanocci {

	public static void main(String[] args) {
		int input = 8;
		int num1 = 0;
		int num2 = 1;
		for(int i=2; i<=input; i++) {
			System.out.print(num1 + " ");
			int num3 = num2 + num1;
			num1=num2;
			num2=num3;
		}

	}

}
