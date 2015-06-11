package com.zeva.design.concurrency;
/**
 * 
 */
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ThreadTest {

    private CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Runnable() {
        @Override
        public void run() {
            System.out.println(oddNumberGenerator.result);
            System.out.println(evenNumberGenerator.result);
        }
    });

    private NumberGenerator oddNumberGenerator = new NumberGenerator(1,11000,2);
    private NumberGenerator evenNumberGenerator = new NumberGenerator(2,1000000,2);

    public void generateSeries(){
        oddNumberGenerator.generateNumbers();
        evenNumberGenerator.generateNumbers();
    }


    class NumberGenerator {
        private Thread thread;
        private int result;

        private NumberGenerator(final int initialValue, final int maxValue,
                                final int stepSize) {
            this.thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = initialValue; i <= maxValue; i = i + stepSize) {
                        try {
                            result = i;
                            cyclicBarrier.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } catch (BrokenBarrierException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }

        public void generateNumbers() {
            thread.start();
        }
    }


    public static void main(String[] args){
       new ThreadTest().generateSeries();
    }
}