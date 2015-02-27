import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

class Program {
	public static List<Integer> primes;

	public static void main(String[] args) {
		primes = new LinkedList<Integer>();
		Queue<Integer> queue = new LinkedList<Integer>();	
		primes.add(2);
		for(int i=3; i<100; i+=2) {
			if(isPrime(i)) {		
				primes.add(i);
			}
		}
		System.out.println("There are " + primes.size() + " primes < 100");
	}

	public static boolean isPrime(int integer) {
		for(Integer prime : primes) {
			if(integer%prime == 0)
				return false;
		}
		return true;
	}
}