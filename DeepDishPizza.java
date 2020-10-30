/* Kathy Zeng
 * 10/29/20
 * DeepDishPizza.java
 * Create own parameters
*/
public class DeepDishPizza extends Pizza
{
	protected String str;    
	
	public DeepDishPizza ()
	{
		str = new String("");
	}
	
	public DeepDishPizza(String toppings)
	{
       super(toppings, "Deep Dish Pizza");
  }
}
	
