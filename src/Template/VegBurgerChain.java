package Template;

public class VegBurgerChain extends BurgerChain {

    String[] cheeseUsed = {"Mozzarella"};
    String[] veggiesUsed ={"Tomato","Onions","Cucumber"};
    String[] condimentsUsed = {"Oil","Vinegar"};

    @Override
    public void addMeat() { }

    @Override
    public void addCheese() {
        System.out.println("Adding Cheese:");
        for(String cheese : cheeseUsed){
            System.out.println(cheese);
        }
    }

    @Override
    public void addVeggies() {
        System.out.println("Adding Veggies");
        for(String veg : veggiesUsed){
            System.out.println(veg);
        }
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Condiments");
        for(String cond : condimentsUsed){
            System.out.println(cond);
        }
    }

    public boolean wantMeat(){return false;}
}
