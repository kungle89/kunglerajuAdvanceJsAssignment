package com.greatlearing.Driver;
import java.util.Scanner;

public class PayMoney {

		public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of transaction array");
        int trSize = sc.nextInt();

        int[] transactions = new int[trSize];

        System.out.println("Enter the values of array");
        for (int i = 0; i < transactions.length; i++) {
            transactions[i] = sc.nextInt();
        }

        System.out.println("Enter the total no of targets that needs to be achieved");
        int numTargets = sc.nextInt();

        for (int i = 0; i < numTargets; i++) {
            System.out.println("Enter the value of target");
            int targetValue = sc.nextInt();

            int transactionSum = 0;
            int targetAchievedIndex = -1;
            for (int j = 0; j < transactions.length; j++) {
                transactionSum += transactions[j];
                if (transactionSum >= targetValue) {
                    targetAchievedIndex = j + 1;
                    break;
                }
            }

            if (targetAchievedIndex != -1) {
                System.out.println("Target achieved after " + targetAchievedIndex + " transactions");
            } else {
                System.out.println("Given target is not achieved");
            }
            System.out.println();
        }
	}
}
    
