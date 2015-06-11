/**
 * 
 */
package com.zeva.utils;

import java.util.Arrays;

/**
 * @author Harry Iyer
 *
 */
public class ArraySummation {

	/**
	 * 
	 */
	public ArraySummation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long[] A = {1,5,7,-1,2,15,4};
		
		int len = A.length;
		
		long sum = 0;
		
		long[] B = new long[len];
		
		for(int i = 0;i< len;i++) {
			
			sum = sum + A[i];
			B[i] = sum;
			System.out.println("Sum=" + B[i]);
			
			}
		
	     int[] C = {1,2,3,4,1,2};
	     int max = C[0];
	     int k = 0;
	     for (k = 1;k < C.length;k++) {	 
	    	 if (max < C[k]) {
	    		 max = C[k];
	    		 System.out.println("MAX in loop=" + C[k]);
	 		
	    	 }
	    	 else {
	    		 System.out.println("MAX in loop1=" + C[k]);
	    		 break;
	    		 
	    	 }
	    	 System.out.println("out of loop:" + C[k]);
	     }
	
	     System.out.println("MAX" + max);
		}

}


