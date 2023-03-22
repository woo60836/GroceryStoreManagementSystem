import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num =  0;
		Scanner input = new Scanner(System.in);

		while (num != 6) {
			System.out.println("*** GroceryStore Management System Menu ***");
			System.out.println("1. Add Grocery"); // food type, food name, price, origin, prduct no.
			System.out.println("2. Delete Grocery");
			System.out.println("3. Edit Grocery");
			System.out.println("4. View Grocery");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1-6 : ");
			num = input.nextInt(); 

			switch(num) {
			case 1:
				System.out.print("Food Type : ");
				String FoodType = input.next();

				System.out.print("Food Name : ");
				String FoodName = input.next();	
				
				System.out.print("Price : ");
				int Price = input.nextInt();
				
				System.out.print("Country of Origin : ");
				String Origin = input.next();
				
				System.out.print("Product No. : ");
				int ProductNo = input.nextInt();
				break;
				
			case 2:
				System.out.print("Product.No : ");
				int ProductNo2 = input.nextInt();
				break;
				
			case 3:
				System.out.println("Product.No : ");
				int ProductNo3 = input.nextInt();
				break;
				
			case 4:
				System.out.println("Product.No : ");
				int ProductNo4 = input.nextInt();
				break;
				
			}
		}

	}
}
