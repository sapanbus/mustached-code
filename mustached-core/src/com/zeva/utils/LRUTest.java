package com.zeva.utils;

/**
 * 
 * @author Sapan Bandi
 *
 */
public class LRUTest {

	public LRUTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LRU<String,char[]> lruCache = new LRU<String,char[]>(10);
		 lruCache.put("1", "Test1".toCharArray());
		  lruCache.put("3", "Test3".toCharArray());
		  lruCache.put("4", "Test4".toCharArray());
		  lruCache.put("2", "Test2".toCharArray());
		  System.out.println(lruCache.get("1"));
		  System.out.println(lruCache.get("2"));
		  System.out.println(lruCache.get("3"));
		  lruCache.put("4", "Test4".toCharArray());
		  lruCache.put("5", "Test5".toCharArray());
		  System.out.println(lruCache.get("5"));
		  System.out.println(lruCache.get("4"));
		  System.out.println(lruCache.get("3"));

	}

}
