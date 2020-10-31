/* Kathy Zeng
  10/29/20
  Food.java
  Desciption: At the sale: muffins baked with bananas will be sold for 50 cents each.
  With 12 muffin(s), $6.00 can be made. The constructor, Food has been overloaded to create
  a string statement. Inside the method, variable str has a statement with variables
  declaration from parameters. The class has been overrided
  with FoodTester.java as a super class, Pizza.java, and DeepDishPizza.java as subclasses.
  Food.java is super super class.
*/



public class Food
{
	protected String str;
    
	public Food ()
	{
		str = new String("");
	}
	
	public Food (String prepMethod, String ingredient, String name)
	{
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient;
	}

	public void printForSale()
	{
		System.out.println(str);
	}
  
  public void threeBL()
  {
     System.out.println("\n\n\n");
  }
}
