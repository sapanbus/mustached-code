/**
 * 
 */
package com.zeva.utils;

import java.util.Random;

/**
 * @author Sapan Bandi
 *
 */
public class Mergesort {
	
	  private int[] numbers;
	  private int[] helper;
	    
	  private final static int SIZE = 20;
	  private final static int MAX = 100;

	  private int number;

	  public void sort(int[] values) {
	    this.numbers = values;
	    number = values.length;
	    this.helper = new int[number];
	    mergesort(0, number - 1);
	  }

	  private void mergesort(int low, int high) {
	    // check if low is smaller then high, if not then the array is sorted
	    if (low < high) {
	      // Get the index of the element which is in the middle
	      int middle = low + (high - low) / 2;
	      // Sort the left side of the array
	      mergesort(low, middle);
	      // Sort the right side of the array
	      mergesort(middle + 1, high);
	      // Combine them both
	      merge(low, middle, high);
	    }
	  }

	  /**
	   * 
	   * @param low
	   * @param middle
	   * @param high
	   */
	  private void merge(int low, int middle, int high) {

	    // Copy both parts into the helper array
	    for (int i = low; i <= high; i++) {
	      helper[i] = numbers[i];
	    }

	    int i = low;
	    int j = middle + 1;
	    int k = low;
	    // Copy the smallest values from either the left or the right side back
	    // to the original array
	    while (i <= middle && j <= high) {
	      if (helper[i] <= helper[j]) {
	        numbers[k] = helper[i];
	        i++;
	      } else {
	        numbers[k] = helper[j];
	        j++;
	      }
	      k++;
	    }
	    // Copy the rest of the left side of the array into the target array
	    while (i <= middle) {
	      numbers[k] = helper[i];
	      k++;
	      i++;
	    }

	  }
	  
	  public void setUp() throws Exception {
		    numbers = new int[SIZE];
		    Random generator = new Random();
		    for (int i = 0; i < numbers.length; i++) {
		      numbers[i] = generator.nextInt(MAX);
		    }
		  }
	  
	  
	  
	  public void testMergeSort() {
		    long startTime = System.currentTimeMillis();

		    Mergesort sorter = new Mergesort();
		    sorter.sort(numbers);

		    long stopTime = System.currentTimeMillis();
		    long elapsedTime = stopTime - startTime;
		    System.out.println("Mergesort " + elapsedTime);

		    for (int i = 0; i < numbers.length - 1; i++) {
		      if (numbers[i] > numbers[i + 1]) {
		        System.out.println("This is not allowed");
		      }
		    }
		    System.out.println("true");

		  }

	  /**
	   * 
	   * @param args
	   */
	  public static void main(String[] args) {
		  
		  long startTime = System.currentTimeMillis();

		    Mergesort sorter = new Mergesort();
		    try {
				sorter.setUp();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    sorter.sort(sorter.numbers);

		    long stopTime = System.currentTimeMillis();
		    long elapsedTime = stopTime - startTime;
		    System.out.println("Mergesort " + elapsedTime);

		    for (int i = 0; i < sorter.numbers.length - 1; i++) {
		    	System.out.println("Sorted number:" + sorter.numbers[i]);
		      if (sorter.numbers[i] > sorter.numbers[i + 1]) {
		        System.out.println("Invalid Sort Order!");
		      }
		    }
		    System.out.println("true");
		  
	  }
	  
} 
