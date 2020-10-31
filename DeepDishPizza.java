/* Kathy Zeng
 * 10/29/20
 * DeepDishPizza.java
 * Description: Create an own parameter from a variable. A variable
 * has been declare from Pizza.java called toppings with a keyword "super". 
   The constructor has been overloaded. This program is subclass.
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
	
