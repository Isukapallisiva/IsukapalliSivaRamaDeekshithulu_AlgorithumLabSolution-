/**
 * 
 */
package com.GreatLearning.lab2.question1;

import java.util.Scanner;

/**
 * @author siva
 *
 */
public class Transaction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the size of transaction array: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		int i;
		System.out.println("\nEnter the values of array: ");
		for (i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("\nEnter the total no of targets that needs to be achieved: ");
		int targetno = sc.nextInt();
		while (targetno-- != 0) {
			int flag = 0;
			int target;
			System.out.println("\nEnter the value of target: ");
			target = sc.nextInt();
			int sum = 0;
			for (i = 0; i < size; i++) {
				sum += array[i];
				if (sum >= target) {
					System.out.println("\nTarget achieved after" + (i + 1) + "transactions");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("\nGiven target is not achieved ");
			}
		}
	}

}
