package hurst_p3;

import java.util.Scanner;

public class hurst_p3 {
	
	public static void main(String[] args) {
		
		Scanner in = new java.util.Scanner(System.in);
		
		String[] topics = { 
							"Animal Testing",
							"Dog Breeding",
							"Ivory Trade",
							"Poaching",
							"Whaling" 
							};
		int responses[][] = new int[5][10];
		int numRatings[][] = new int [5][10];
		int pointTotals[][] = new int [5][10];
		
		// Ask the user to rate each issue.
		System.out.println("Rate the following five topics from 1 (least important) to 10 (most important).");
		System.out.println("(Enter 0 to continue to the next issue)\n");
		
		for(int i=0; i < topics.length; i++) {
			System.out.println(topics[i] + ":");

			for (int j=0; j < responses[i].length; j++) {
				
				responses[i][j] = in.nextInt();
				
				if (responses[i][j] == 0) {
					break;
				}
				else if (responses[i][j] >= 11 || responses[i][j] <= -1) {
					responses[i][j] = in.nextInt();
				}
				
				// Calculate the number of time the issue received a certain number score
				if (responses[i][j] == 1) {
					numRatings[i][0] += 1;
				}
				else if (responses[i][j] == 2) {
					numRatings[i][1] += 1;
				}
				else if (responses[i][j] == 3) {
					numRatings[i][2] += 1;
				}
				else if (responses[i][j] == 4) {
					numRatings[i][3] += 1;
				}
				else if (responses[i][j] == 5) {
					numRatings[i][4] += 1;
				}
				else if (responses[i][j] == 6) {
					numRatings[i][5] += 1;
				}
				else if (responses[i][j] == 7) {
					numRatings[i][6] += 1;
				}
				else if (responses[i][j] == 8) {
					numRatings[i][7] += 1;
				}
				else if (responses[i][j] == 9) {
					numRatings[i][8] += 1;
				}
				else if (responses[i][j] == 10) {
					numRatings[i][9] += 1;
				}		
				
				pointTotals[i][0] += responses[i][j];
			}
			
		}
		
		// Display a summary of the results
		System.out.println("\n\nRESULTS SUMMARY:\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\tAverage Rating\n");
		
		int sum = 0;
		int avg = 0;
		int i = 0, j = 0;
		
		for (i=0; i < topics.length; i++) {
			System.out.print(topics[i] + "\t");
			
			if(i == 4) {
				System.out.print("\t");
			}
			
			for (j=0; j < responses[i].length; j++) {
				
				System.out.print("\t" + numRatings[i][j]);
				sum += numRatings[i][j];
			}
			
			avg = sum / j;
			System.out.print("\t" + avg);
			System.out.println("");
			
		}
		
		// Display issue with the highest total and the point total.
		int max = pointTotals[0][0];
		String maxTopic = topics[0];
		
		for (i=0; i < pointTotals.length; i++) {
			for (j=0; j < pointTotals[i].length; j++) {			

				if (pointTotals[i][j] > max) {
					max = pointTotals[i][j];
					maxTopic = topics[i];
				}
			}
		}
		
		System.out.println("\nHighest Rated Issue: " + maxTopic + "\tTotal Points: " + max);
	
		// Display issue with the lowest total and the point total.
		int min = pointTotals[0][0];
		String minTopic = topics[0];
		
		for (i=0; i < pointTotals.length; i++) {
			for (j=0; j < pointTotals[i].length; j++) {			

				if (pointTotals[i][j] < min) {
					min = pointTotals[i][j];
					minTopic = topics[i];
				}
			}
		}
		
		System.out.println("Lowest Rated Issue: " + minTopic + "\tTotal Points: " + min);
		
	}
	
}