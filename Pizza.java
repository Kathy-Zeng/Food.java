/* Kathy Zeng
 * 10/29/20
   Pizza.java
*/ 
public class Pizza extends Food 
{
	public Pizza ()
	{
	}

	public Pizza(String toppings)
	{
      super("bake", toppings, "pizza");
  }

	public Pizza(String toppings, String style)
	{
      super("bake", toppings, style);
  }
}
	
