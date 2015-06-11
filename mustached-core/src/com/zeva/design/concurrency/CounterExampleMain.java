package com.zeva.design.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterExampleMain {

	public CounterExampleMain() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AtomicInteger seq = new AtomicInteger();
		int i = 0;
		int nextVal = -1;
		while (i < 100) {
			nextVal = seq.incrementAndGet();	
			i++;
		}
		System.out.println(nextVal);

	}

}
