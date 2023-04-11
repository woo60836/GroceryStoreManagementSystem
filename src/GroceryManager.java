import java.util.Scanner;

public class GroceryManager {
	Grocery grocery;
	Scanner input;
	
	GroceryManager(Scanner input) {
		this.input = input;
	}

	public void AddGrocery() {
		grocery = new Grocery();
		System.out.print("Food Type : ");
		grocery.type = input.next();
		
		System.out.print("Food Name : ");
		grocery.name = input.next();
		
		System.out.print("Price : ");
		grocery.price = input.nextInt();
		
		System.out.print("Country of Origin : ");
		grocery.country = input.next();
		
		System.out.print("Product No. : ");
		grocery.productno = input.nextInt();
	}
	
	public void DeleteGrocery() {
		System.out.print("Product No. : ");
		int ProductNo = input.nextInt();
		if (grocery == null) {
			System.out.println("The grocery has not been registered");
			return;
		}
		if (grocery.productno == ProductNo) {
			grocery = null;
			System.out.println("The grocery is deleted");
		}
	}

	public void EditGrocery() {
		System.out.print("Product No. : ");
		int ProductNo = input.nextInt();
		if (grocery.productno == ProductNo) {
			System.out.println("The grocery to be edited is " + ProductNo);
		}
	}
	
	public void ViewGrocery() {
		System.out.print("Product No. : ");
		int ProductNo = input.nextInt();
		if (grocery.productno == ProductNo) {
			grocery.printinfo();
		}
	}
}
