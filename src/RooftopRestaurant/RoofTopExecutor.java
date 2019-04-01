package RooftopRestaurant;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class RoofTopExecutor extends ThreadPoolExecutor {

    int maxThreads;

    RoofTopExecutor(int nThreads, ThreadFactory threadFactory) {
        super(nThreads, nThreads,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(),
                threadFactory);
        this.maxThreads = nThreads;
    }

    @Override
    public void execute(Runnable command) {
       if (super.getActiveCount() == maxThreads) {
            System.out.println(((CustomerOrder) command).getName() + "-> No Food :-(");
        } else {
            super.execute(command);
        }
    }
}