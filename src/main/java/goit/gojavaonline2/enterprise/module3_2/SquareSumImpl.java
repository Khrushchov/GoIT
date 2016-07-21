package goit.gojavaonline2.enterprise.module3_2;

import java.util.concurrent.*;

public class SquareSumImpl implements SquareSum {
    private static final Phaser PHASER = new Phaser(1);

//    public static void main(String[] args) {
//        SquareSumImpl squareSum = new SquareSumImpl();
//        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        System.out.println(squareSum.getSquareSum(values, 8));
//    }
    @Override
    public long getSquareSum(int[] values,  int numberOfThreads) {
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
        long results = 0;
        Counter.initCounter(values, numberOfThreads);
        for (int i = 1; i <= numberOfThreads ; i++) {
            if (i == numberOfThreads){
                Counter.destination = values.length;
            }
            Future<Long> future = executor.submit(new Counter());
            try {
                System.out.println(future.get());
                results += future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
        return results;
    }

    public static class Counter implements Callable{
        private static int departure;
        private static int destination;
        private static int[] values;
        private static int part;

        private int start;
        private int finish;

        public Counter() {
            start = departure;
            finish = destination;
            departure += part;
            destination += part;
        }

      static void initCounter(int[] values, int numberOfThreads){
            Counter.values = values;
            departure = 0;
            part = values.length/numberOfThreads;
            destination = departure + part;
            PHASER.register();
        }
        @Override
        public Long call() throws Exception {
            long result = 0;
            for (int i = start; i < finish  ; i++) {
                result += Math.pow(values[i], 2);
            }
            System.out.printf("Поток со стартовым индексом %d посчитал квадраты и передал " +
                    "результат. \n", start);
            PHASER.arriveAndDeregister();

            return result;
        }
    }

}
