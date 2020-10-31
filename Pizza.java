/* Kathy Zeng
 * 10/29/20
   Pizza.java
   Description: This program has a default constructor in order to pass
   in a parameter. This program is subclass.
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
	
