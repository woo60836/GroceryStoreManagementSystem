package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.GroceryManager;

public class WindowFrame extends JFrame {

	MenuSelection menuselection;
	GroceryAdder groceryadder;
	GroceryViewer groceryviewer;
	GroceryManager groceryManager;
	
	public WindowFrame(GroceryManager groceryManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.groceryManager = groceryManager;
		menuselection = new MenuSelection(this);
		groceryadder = new GroceryAdder(this);
		groceryviewer = new GroceryViewer(this, this.groceryManager);
		


		this.add(menuselection);
		
		this.setVisible(true);

	}
		
		public void setupPanel(JPanel panel) {
			this.getContentPane().removeAll();
			this.getContentPane().add(panel);
			this.revalidate();
			this.repaint();
		}
		
		public MenuSelection getMenuselection() {
			return menuselection;
		}

		public void setMenuselection(MenuSelection menuselection) {
			this.menuselection = menuselection;
		}

		public GroceryAdder getGroceryadder() {
			return groceryadder;
		}

		public void setGroceryadder(GroceryAdder groceryadder) {
			this.groceryadder = groceryadder;
		}

		public GroceryViewer getGroceryviewer() {
			return groceryviewer;
		}

		public void setGroceryviewer(GroceryViewer groceryviewer) {
			this.groceryviewer = groceryviewer;
		}

}
