package jana60;

import java.util.Scanner;

public class bonusFizzBuzz {

	public static void main(String[] args) {
		//
		
		Scanner scan = new Scanner (System.in);
		
		int numero = 0;
		boolean continuaLoop = true;
		
		while (continuaLoop) {
			
			System.out.println("Scegli un numero da 1 a 200:");
			numero = scan.nextInt();
			
			if (numero > 0 && numero <= 200) {
				continuaLoop = false;
				for (int i = 1; i <= numero; i++) {
					if ((i % 3) == 0 && (i % 5) == 0) {
						System.out.println("Fizz Buzz");
					} else if ((i % 5) == 0) {
						System.out.println("Buzz");
					} else if ((i % 3) == 0) {
						System.out.println("Fizz");
					} else {
						System.out.println(i);
					}
				} 
			} else {
				System.out.println("Numero non valido");
			}
		}

		
		scan.close();
	}

}
