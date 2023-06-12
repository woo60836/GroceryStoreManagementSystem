package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Grocery.GroceryInput;
import manager.GroceryManager;

public class GroceryViewer extends JPanel {
	
	WindowFrame frame;

	GroceryManager groceryManager;

	
	public GroceryViewer(WindowFrame frame, GroceryManager groceryManager) {
		this.groceryManager = groceryManager;
		this.frame = frame;
		
		System.out.println("***" + groceryManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Price");
		model.addColumn("Country");
		model.addColumn("Product No.");
		
		for (int i=0;i<groceryManager.size();i++) {
			Vector row = new Vector();
			GroceryInput gi = groceryManager.get(i);
			row.add(gi.getName());
			row.add(gi.getPrice());
			row.add(gi.getCountry());
			row.add(gi.getProductno());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}