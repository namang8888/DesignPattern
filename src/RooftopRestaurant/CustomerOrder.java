package RooftopRestaurant;

public class CustomerOrder implements Runnable{

    private String name;

    private long deliveryTime;

    CustomerOrder(String name, long deliveryTime){
        this.name = name;
        this.deliveryTime = deliveryTime;
    }

    public void run(){
        try{
            System.out.println(name + "->" + Thread.currentThread().getName());
            Thread.sleep(deliveryTime*1000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }

    }
    public String getName() {
        return name;
    }

}
