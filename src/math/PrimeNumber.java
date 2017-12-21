package math;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		int limit = 1000000;

		System.out.println("Prime numbers between 2 and " + limit);

		//loop through the numbers one by 2
		for(int i=2; i < 100; i++){

			boolean isPrime = true;

			//check to see if the number is prime
			for(int j=2; j < i ; j++){

				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			// print the number
			if(isPrime)

				System.out.println(i + " ");

		}

	}

}
