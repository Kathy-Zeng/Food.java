/* Kathy Zeng
   10/29/20
*  FoodTester.java
*/

import java.util.Scanner;

public class FoodTester extends Food
{
	public static void main(String[] args)
    {
        Food food1 = new Food ("baked", "banana", "muffins");
        food1.threeBL();
		    food1.printForSale();
		    Food food2 = new Food ("fried", "yam", "fritters");
		    food2.printForSale();
		    Pizza pizza = new Pizza ("pepperoni");
		    pizza.printForSale();
		    DeepDishPizza ddp=new DeepDishPizza("cheese");
        ddp.printForSale();
        pizza.threeBL();
    }
}
