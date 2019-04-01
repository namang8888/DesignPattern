package RooftopRestaurant;


import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class Driver implements ThreadFactory{
    private String name;
    private AtomicInteger integer = new AtomicInteger(1);

    public Driver(String name) {
        this.name = name;
    }

    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r, name + integer.getAndIncrement());
    }

}
