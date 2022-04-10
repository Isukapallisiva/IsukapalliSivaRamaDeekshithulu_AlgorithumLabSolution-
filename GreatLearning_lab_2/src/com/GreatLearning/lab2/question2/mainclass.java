package com.GreatLearning.lab2.question2;

import java.util.Scanner;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the size of currency denominations ");
		int size= sc.nextInt();
		int notes[]= new int[size];
		System.out.println("\nEnter the currency denominations value");
		for(int i=0;i<size;i++) {
			notes[i]=sc.nextInt();
		}
		System.out.println("\nEnter the amount you want to pay");
		int amount=sc.nextInt();
		MerageSortImplementation msi= new MerageSortImplementation();
		msi.sort(notes, 0, notes.length-1);
        NoteCounts ns=new NoteCounts();
        ns.noteCounterImplementation(notes, amount);
	}

}
