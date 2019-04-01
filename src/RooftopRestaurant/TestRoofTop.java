package RooftopRestaurant;

import java.util.concurrent.TimeUnit;

public class TestRoofTop {
    static final int MAX_DRIVERS = 2;
    static int conversionRate = 1000;

    public static void main(String[] args) throws Exception{
        RoofTopExecutor pool = new RoofTopExecutor(MAX_DRIVERS,
                new Driver("D"));

        try {
            Runnable r1 = new CustomerOrder("C1",10);
            Runnable r2 = new CustomerOrder("C2",20);
            Runnable r3 = new CustomerOrder("C3",5);
            Runnable r4 = new CustomerOrder("C4",20);
            Runnable r5 = new CustomerOrder("C5",10);
            Runnable r6 = new CustomerOrder("C6",10);

            pool.execute(r1);
            Thread.sleep(3*conversionRate);

            pool.execute(r2);
            Thread.sleep(11*conversionRate);

            pool.execute(r3);
            Thread.sleep(7*conversionRate);

            pool.execute(r4);
            Thread.sleep(2*conversionRate);

            pool.execute(r5);
            Thread.sleep(1*conversionRate);

            pool.execute(r6);
        }finally {
            pool.shutdown();
            try {
                pool.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
