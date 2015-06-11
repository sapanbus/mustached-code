/**
 * 
 */
package com.zeva.utils;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author Sapan Bandi
 *
 */
public class AnagramSolution {

	/**
	 * 
	 */
	public AnagramSolution() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>(); 
		
		list.add("apple");
		list.add("but");
		list.add("tub");
		list.add("stop");
		list.add("tops");
		list.add("pots");
		list.add("dog");
		list.add("god");
		
		HashMap<String,List<String>> hmap = new HashMap<String, List<String>>();
		String word;
		for(String s:list) {
			
			char[] scharArray = s.toCharArray();
			
			Arrays.sort(scharArray);
			word = String.valueOf(scharArray);
			System.out.println(word);
			if (!hmap.containsKey(word)) {
				
				List<String> l = new ArrayList<String>();
				l.add(s);
				hmap.put(word, l);
			}
			else {
				
				hmap.get(word).add(s);
			}	
			
		} // end if for loop

		System.out.println(hmap.entrySet());
		System.out.println(hmap.values());	
		
		Set<?> set = hmap.entrySet();
	      // Get an iterator
	      Iterator<?> i = set.iterator();
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	}

}
