import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Grocery.Grocery;
import Grocery.GroceryInput;
import Grocery.GroceryKind;
import Grocery.FruitsGrocery;
import Grocery.VegetablesGrocery;
import Grocery.SnacksGrocery;
import Grocery.BeersGrocery;

public class GroceryManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2541376809500541596L;
	
	ArrayList<GroceryInput> groceries = new ArrayList<GroceryInput>();
	Grocery grocery;
	transient Scanner input;

	GroceryManager(Scanner input) {
		this.input = input;
	}

	public void AddGrocery() {
		int kind = 0;
		GroceryInput groceryInput;
		while (kind != 1 && kind != 2 && kind != 3 && kind != 4) {
			try {
				System.out.println("1 for Fruits");
				System.out.println("2 for Vegetables");
				System.out.println("3 for Snacks");
				System.out.println("4 for Beers");
				System.out.print("Select num for Grocery Kind between 1 and 4 : ");
				kind = input.nextInt();

				if (kind == 1) {
					groceryInput = new FruitsGrocery(GroceryKind.Fruits);
					groceryInput.getUserInput(input);
					groceries.add(groceryInput);
					break;
				}
				else if (kind == 2) {
					groceryInput = new VegetablesGrocery(GroceryKind.Vegetables);
					groceryInput.getUserInput(input);
					groceries.add(groceryInput);
					break;
				}
				else if (kind == 3) {
					groceryInput = new SnacksGrocery(GroceryKind.Snacks);
					groceryInput.getUserInput(input);
					groceries.add(groceryInput);
					break;
				}
				else if (kind == 4) {
					groceryInput = new BeersGrocery(GroceryKind.Beers);
					groceryInput.getUserInput(input);
					groceries.add(groceryInput);
					break;
				}
				else {
					System.out.print("Select num for Grocery Kind between 1 and 4 : ");
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 4!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}



		public void DeleteGrocery() {
			System.out.print("Product No : ");
			int ProductNo = input.nextInt();
			int index = findIndex(ProductNo);
			removefromGrocery(index, ProductNo);
		}

		public int findIndex(int ProductNo) {
			int index = -1;

			for(int i=0; i<groceries.size(); i++) {
				if (groceries.get(i).getProductno() == ProductNo) {
					index = i;
					break;
				}
			}
			return index;
		}

		public int removefromGrocery(int index, int ProductNo) {
			if(index >= 0) {
				groceries.remove(index);
				System.out.println("The grocery " + ProductNo + " is deleted");
				return 1;
			}
			else {
				System.out.println("The grocery has not been registered");
				return -1;
			}	
		}

		public void EditGrocery() {
			System.out.print("Product No : ");
			int ProductNo = input.nextInt();
			for (int i = 0; i<groceries.size();i++) {
				GroceryInput groceryInput = groceries.get(i);
				if (groceryInput.getProductno() == ProductNo) {
					int num = -1;
					while (num != 6) {

						showEditMenu();
						num = input.nextInt();

						switch(num) {
						case 1:
							grocery.setGroceryName(input);
							break;
						case 2:
							grocery.setGroceryDiscount(input);
							break;
						case 3:
							grocery.setGroceryPrice(input);
							break;
						case 4:
							grocery.setGroceryCountry(input);
							break;
						case 5:
							grocery.setGroceryProductno(input);
							break;
						default:
							continue;
						}
					}
					break;
				}
			}
		}

		public void ViewGroceries() {
			// System.out.print("Product No : ");
			// int ProductNo = input.nextInt();
			for(int i=0;i<groceries.size();i++) {
				groceries.get(i).printinfo();
			}
		}

		public void showEditMenu() {
			System.out.println("**Grocery Info Edit Menu**");
			System.out.println("1. Edit name");
			System.out.println("2. Edit discount rate");
			System.out.println("3. Edit price");
			System.out.println("4. Edit country");
			System.out.println("5. Edit number");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1-6 : ");
		}
	}