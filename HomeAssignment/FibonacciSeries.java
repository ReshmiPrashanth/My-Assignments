package week1.HomeAssignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8;
		int a=0;
		int b=1;
		System.out.println("Fibonacci Series: " + range+'\n'+a);
		for (int i = 1; i <= range; i++) {
            System.out.print("," + b); 
            int next = a + b; 
            a = b;
            b = next; 
			
	}

}
}