package assignment;

public class IsPrime {

	public static void main(String[] args) {
		int num = 113;
		boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime==true) {
        	System.out.println("This is prime number");
        }else {
        	System.out.println("This is not a prime number");
        }

	}

}
