import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GroceryManager grocerymanager = new GroceryManager(input);
		
		int num =  0;
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
				grocerymanager.AddGrocery();
			}
			else if (num == 2) {
				grocerymanager.DeleteGrocery();
			}
			else if (num == 3) {
				grocerymanager.EditGrocery();
			}
			else if (num == 4) {
				grocerymanager.ViewGrocery();
			}
			else {
				continue;
			}
		}

	}
	
}