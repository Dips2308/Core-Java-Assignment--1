
import java.util.Scanner;

public class RetailStoreBill {

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Your Name: ");
			String name = sc.nextLine();
			System.out.print("Hello "+name+", Choose any option from below: ");
			System.out.print("\n1. Retail Store Employee \n2. Retail Store Affiliate \n3. Customer\n");
			int choice = sc.nextInt();
			System.out.println("\nHave you bought grocery items? \n1. yes \n2. no");
			int choiceGrocery = sc.nextInt();
			System.out.print("Enter Your Bill Amount: ");
			float bill = sc.nextFloat();
			
			
			if(choiceGrocery == 1) {
				bill = bill - (bill*5/100);
				System.out.println("Your Final Bill after Discount: "+bill);
			}
			
			if(choiceGrocery == 2) {
				switch(choice) {
					case 1:
						bill  = bill - bill*30/100;
						System.out.println("Your Final Bill after Discount: "+bill);break;
					case 2:
						bill  = bill - bill*10/100;
						System.out.println("Your Final Bill after Discount: "+bill);break;
					case 3:
						System.out.println("If you are a customer for more than 2 years? (1.Yes/2.No): ");
						int custOld = sc.nextInt();
						if(custOld==1) {
							bill = bill - bill*5/100;
							System.out.println("Your Final Bill after Discount: "+bill);
						}
						if(custOld==2) {
							bill = bill - (bill*5/100);
							System.out.println("Your Final Bill after Discount: "+bill);
						}
				}
			}
			
			
		}

	 }