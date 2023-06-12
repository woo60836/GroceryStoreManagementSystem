package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class GroceryAdder extends JPanel {
	
	WindowFrame frame;
	
	public GroceryAdder(WindowFrame frame) {
		this.frame = frame;
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelPrice = new JLabel("Price : ", JLabel.TRAILING);
		JTextField fieldPrice = new JTextField(10);
		labelPrice.setLabelFor(fieldPrice);
		panel.add(labelPrice);
		panel.add(fieldPrice);

		JLabel labelCountry = new JLabel("Country : ", JLabel.TRAILING);
		JTextField fieldCountry = new JTextField(10);
		labelCountry.setLabelFor(fieldCountry);
		panel.add(labelCountry);
		panel.add(fieldCountry);
		
		JLabel labelProductNo = new JLabel("ProductNo : ", JLabel.TRAILING);
		JTextField fieldProductNo = new JTextField(10);
		labelProductNo.setLabelFor(fieldProductNo);
		panel.add(labelProductNo);
		panel.add(fieldProductNo);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		

		
		this.add(panel);
		this.setVisible(true);
	}

	
}