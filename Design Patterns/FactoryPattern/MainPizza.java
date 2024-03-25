


// Step 5: Client Code
public class PizzaStore {
    public static void main(String[] args) {
        // Create a SimplePizzaFactory
        PizzaFactory factory = new SimplePizzaFactory();

        // Order a Cheese Pizza
        Pizza cheesePizza = factory.createPizza("cheese");
        System.out.println("Ordered a Cheese Pizza:");
        cheesePizza.prepare();
        cheesePizza.bake();
        cheesePizza.cut();
        cheesePizza.box();

        // Order a Pepperoni Pizza
        Pizza pepperoniPizza = factory.createPizza("pepperoni");
        System.out.println("\nOrdered a Pepperoni Pizza:");
        pepperoniPizza.prepare();
        pepperoniPizza.bake();
        pepperoniPizza.cut();
        pepperoniPizza.box();
    }
}
