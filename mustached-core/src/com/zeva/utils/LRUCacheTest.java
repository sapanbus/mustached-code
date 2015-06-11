/**
 * 
 */
package com.zeva.utils;

/**
 * @author Sapan Bandi
 *
 */
public class LRUCacheTest {

	/**
	 * 
	 */
	public LRUCacheTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  LRUCache lruCache = new LRUCache(5);
	  
	  lruCache.set("1", "Test1".toCharArray());
	  lruCache.set("3", "Test3".toCharArray());
	  lruCache.set("4", "Test4".toCharArray());
	  lruCache.set("2", "Test2".toCharArray());
	  System.out.println(lruCache.get("1"));
	  System.out.println(lruCache.get("2"));
	  System.out.println(lruCache.get("3"));
	  lruCache.set("1", "Test1".toCharArray());
	  lruCache.set("2", "Test2".toCharArray());
	  System.out.println(lruCache.get("5"));
	  System.out.println(lruCache.get("4"));
	  System.out.println(lruCache.get("3"));
	
	  

	}

}
