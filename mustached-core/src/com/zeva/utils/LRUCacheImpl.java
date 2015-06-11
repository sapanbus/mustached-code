package com.zeva.utils;

import java.util.*;
/**
 * 
 * @author Sapan Bandi
 *
 */
public class LRUCacheImpl extends LinkedHashMap<Integer, String> {
   private static final long serialVersionUID = 1L;
   private int capacity;
    
   /**
    * 
    * @param capacity
    * @param loadFactor
    */
   public LRUCacheImpl(int capacity, float loadFactor){
      super(capacity, loadFactor, true);
      this.capacity = capacity;
   }
    
   /**
    * removeEldestEntry() should be overridden by the user, otherwise it will not 
    * remove the oldest object from the Map.
    */
   @Override
   protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest){
      return size() > this.capacity;
   }
    
   /**
    * 
    * @param arg
    */
   public static void main(String arg[]){
	  
	   Integer x = new Integer(100);
	    
	   String[] twoDim = new String[] { "5", "2","3"};
	   
	   Arrays.sort(twoDim);
	   
	   Arrays.sort(twoDim, new Comparator<String>() {
		    @Override
		    public int compare(String o1, String o2) {
		    	if (o1.length() < o2.length()) {
		    	      return -1;
		    	    } else if (o1.length() > o2.length()) {
		    	      return 1;
		    	    } else {
		    	      return 0;
		    	    }
		    }
		});
      
	   // Create the sorted set
	   SortedSet<String> set1 = new TreeSet<String>(); 

	   // Add elements to the set
	   set1.add("1b");
	   set1.add("c2");
	   set1.add("a1");
	   set1.add("1b");
	   System.out.println(set1);
	      
	   TreeMap<String, Double> tm = new TreeMap<String,Double>();
	  // Put elements to the map
	   tm.put("Zara", new Double(3434.34));
	   tm.put("Mahnaz", new Double(123.22));
	   tm.put("Ayan", new Double(1378.00));
	   tm.put("Daisy", new Double(99.22));
	   tm.put("Qadir", new Double(-19.08));
	   
	   System.out.println(tm);
	   
	   
	   HashMap<String,String> testmap1 = new HashMap<String,String>();
	 
	   testmap1.put("1", "Sapan");
	   testmap1.put("2", "john");
	   testmap1.put("3", "Obama");
	   testmap1.put("4", "joyce");
	   
	   System.out.println(testmap1);
	    
	   LRUCacheImpl lruCache = new LRUCacheImpl(2, 0.75f);
       
      
      lruCache.put(1, "Object1_cart");
      lruCache.put(2, "Object2_order");
      lruCache.put(3, "Object3_cust");
      lruCache.put(4, "Object4_tweet");
      lruCache.get(1);
      lruCache.put(4, "Object4_facebook");
      System.out.println(lruCache);
      lruCache.put(5, "Object5_google");
      lruCache.get(3);
      lruCache.put(6, "Object6_spring");
      System.out.println(lruCache);
      lruCache.get(4);
      lruCache.put(7, "Object7_summer");
      lruCache.put(8, "Object8_nancy");
      System.out.println(lruCache);
   }
}