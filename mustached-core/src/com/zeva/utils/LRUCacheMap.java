package com.zeva.utils;

import java.util.*;

/**
 * 
 * @author Sapan Bandi
 *
 * @param <K>
 * @param <V>
 */

public class LRUCacheMap<K, V> {
	 
	 private final int CACHE_SIZE;
	 private final int initialCapacity = 16;
	 private final float loadFactor = 0.75F;
	 
	 public LRUCacheMap(int size) {
	  this.CACHE_SIZE = size;
	 }
	 
	 // LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder)
	 // accessOrder - to maintain in order of elements from least-recently accessed to most-recently. Invoking the put or get method results in an access.
	 public LinkedHashMap<K, V> cache = new LinkedHashMap<K, V>(initialCapacity, loadFactor, true) {
	 
	  private static final long serialVersionUID = 1L;
	 
	  // The removeEldestEntry(Map.Entry) - is a method from LinkedHashMap, that should be overridden to impose a policy for removing OLD mappings automatically when new mappings are added to the map.
	  // Returns true if this map should remove its eldest entry. This method is invoked by put and putAll after inserting a new entry into the map. 
	  @Override
	  protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
	   boolean ifRemove = this.size() > CACHE_SIZE;
	   return ifRemove;
	  }
	   
	 };
	 
	 // Adds an entry to this cache. The new entry becomes the MRU (most recently used) entry. If an entry with the specified key already exists in the
	 // cache, it is replaced by the new entry. If the cache is full, the LRU (least recently used) entry is removed from the cache.
	 // it has to be synchronized, since we are deleting old elements and updating as per access order. Under multiple threads - it will be an issue.
	 public synchronized void put(K key, V value) {
	  if (value == null)
	   return;
	  else
	   cache.put(key, value);
	 }
	  
	 // Retrieves an entry from the cache. The retrieved entry becomes the MRU (most recently used) entry.
	 public synchronized V get(K key) {
	  return cache.get(key);
	 }
	 
	 public synchronized void clear() {
	  cache.clear();
	 }
	  
	  
	 // Test routine for the LRUCache class.
	 public static void main(String[] args) {
	  LRUCacheMap<String, String> c = new LRUCacheMap<String, String>(4);
	  c.put("1", "one"); // 1
	  c.get("1");
	  c.put("2", "two"); // 2 1
	  c.put("3", "three"); // 3 2 1
	  c.put("4", "four"); // 4 3 2
	  c.put("5", "four"); // 4 3 2
	  
	  for (Map.Entry<String, String> e : c.cache.entrySet()) {
	   System.out.println(e.getKey() + " : " + e.getValue());
	  }
	 }
	}