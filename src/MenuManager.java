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
			if (num == 1) {
				AddGrocery();
			}
			else if (num == 2) {
				DeleteGrocery();
			}
			else if (num == 3) {
				EditGrocery();
			}
			else if (num == 4) {
				ViewGrocery();
			}
			else {
				continue;
			}
		}

	}
	
	public static void AddGrocery() {
		Scanner input = new Scanner(System.in);
		System.out.print("Food Type : ");
		String FoodType = input.next();
		
		System.out.print("Food Name : ");
		String FoodName = input.next();
		
		System.out.print("Price : ");
		int Price = input.nextInt();
		
		System.out.print("Country of Origin : ");
		String ProductOrigin = input.next();
		
		System.out.print("Product No. : ");
		int ProductNo = input.nextInt();
	}
	
	public static void DeleteGrocery() {
		Scanner input = new Scanner(System.in);
		System.out.print("Product No. : ");
		int ProductNo = input.nextInt();
	}

	public static void EditGrocery() {
		Scanner input = new Scanner(System.in);
		System.out.print("Product No. : ");
		int ProductNo = input.nextInt();
	}
	
	public static void ViewGrocery() {
		Scanner input = new Scanner(System.in);
		System.out.print("Product No. : ");
		int ProductNo = input.nextInt();
	}
}