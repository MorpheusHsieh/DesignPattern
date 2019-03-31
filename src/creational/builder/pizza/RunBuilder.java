package creational.builder.pizza;

/** A given type of pizza being constructed. */
public class RunBuilder
{
  public static void main(String[] args) 
  {
    Cook cook = new Cook();
    PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
    PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
 
    cook.setPizzaBuilder(hawaiianPizzaBuilder);
    cook.constructPizza();

    Pizza hawaiian = cook.getPizza();
    System.out.println(hawaiian);
    System.out.println();
 
    cook.setPizzaBuilder(spicyPizzaBuilder);
    cook.constructPizza();

    Pizza spicy = cook.getPizza();
    System.out.println(spicy);
  }
}
