import static java.lang.System.*;

/*
	
	Julian Tiu
	Oct. 9, 2015

*/

public class JulianTiuExerciseTwentyOne
{	
	public static void main(String[]args) throws Exception 
	{
		for(int crust = 0; crust < 5; crust++)
		{
			String crustName;
			switch(crust)
			{
				case 0: crustName = "Hand Tossed";
						break;
				case 1: crustName = "Deep Dish";
						break;
				case 2: crustName = "Thin";
						break;
				case 3: crustName = "Stuffed";
						break;
				case 4: crustName = "Pan";
						break;
				default: crustName = "We don't have that type of dough";
						break;
			}
			for(int topping = 0; topping < 6; topping++)
			{
				String toppingName;
				switch(topping)
				{
					case 0: toppingName = "Pepperoni";
							break;
					case 1: toppingName = "Sausage";
							break;
					case 2: toppingName = "Ham";
							break;
					case 3: toppingName = "Chicken";
							break;
					case 4: toppingName = "All Cheese";
							break;
					case 5: toppingName = "Veggies";
							break;
					default: toppingName = "We don't serve that topping";
							break;
				}
				
				out.println("Get "+crustName+" pizza with "+toppingName+" toppings.");
			}
		}
	}
}