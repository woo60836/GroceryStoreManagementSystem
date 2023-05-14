import java.util.ArrayList;
import java.util.Scanner;

import Grocery.Grocery;
import Grocery.GroceryInput;
import Grocery.GroceryKind;
import Grocery.FruitsGrocery;
import Grocery.VegetablesGrocery;
import Grocery.SnacksGrocery;
import Grocery.BeersGrocery;

public class GroceryManager {
	ArrayList<GroceryInput> groceries = new ArrayList<GroceryInput>();
	Grocery grocery;
	Scanner input;
	
	GroceryManager(Scanner input) {
		this.input = input;
	}

	public void AddGrocery() {
		int kind = 0;
		GroceryInput groceryInput;
		while (kind != 1 && kind != 2 && kind != 3 && kind != 4) {
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
	}
	
	public void DeleteGrocery() {
		System.out.print("Product No : ");
		int ProductNo = input.nextInt();
		int index = -1;
		
		for(int i=0; i<groceries.size(); i++) {
			if (groceries.get(i).getProductno() == ProductNo) {
				index = i;
				break;
			}
		}
		if(index >= 0) {
			groceries.remove(index);
			System.out.println("The grocery " + ProductNo + " is deleted");
		}
		else {
			System.out.println("The grocery has not been registered");
			return;
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
					System.out.println("**Grocery Info Edit Menu**");
					System.out.println("1. Edit type");
					System.out.println("2. Edit name");
					System.out.println("3. Edit price");
					System.out.println("4. Edit country");
					System.out.println("5. Edit number");
					System.out.println("6. Exit");
					System.out.print("Select one number between 1-6 : ");
					num = input.nextInt();
					
					if(num == 1) {
						System.out.print("Food Name : ");
						String name = input.next();	
						groceryInput.setName(name);
					}
					
					else if(num == 2) {
						System.out.print("Discount rate : ");
						int discount = input.nextInt();
						groceryInput.setDiscount(discount);
					}
					else if(num == 3) {
						System.out.print("Price : ");
						int price = input.nextInt();
						groceryInput.setPrice(price);
					}
					else if(num == 4) {
						System.out.print("Country of Origin : ");
						String country = input.next();
						groceryInput.setCountry(country);
					}
					else if(num == 5) {
						System.out.print("Product No : ");
						int productno = input.nextInt();
						groceryInput.setProductno(productno);
					}
					else {
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
}