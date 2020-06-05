package hurst_p2;

import java.util.Scanner;

public class hurst_p2 {
	
	public static void main(String[] args) {
		
		Scanner in = new java.util.Scanner(System.in);
		double weight = 0;
		double height = 0;
		int unit;
		double BMI = 0;
		
		// Select which formula to use
		System.out.println("1. Standard");
		System.out.println("2. Metric");
		System.out.print("Choose formula: ");
		unit = in.nextInt();
		
		// Calculate and display the user’s body mass index. 
		if(unit == 1) {
			System.out.print("Enter weight (lb): ");
			weight = in.nextDouble();
			
			System.out.print("Enter height (in): ");
			height = in.nextDouble();
			
			BMI = (703 * weight) / Math.pow(height, 2);
			System.out.println("BMI: " + Math.ceil(BMI));
		}
		else {
			System.out.print("Enter weight (kg): ");
			weight = in.nextDouble();
			
			System.out.print("Enter height (cm): ");
			height = in.nextDouble();
			
			height /= 100;
			
			BMI = (weight) / Math.pow(height, 2);
			System.out.println("BMI: " + Math.ceil(BMI));
		}
		
		// Display the BMI categories and their values
		if (BMI < 18.5) {
			System.out.println("Underweight");
		}
		else if (BMI >= 18.5 && BMI <= 24.9) {
			System.out.println("Normal weight");
		}
		else if (BMI >= 25 && BMI <= 29.9) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obesity");
		}
		
	}
	
}

