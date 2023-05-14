package Grocery;

import java.util.Scanner;

public interface GroceryInput {
	
	public int getProductno();
	
	public void setName(String name);
	
	public void setDiscount(int discount);
	
	public void setPrice(int price);
	
	public void setCountry(String country);
	
	public void setProductno(int productno);
	
	public void getUserInput(Scanner input);
	
	public void printinfo();
}
