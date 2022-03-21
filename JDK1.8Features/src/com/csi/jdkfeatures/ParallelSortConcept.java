package com.csi.jdkfeatures;

import java.util.Arrays;

public class ParallelSortConcept {
	public static void main(String[] args) {

		int arr[] = { 999, 6, 3, 5, 9, 1, 222 };

		System.out.println("\n Before Sort");
		for (int i : arr) {
			System.out.println(i);
		}
		
		System.out.println("\n After Sort");
		
		Arrays.parallelSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
