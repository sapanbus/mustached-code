/**
 * 
 */
package com.zeva.utils;

/**
 * @author Sapan Bandi
 *
 */
public class LongestStrNoRepeatChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int longLenChar = 0;
		longLenChar = lengthOfLongestSubstring("SAPANBANDIMISHABANDI");
		System.out.println("Length is =: " + longLenChar);
		longLenChar = lengthOfLongestSubstringNoRepetitions("SAPANBANDIMISHABANDI");
		System.out.println("Length is second call =: " + longLenChar);
	}
	
	public static int lengthOfLongestSubstring(String s) {
	      
        Boolean [] exist =new Boolean [256];
 
        for (int i=0; i<256;i++){
 
            exist[i]=false;
        }
 
        int i=0;
 
        int j=0;
 
        int n=s.length();
 
        int maxlen=0;
 
        while(j<n){
 
            if (exist[s.charAt(j)]){
 
                maxlen=Math.max(maxlen,j-i);
 
                while(s.charAt(i)!=s.charAt(j)){
 
                    exist[s.charAt(i)]=false;
 
                    i++;
                }
 
                i++;
 
                j++;
            }
            else{
 
                exist[s.charAt(j)]=true;
                j++;               
            }
            
        }
        return maxlen=Math.max(maxlen, n-i);
    }

	public static int lengthOfLongestSubstringNoRepetitions(String s) {

	    if (s == null)
	        return 0;

	    // Trimming input even for the non-empty case is more consistent.
	    final String str = s.trim();

	    if (str.equals(""))
	        return 0;

	    int seen[] = new int[Character.MAX_VALUE+1];
	    for (int i = 0; i <= Character.MAX_VALUE; ++i)
	        seen[i] = -1;

	    int max = 1;
	    int len = 0;

	    for (int j = 0; j < str.length(); ++j) {
	        char ch = str.charAt(j);
	        // If ch was recently seen,
	        // counting must restart after the last place it was seen.
	        // Otherwise, it adds 1 to the length.
	        len = Math.min(j-seen[ch], len+1);
	        if (len > max)
	            max = len;
	        seen[ch] = j;
	    }
	    return max;
	}
}
