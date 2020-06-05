package hurst_p1;

import java.util.Scanner;

public class hurst_p1 {
	
	public static void main(String[] args) {
		
		Scanner in = new java.util.Scanner(System.in);
		int int1, int2, int3, int4;
		int int1Div, int2Div, int3Div, int4Div;
		int tmp = 0;
		
		/* read a four-digit integer entered by the user */
		System.out.println("Enter a four-digit integer");
		System.out.print("Enter the first integer: ");
		int1 = in.nextInt();
		
		System.out.print("Enter the second integer: ");
		int2 = in.nextInt();
		
		System.out.print("Enter the third integer: ");
		int3 = in.nextInt();
		
		System.out.print("Enter the fourth integer: ");
		int4 = in.nextInt();
		
		System.out.println("Original integer: " + int1 + " " + int2 + " " + int3 + " " + int4);
		
		/* Replace each digit with the result of adding 7 to the digit and getting the remainder after dividing the new value by 10. */
		
		int1Div = (int1 + 7) / 10;
		int2Div = (int2 + 7) / 10;
		int3Div = (int3 + 7) / 10;
		int4Div = (int4 + 7) / 10;
		
		int1 = (int1 + 7) % 10;
		int2 = (int2 + 7) % 10;
		int3 = (int3 + 7) % 10;
		int4 = (int4 + 7) % 10;
		
		/* swap the first digit with the third */
		tmp = int1;
		int1 = int3;
		int3 = tmp;
				
		/* swap the second digit with the fourth */
		tmp = int2;
		int2 = int4;
		int4 = tmp;
		
		/* print the encrypted integer */
		System.out.println("Encrypted integer: " + int1 + " " + int2 + " " + int3 + " " + int4);
		
		
		/* Decrypt it to form the original number. */
		tmp = int1;
		int1 = int3;
		int3 = tmp;
		
		tmp = int2;
		int2 = int4;
		int4 = tmp;
		
		int1 = (10 * int1Div) + int1 - 7;
		int2 = (10 * int2Div) + int2 - 7;
		int3 = (10 * int3Div) + int3 - 7;
		int4 = (10 * int4Div) + int4 - 7;		
		System.out.println("Decrypted integer: " + int1 + " " + int2 + " " + int3 + " " + int4);
	}
	
}

