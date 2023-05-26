import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		GroceryManager groceryManager = getObject("groceryManager.ser");
		if (groceryManager == null) { {			
			groceryManager = new GroceryManager(input);
		}

		selectMenu(input, groceryManager);
		putObject(groceryManager, "groceryManager.ser");
			
		}
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
					logger.log("add a grocery");
					break;
				case 2:
					groceryManager.DeleteGrocery();
					logger.log("delete a grocery");
					break;
				case 3:
					groceryManager.EditGrocery();
					logger.log("edit a grocery");
					break;
				case 4:
					groceryManager.ViewGroceries();
					logger.log("view a grocery");
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
	
	public static GroceryManager getObject(String filename) {
		GroceryManager groceryManager = null;
		try {
			FileInputStream  file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			groceryManager = (GroceryManager) in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return groceryManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return groceryManager;
	}
	
	public static void putObject(GroceryManager groceryManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(groceryManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}