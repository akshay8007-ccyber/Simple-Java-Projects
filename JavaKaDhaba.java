import java.util.Scanner;
class JavaKaDhaba
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String foodItems = "";
		double totalBill = 0 ;
		System.out.println("			*** MELOCME ****");
		System.out.println("			JAVA KA DHABA ");
		System.out.println("");
		System.out.println("");
		// INFINTE LOOP FOR MAIN MENU
		for ( ; ; )
		{
			System.out.println();
			System.out.println("MENU 1. VEG 2. NON-VEG 3. Checkout 4. LOGOUT"); 
			System.out.print("Enter your option : ");
			int option = sc.nextInt();
			System. out.println();
			// this else if block is for veg menu
			if(option==1)
			{
				// INFINE Loop for veg menu Loop will break if user enters 5
				for( ; ; )
				{
					System.out.println("*** VEG MENU *** ");
					System.out.println("1.PANEER TIKKA 2.KAJU CARRY 3.VEG-BIRYANI 4. VEG-KOFTA 5.MAIN MENU");
					System.out.println();
					System.out.println("Enter yout option : ");
					int option1 = sc.nextInt();
					if(option1==1)
					{
						foodItems += "PANEER TIKKA : 250";
						totalBill += 250;
						System.out.println("your order has been added to cart.");
					}
					else if(option1==2)
					{
						foodItems += "KAJU CURRY : 280";
						totalBill += 280;
						System.out.println("your order has been added to cart.");
					}
					else if(option1==3)
					{
						foodItems += "VEG-BIRYANI : 180";
						totalBill += 180;
						System.out.println("your order has been added to cart.");
					}
					else if(option1==4)
					{
						foodItems += "VEG-KOFTA : 210";
						totalBill += 210;
						System.out.println("your order has been added to cart.");
					}
					else if(option1==5)
					{
						break;
					}
				}	
			}
			else if(option==2)
			{
				System.out.println("*** NON VEG MENU *** ");
				// INFINE Loop for non veg menu Loop will break if user enters 5
				for( ; ; )
				{
					System.out.println("1.BUTTER CHICKEN 2.CHICKEN MASALA 3.CHICKEN-BIRYANI 4.FISH 5.MAIN MENU");
					System.out.println();
					System.out.println("Enter yout option : ");
					int option1 = sc.nextInt();
					if(option==1)
					{
						foodItems += "BUTTER CHICKEN : 300";
						totalBill += 300;
						System.out.println("your order has been added to cart.");
					}
					else if(option1==2)
					{
						foodItems += "CHICKEN MASALA : 270";
						totalBill += 270;
						System.out.println("your order has been added to cart.");
					}
					else if(option1==3)
					{
						foodItems += "CHICKEN-BIRYANI : 200";
						totalBill += 200;
						System.out.println("your order has been added to cart.");
					}
					else if(option1==4)
					{
						foodItems += "FISH : 400";
						totalBill += 400;
						System.out.println("your order has been added to cart.");
					}
					else if(option1==5)
					{
						break;
					}
				}
			}
			else if(option==3)
			{
				System.out.println("*** YOUR TOTAL BILL ***");
				System.out.println();
				System.out.println("Your purchase items below: ");
				System.out.println(foodItems);
				System.out.println("Total bill : "+totalBill+" rs");
				if(totalBill>=2000)
				{
					System.out.println("You got as discount of 20%");
					System.out.println("Your bill is : "+(totalBill-((totalBill/100)*20)));
				}
				else if(totalBill>=1000)
				{
					System.out.println("You got as discount of 10%");
					System.out.println("Your bill is : "+(totalBill-((totalBill/100)*10)));
				}
				else if(totalBill>=500)
				{
					System.out.println("You got as discount of 5%");
					System.out.println("Your bill is : "+(totalBill-((totalBill/100)*5)));
				}
			}
			else if(option==4)
			{
				System.out.println("Thank you Visit again");
				break;
			}
			System.out.println();
		}	
	}
}