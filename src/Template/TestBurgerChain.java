package Template;

public class TestBurgerChain {
    public static void main(String[] args){
        BurgerChain nonVeg = new NonVegBurgerChain();

        BurgerChain veg = new VegBurgerChain();

        nonVeg.makeBurger();
        System.out.println();
        veg.makeBurger();
    }
}
