/* Kathy Zeng
  10/29/20
  Food.java
  Desciption: At the sale: muffins baked with bananas will be sold for 50 cents each.
  With 12 muffin(s), $6.00 can be made.
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
