/**
 * 
 */
package com.zeva.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ArraySorter {

    public static void main(String args[]) {
    
    	String rdrStr = "BandiMishaSapanMahakSandhyaJain";
    	int length = rdrStr.length();
    	int counter = 0;
    	ArrayList sArrList = new ArrayList<String>(length);
    	
    	for(char s2 : rdrStr.toCharArray()) {
    		sArrList.add(s2);
    	}
    
    	Random rn = new Random();
    	char element1 = '\n';
    	StringBuffer strBuff = new StringBuffer(length);
    	int listLen = length;
    	//Arrays.sort(sArrList.toArray());
    	while (counter < length)
    	{
    		int answer1 = rn.nextInt(listLen);
    		
    		element1 = (char)sArrList.get(answer1);
    	
    		if (element1 != '\n') {
    				counter++;
    				strBuff.append(element1);
    				sArrList.remove(answer1);
    				element1 = '\n';
    				listLen--;  					
    		}
    		
    	}
    	
    	System.out.println(" String buffer:= " + strBuff.toString());
    	
        for(int i =0; i < 1; i++)
        {
            int answer = rn.nextInt(10);
            System.out.println(answer);
        }
        
    	int []a1 = {3,5,7,2,4,6};
        getSumPairs(a1,8);
        printPairsUsingTwoPointers(a1,8);
        
    	 final int[] original = new int[]{1, 1, 2, 8, 9, 8, 4, 7, 4, 9, 1, 1000, 1000};
    	 System.out.println(Arrays.toString(original));
    	 final int[] buckets = new int[1001];
    	 for (final int i : original) {
    	        buckets[i]++;
    	  }
    	 System.out.println(Arrays.toString(buckets));
    	    final int[] unique = new int[original.length];
    	    int count = 0;
    	    for (int i = 0; i < buckets.length; ++i) {
    	        if (buckets[i] > 0) {
    	            unique[count++] = i;
    	        }
    	    }
    	    final int[] compressed = new int[count];
    	    System.arraycopy(unique, 0, compressed, 0, count);
    	    System.out.println(Arrays.toString(compressed));
    	    
    	int x = 0;
    	int s  = 0;
    	for (int k = 0; k < 1024; k++) {
    		s = k;
    		x = 0;
    		StringBuffer s1 = new StringBuffer();
    		while ( s > 0) 
    		{
    			x = s % 2;
    			s1.append(x);
    			s = s/2;
    		}
    	
    		int l = s1.length();
    		while (l < 8)
    		{
    			s1.append("0");
    			l = l + 1;
    		}
    	
    		System.out.println("For Integer = " + k + " Bit Value = " + s1.reverse().toString());
    	
    	}
    	
    	int size = Integer.parseInt("1000");
        Random rand = new Random();
        Integer[] a = new Integer[size];
        for(int i=0; i<size; i++) {
            a[i] = rand.nextInt(size);
        }
        
        long t1= System.currentTimeMillis();

        Arrays.sort(a);
        
        long t2 = System.currentTimeMillis();
        
        System.out.println("Millseconds" +  (t2-t1));
        
    	double t = 1000.0;
    	for (int i=0;i<10;i++) {
    		t = t - ((5.0/100.0) * t);
    		
    	}
    	System.out.println("Decay1 = " + t);
    	System.out.println("\n");
    	
    	/*
    	int size = Integer.parseInt("10000");
        Random rand = new Random();
        Integer[] a = new Integer[size];
        for(int i=0; i<size; i++) {
            a[i] = rand.nextInt(size);
        }
       
        System.out.println("Random Integer Array before sorting : "
                + Arrays.toString(a));
        //insertionSort(a);
        
        Arrays.sort(a,Collections.reverseOrder());
       
        System.out.println("Random Integer Array after sorting in ascending order : "
                + Arrays.toString(a));
        
        // How to sort Integer array in Java - ascending order
        int[] random = { 33, 22, 11, 21, 55, 32, 3, 4 };
        System.out.println("Array before sorting : " + Arrays.toString(random));
        Arrays.sort(random); // sorts primitive array using quicksort algorithm
        System.out.println("Array after sorting in ascending order : "
                + Arrays.toString(random));
        
        Integer[] random1 = {33, 22, 11, 21, 55, 32, 3, 4};
        Arrays.sort(random1,Collections.reverseOrder());
        System.out.println("Array after sorting in descending order : "
                + Arrays.toString(random1));
       
        // How to sort String array in Java
        String[] names = {"John", "Steve", "Shane", "Adam", "Ben"};
        System.out.println("String array before sorting : " + Arrays.toString(names));
       
        Arrays.sort(names); // sorts object array using mergesort algorithm
        System.out.println("String array after sorting in ascending order : "
                + Arrays.toString(names));
       
       
        // How to sort String array in descending order in Java
        Arrays.sort(names, 0, names.length, Collections.reverseOrder());
        System.out.println("String array after sorting in descending order : "
                + Arrays.toString(names));
       
       
        // How to Sort Object Array in Java using Comparator and Comparable
        Course[] courses = new Course[4];
        courses[0] = new Course(101, "Java", 600);
        courses[1] = new Course(201, "Ruby", 300);
        courses[2] = new Course(301, "Python", 400);
        courses[3] = new Course(401, "Scala", 500);
       
        System.out.println("Object array before sorting : " + Arrays.toString(courses));
        Arrays.sort(courses);
        System.out.println("Object array after sorting in natural order : " + Arrays.toString(courses));
       
        Arrays.sort(courses,Collections.reverseOrder());
        System.out.println("Object array after sorting in natural reverse order : " + Arrays.toString(courses));
       
        Arrays.sort(courses, new Course.PriceComparator());
        System.out.println("Object array after sorting by price : " + Arrays.toString(courses));
       
        Arrays.sort(courses, new Course.NameComparator());
        System.out.println("Object array after sorting by name : " + Arrays.toString(courses));

        // How to sort two dimensional array in Java on first column, increasing order
        Integer[][] numbers = { {9, 6, 5}, {3, 2, 4}, {1, 5, 7} };
        System.out.println("Two dimensional array before sorting : " + Arrays.deepToString(numbers));
        Arrays.sort(numbers, new ColumnComparator(0, SortingOrder.ASCENDING));
        System.out.println("2D array after sorting in ascending order on first column : " + Arrays.deepToString(numbers));
       
        // sorting 2D array on second column in descending order
        Arrays.sort(numbers, new ColumnComparator(1,SortingOrder.DESCENDING));
        System.out.println("Sorting two dimensional String array in Java, Second column, Ascending order : " + Arrays.deepToString(numbers));
        
      //Numbers which need to be sorted
        int numbers1[] = {23,5,23,1,7,12,3,34,0};
 
        //Displaying the numbers before sorting
        System.out.println("Before sorting, numbers are ");
        for(int i = 0; i < numbers1.length; i++)
        {
            System.out.print(numbers1[i]+" ");
        }
        System.out.println();
 
        //Sorting in descending order using bubble sort
        bubbleSortInDescendingOrder(numbers1);
 
        //Displaying the numbers after sorting
        System.out.println("Before sorting, numbers are ");
        for(int i = 0; i < numbers1.length; i++)
        {
            System.out.print(numbers1[i]+" ");
        }
    	
        System.out.println();
     */

    }
    
    
    public static void printPairsUsingTwoPointers(int[] numbers, int k){ 
    	if(numbers.length < 2) { 
    		return; 
    		} 
    	Arrays.sort(numbers); 
    	
    	int left = 0; 
    	int right = numbers.length -1; 
    
    	while(left < right){ 
    		int sum = numbers[left] + numbers[right]; 
    		if(sum == k){ 
    			System.out.printf("(%d, %d) %n", numbers[left], numbers[right]); 
    			left = left + 1; right = right -1; 
    			}
    		else if(sum < k){ left = left +1; }
    		else if (sum > k) { right = right -1; } 
    		} 
    }

    	
    public static void getSumPairs(int []input, int k){
        Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

        for(int i=0;i<input.length;i++){

            if(pairs.containsKey(input[i]))
                System.out.println(input[i] +", "+ pairs.get(input[i]));
            else
                pairs.put(k-input[i], input[i]);
        }

    }
    
    public static void bubbleSortInDescendingOrder(int numbers[])
    {
        int temp;
 
        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = 1; j < (numbers.length-i); j++)
            {
                //if numbers[j-1] < numbers[j], swap the elements
                if(numbers[j-1] > numbers[j])
                {
                    temp = numbers[j-1];
                    numbers[j-1]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
    }
    
    public static <T extends Comparable<? super T>>
    void insertionSortGeneric(T[] a) {
        for (int i=0; i < a.length; i++) {
            /* Insert a[i] into the sorted sublist */
            T v = a[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (a[j].compareTo(v) <= 0) break;
                a[j + 1] = a[j];
            }
            a[j + 1] = v;
        }
    }
    
    public static <T>
    void insertionSortGeneric(T[] a, Comparator<? super T> c) {
        for (int i=0; i < a.length; i++) {
            /* Insert a[i] into the sorted sublist */
            T v = a[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (c.compare(a[j], v) <= 0) break;
                a[j + 1] = a[j];
            }
            a[j + 1] = v;
        }
    }
    
    public static void insertionSort(Object[] a) {
        for (int i=0; i < a.length; i++) {
            /* Insert a[i] into the sorted sublist */
            Object v = a[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (((Comparable)a[j]).compareTo(v) <= 0) break;
                a[j + 1] = a[j];
            }
            a[j + 1] = v;
        }
    }

	
}


/*
 * Simple Enum to represent sorting order e.g. ascending and descending order
 */
enum SortingOrder{
    ASCENDING, DESCENDING;
};

/*
 * Utility Comparator class to sort two dimensional array in Java
 */
class ColumnComparator implements Comparator<Comparable[]> {
    private final int iColumn;
    private final SortingOrder order;

    public ColumnComparator(int column, SortingOrder order) {
        this.iColumn = column;
        this.order = order;
    }

    @Override
    public int compare(Comparable[] c1, Comparable[] c2) {
        int result = c1[iColumn].compareTo(c2[iColumn]);
        return order==SortingOrder.ASCENDING ? result : -result;
    }
}

class Course implements Comparable<Course>{
    int id;
    String name;
    int price;
   
    public Course(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Course c) {
        return this.id - c.id;
    }
   
    @Override
    public String toString() {
        return String.format("#%d %s@%d ", id, name, price);
    }

    public static class PriceComparator implements Comparator<Course>{
        @Override
        public int compare(Course c1, Course c2) {
            return c1.price - c2.price;
        }       
    }
   
    public static class NameComparator implements Comparator<Course>{
        @Override
        public int compare(Course c1, Course c2) {
            return c1.name.compareTo(c2.name);
        }
    }
  
}
