package com.GreatLearning.lab2.question2;

public class MerageSortImplementation {

	void merge(int array[], int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int leftarray[] = new int[n1];
		int rightarray[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			leftarray[i] = array[left + i];
		}
		for (int j = 0; j < n2; j++) {
			rightarray[j] = array[mid + 1 + j];
		}
		int k = left;
		int i = 0, j = 0;
		while (i < n1 && j < n2) {
			if (leftarray[i] >= rightarray[j]) {
				array[k] = leftarray[i];
				i++;
			} else {
				array[k] = rightarray[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			array[k] = leftarray[i];
			i++;
			k++;
		}
		while (j < n2) {
			array[k] = rightarray[j];
			j++;
			k++;
		}

	}

	void sort(int notes[], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			sort(notes, left, mid);
			sort(notes, mid + 1, right);
			merge(notes, left, mid, right);
		}

	}

}
