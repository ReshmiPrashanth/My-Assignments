package week1.HomeAssignment;

public class IsPrime {

	public static void main(String[] args) {
		int number = 13; 
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false; 
                break; 
            }
        }
        if (isPrime && number > 1) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is Not Prime");
        }
    }

	}

