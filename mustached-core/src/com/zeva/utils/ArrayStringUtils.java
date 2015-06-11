package com.zeva.utils;
/**
 * 
 */

/**
 * @author Sapan Bandi
 *
 */
import java.util.ArrayDeque;
public class ArrayStringUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int addnumberval = addnumbers("1,2,A,-12");
		System.out.println("Sum Number=" + addnumberval);
		int matchvalue = nearestMatchToValue(500,200,1000);
		System.out.println("Nearest Match Value to 1000.0 = " + matchvalue);
		
		String stringOrignalDouble = RepeatAString("abcxyz");
		System.out.println("String repeated or Doubled = " + stringOrignalDouble);
		
		int[] numA = {1,4,3,5,1,2};
		boolean sum1 = SplitSumCheck(numA);
		System.out.println("Split Array Sum Check = " + sum1);
		
		String s1 = "Sapan";
		String s2 = insertAsterikCharInto(s1);
		System.out.println("Inserted Asterik = " + s2);	    
		
		
		
	}
	
 
	
	/**
	 * This method which given two integers, returns the integer that is closest to 1000.
	 * @param i1
	 * @param i2
	 * @param value
	 * @return
	 */
	
	public static final int nearestMatchToValue(final int i1, final int i2, final int value) {
	    
	   int nearestMatchValue = 0;
	    if ( Math.abs(value - i1) > Math.abs(value - i2) ) 
	            nearestMatchValue = i2;
	       else
	    	   	nearestMatchValue = i1;
	        
	    return nearestMatchValue;
	}
	
	/**
	 * For given Input String, this method returns a string where every character in the original is doubled.
	 * @param sInputString
	 * @return
	 */
	
	public static final String RepeatAString(final String sInputString)
	{
		final StringBuilder sOutputString = new StringBuilder();

		for (int i = 0;i < sInputString.length(); i++) {
			sOutputString.append(sInputString.charAt(i));
			sOutputString.append(sInputString.charAt(i));
		}

		return sOutputString.toString();
	}

	/**
	 * The method should return true if there is a way to split the array in two so that the sum of the numbers on one side of the split equals the sum of the numbers on the other side.
	 * @param numsArray
	 * @return
	 */
	public static final boolean SplitSumCheck(final int[] numsArray) {
		int leftArraySum = 0, rightArraySum = 0, i, j;
		  
		if(numsArray.length == 1)
		      return false;

		for(i=0, j=numsArray.length-1; i<=j ;){
			if(leftArraySum <= rightArraySum){
				leftArraySum+=numsArray[i];
		        i++;
		      } else {
		    	  rightArraySum+=numsArray[j];
		         j--;
		      }
		  }
		  return (rightArraySum == leftArraySum);
		}
	
	/**
	 * This method which given a string, returns a string with an asterisk inserted between every character in the original.   
	 * Using recursion
	 * @param s
	 * @return
	 */
	
	public static final String insertAsterikCharInto(String s) {
	    
	    if (s.isEmpty()) {
	        return "";
	    }
	    return s.charAt(0) + "*" + insertAsterikCharInto(s.substring(1));
	}
	
	public static int addnumbers(String input) {
		
		if (input.isEmpty() || input.length() == 0) return 0;
		
		if (input.length() < 2) {
			
			int a = Integer.parseInt(input);
			
			return a;
			
		}
		
		String[] s1 = input.split(",");
		
		int sum = 0;
		int a1;
		for(String s:s1) {
			a1 = 0;
			if (s.matches("\n")) continue;
			try {
				a1 = Integer.parseInt(s);
				sum = sum + a1;
			} catch (Exception e) {
				
			}
			
			
		}
		
		return sum;
		
		
	}
	
}