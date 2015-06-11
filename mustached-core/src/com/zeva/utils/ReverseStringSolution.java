/**
 * 
 */
package com.zeva.utils;

import java.lang.StringBuilder;
import java.util.Objects;
/**
 * @author Sapan Bandi
 *
 */
public class ReverseStringSolution {

	/**
	 * 
	 */
	public ReverseStringSolution() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	public static String reverse(final String input) {
		  Objects.requireNonNull(input);
		  final StringBuilder stringBuilder = new StringBuilder();
		  for (final String part : input.split("\\s+")) {
		    if (!part.isEmpty()) {
		      if (stringBuilder.length() > 0) {
		        stringBuilder.insert(0, " ");
		      }
		      stringBuilder.insert(0, part);
		    }
		  }
		  return stringBuilder.toString();
		}
	
	/**
	 * 
	 * @param string
	 * @return
	 */
	 private static final String reverseStringword(final String string) {
	        StringBuilder sb = new StringBuilder();
	        for(int i=string.length()-1;i>=0; i--) {
	            sb.append(string.charAt(i));
	        }
	        return sb.toString();
	    }
	
	 /**
	  * 
	  * @param string
	  * @return
	  * @throws Exception
	  */
	public static final String reverseWordsInString(final String string) throws Exception {
		
		int i = 0;
		if (string == null) throw new Exception("String cannot be null");
		
		if (string.length() < 2) return string;
		
		int len = string.length();
		StringBuilder sb = new StringBuilder();
		
		while (i < len) {
			
			char c = string.charAt(i);
			if(c == ' ') {
                sb.append(c);
            } else {
                int j = i;
                while(j < len && string.charAt(j) != ' ') {
                    j++;
                }
                sb.append(reverseStringword(string.substring(i, j)));
                i = j-1;
            }
			i++;
		}
		
		return sb.toString();
		
	}
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	private static final String reverseString(String input) {
	    if (input == null) {
	        return null;
	    }
	    String[] parts = input.trim().split("\\s+");
	    if (parts.length == 0) {
	        return "";
	    }
	    StringBuilder sb = new StringBuilder();
	    sb.append(parts[parts.length - 1]);
	    for (int i = parts.length - 2; i >= 0; i--) {
	        sb.append(" ").append(parts[i]);
	    }
	    return sb.toString();
	}

	/**
	 * 
	 * @param input
	 * @return
	 */
	private static final String reverseStringFP(final String input) {
	    if (input == null) {
	        return null;
	    }
	    if (input.isEmpty()) {
	        return "";
	    }
	    final char[] inchar = input.toCharArray();
	    // + 1 to allow for a temporary trailing space
	    final char[] outchar = new char[inchar.length + 1];
	    int outpos = 0;
	    int wordend = inchar.length - 1;
	    while (wordend >= 0) {
	        while (wordend >= 0 && inchar[wordend] == ' ') {
	            wordend--;
	        }
	        int wordstart = wordend;
	        while (wordstart > 0 && inchar[wordstart - 1] != ' ') {
	            wordstart--;
	        }
	        if (wordstart >= 0) {
	            int len = wordend - wordstart + 1;
	            System.arraycopy(inchar, wordstart, outchar, outpos, len);
	            outpos += len;
	            outchar[outpos++] = ' ';
	            wordend = wordstart - 1;
	        }
	    }
	    if (outpos > 0) {
	        // deal with trailing space
	        outpos--;
	    }
	    return new String(outchar, 0, outpos);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s1 = "";
	String s2 = "";
	 try {
		 s1 = reverseWordsInString("This is");
		 s2 = reverse("This is");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Reverse String is= " + s1);
	System.out.println("Reverse String is= " + s2);
	}

}


