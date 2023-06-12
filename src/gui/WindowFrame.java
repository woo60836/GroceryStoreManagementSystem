package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {

	MenuSelection menuselection;
	GroceryAdder groceryadder;
	GroceryViewer groceryviewer;
	GroceryManager groceryManager;
	
	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.groceryadder = new GroceryAdder(this);
		this.groceryviewer = new GroceryViewer(this);
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		this.setupPanel(menuselection);
		
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