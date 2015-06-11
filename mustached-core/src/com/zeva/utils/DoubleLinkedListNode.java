/**
 * 
 */
package com.zeva.utils;

/**
 * @author Sapan Bandi
 *
 */
public class DoubleLinkedListNode {

	/**
	 * 
	 */
	public DoubleLinkedListNode() {
		// TODO Auto-generated constructor stub
	}
	
	public char[] val;
	public String key;
	public DoubleLinkedListNode pre;
	public DoubleLinkedListNode next;
 
	public DoubleLinkedListNode(String key, char[] value) {
		val = value;
		this.key = key;
	}


}
