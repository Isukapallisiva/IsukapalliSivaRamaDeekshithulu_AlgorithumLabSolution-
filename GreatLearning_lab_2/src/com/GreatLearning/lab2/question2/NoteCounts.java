package com.GreatLearning.lab2.question2;

public class NoteCounts {

	public void noteCounterImplementation(int notes[], int amount) {
		int noteCounter[] = new int[notes.length];
		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					noteCounter[i] = amount / notes[i];
					amount = amount - noteCounter[i] * notes[i];

				}
			}
			if (amount > 0) {
				System.out.println("\nAmount can't be given Higest denomination");
			} else {
				System.out.println("\nYour payment approach in order to give min no of notes will be");
				for (int i = 0; i < notes.length; i++) {
					if (noteCounter[i] != 0) {
						System.out.println(notes[i] + ":" + noteCounter[i]);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
