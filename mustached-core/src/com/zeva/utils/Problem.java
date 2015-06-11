/**
 * 
 */
package com.zeva.utils;
import java.lang.UnsupportedOperationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.*;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
/**
 * @author Sapan Bandi
 *
 */
public class Problem {

	/**
	 * 
	 */
	public Problem() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @return 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//IntStream.range(1, 5).parallel().forEach(i -> System.out.println());
		
		List<String> companyList = Arrays.asList("Google", "Yahoo", "Facebook", "", "Twitter", "LinkedIn");
		System.out.println("- Here is a Company List: " + companyList);
 
		// Print only empty list count
	//	long emptyCount = companyList.stream().filter(cList -> cList.isEmpty()).count();
	//	System.out.println("Test1: # of Empty Strings: " + emptyCount);
		
	//	IntStream.iterate(0, i -> i + 2).limit(3);
		
		List<Integer> x = new ArrayList<Integer>();
		x.add(10);
		x.add(3);
		x.add(0);
		x.add(-2);
		x.add(12);
		x.add(5);
		x.add(1);
		x.add(1);
		x.add(4);
		// maxThreeProduct(x)
		System.out.println(maxThreeProduct(x));
		List<Integer> y = new ArrayList<Integer>();
		List<Integer> z = new ArrayList<Integer>();
		
		y.add(1);
		y.add(4);
		y.add(5);
		y.add(9);
		z.add(2);
		z.add(3);
		z.add(10);
		z.add(11);
		List<int[]> st = collateSortedList(y,z);
		System.out.println("Sorted merged list" + st.get(0));
		
		
	}
	/**
	 * 
	 * @param l1
	 * @param l2
	 * @return
	 */
	public static List<int[]> collateSortedList(final List<Integer> l1, final List<Integer> l2) 
	 {
		Integer[] a = new Integer[l1.size()];
		Integer[] b = new Integer[l2.size()];
	    l1.toArray(a);
		l2.toArray(b);
		
	    int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;
	    System.out.println("Array A" + a.length);
	    while (i < a.length && j < b.length)
	    {
	        if (a[i] < b[j])       
	            answer[k++] = a[i++];

	        else        
	            answer[k++] = b[j++];               
	    }

	    while (i < a.length)  
	        answer[k++] = a[i++];


	    while (j < b.length)    
	        answer[k++] = b[j++];

	    System.out.println("Merge Array" + answer.length);
	    for(int p:answer) 
	    	System.out.println("Merge Index" + p);
	    List<int[]> t = Arrays.asList(answer);
	    return t;
	 }
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	public static int maxThreeProduct(List<Integer> input) {
     
		int maxproduct = 1;
		  int i = 1;
		  Collections.sort(input);
		  Collections.reverse(input);
		  for(Integer l:input) {
	          if (i > 3) break;
	          System.out.println(l.intValue());
	          maxproduct = maxproduct * l.intValue();
	          i++;
			  //System.out.println(l.intValue());
		
		  }
		  
	  return maxproduct;
	}
		
        
	
}
