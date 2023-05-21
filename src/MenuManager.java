import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GroceryManager groceryManager = new GroceryManager(input);

		selectMenu(input, groceryManager);
	}

	public static void selectMenu(Scanner input, GroceryManager groceryManager) {
		int num = -1;
		while (num != 6) {
			try {
				showMenu();
				num = input.nextInt(); 
				switch(num) {
				case 1:
					groceryManager.AddGrocery();
					break;
				case 2:
					groceryManager.DeleteGrocery();
					break;
				case 3:
					groceryManager.EditGrocery();
					break;
				case 4:
					groceryManager.ViewGroceries();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Pleaase put an integer between 1 and 6!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("*** GroceryStore Management System Menu ***");
		System.out.println("1. Add Grocery"); 
		System.out.println("2. Delete Grocery");
		System.out.println("3. Edit Grocery");
		System.out.println("4. View Groceries");
		System.out.println("5. Show a Menu");
		System.out.println("6. Exit");
		System.out.print("Select one number between 1-6 : ");
	}
}