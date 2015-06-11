/**
 * 
 */
package com.zeva.utils;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * @author Sapan Bandi
 *
 */
public class PriorityQueueTest {

	/**
	 * 
	 */
	public PriorityQueueTest() {
		// TODO Auto-generated constructor stub
	}
	
	static class PQsort implements Comparator<Integer> {
		 
		public int compare(Integer one, Integer two) {
			return two - one;
		}
	}
	
	enum ProductQuality {
		  High, Medium, Low
		}

	
	static class Product implements Comparable<Product> {
		  String name;

		  ProductQuality priority;

		  Product(String str, ProductQuality pri) {
		    name = str;
		    priority = pri;
		  }

		  public int compareTo(Product msg2) {
		    return priority.compareTo(msg2.priority);
		  }
		}

	static	class MessageComparator implements Comparator<Product> {
		  public int compare(Product msg1, Product msg2) {
		    return msg2.priority.compareTo(msg1.priority);
		  }
		}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ia = { 1, 10, 5, 3, 4, 7, 6, 9, 8,10,20,30,494,12,82,34 };
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
 
		// use offer() method to add elements to the PriorityQueue pq1
		for (int x : ia) {
			pq1.offer(x);
		}
 
		System.out.println("pq1: " + pq1);
 
		PQsort pqs = new PQsort();
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(20, pqs);
		// In this particular case, we can simply use Collections.reverseOrder()
		// instead of self-defined comparator
		for (int x : ia) {
			pq2.offer(x);
		}
 
		System.out.println("pq2: " + pq2);
 
		// print size
		System.out.println("size: " + pq2.size());
		// return highest priority element in the queue without removing it
		System.out.println("peek: " + pq2.peek());
		// print size
		System.out.println("size: " + pq2.size());
		// return highest priority element and removes it from the queue
		System.out.println("poll: " + pq2.poll());
		// print size
		System.out.println("size: " + pq2.size());
 
		System.out.println("pq2: " + pq2);	
	
		
		PriorityQueue<Product> pq = new PriorityQueue<Product>(3);

	    pq.add(new Product("A", ProductQuality.Low));
	    pq.add(new Product("B", ProductQuality.High));
	    pq.add(new Product("C", ProductQuality.Medium));
	    Product m;
	    while ((m = pq.poll()) != null)
	      System.out.println(m.name + " Priority: " + m.priority);

	    PriorityQueue<Product> pqRev = new PriorityQueue<Product>(3, new MessageComparator());

	    pqRev.add(new Product("D", ProductQuality.Low));
	    pqRev.add(new Product("E", ProductQuality.High));
	    pqRev.add(new Product("F", ProductQuality.Medium));

	    while ((m = pqRev.poll()) != null)
	      System.out.println(m.name + " Priority: " + m.priority);
	    
	    PriorityQueue<Integer> q = new PriorityQueue<Integer>(2000, Collections.reverseOrder());
	    Random r = new Random();
	    for (int i = 0; i < 1200; i++) {
	      int number = r.nextInt(1005);
	      q.add(number);
	    }
	   
	    StringBuilder sb = new StringBuilder(100000);
	    while (!q.isEmpty()) {
	      int number = q.remove();
	      sb.append(number).append(' ');
	    }
	  System.out.println(sb);

	}

}
