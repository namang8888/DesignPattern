package Template;

public abstract class BurgerChain {

    public void makeBurger(){

        cutBun();

        if(wantMeat()) {
            addMeat();
        }

        addCheese();

        addVeggies();

        addCondiments();

        wrapTheBurger();
    }

    public void cutBun(){System.out.println("The Bun is cut");}

    public abstract void addMeat();
    public abstract void addCheese();
    public abstract void addVeggies();
    public abstract void addCondiments();

    public boolean wantMeat(){return true;}

    public void wrapTheBurger(){System.out.println("The Burger is wrapped");}
}
