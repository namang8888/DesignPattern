package Template;

public class NonVegBurgerChain extends BurgerChain {

    String[] meatUsed = {"Chicken","Beef","Mutton"};
    String[] cheeseUsed = {"Mozzarella"};
    String[] veggiesUsed ={"Tomato","Onions","Cucumber"};
    String[] condimentsUsed = {"Oil","Vinegar"};

    @Override
    public void addMeat() {
        System.out.println("Adding Meat:");
        for(String meat : meatUsed){
            System.out.println(meat);
        }
    }

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
}
