package presentationLayer;

import java.awt.Dimension;

import javax.swing.*;

import businessLayer.BaseProduct;
import businessLayer.MenuItem;
import businessLayer.Restaurant;

public class WaiterGUI {
	private JFrame frame;
	private JButton select;
	private JButton comanda;
	private JTextArea textArea;
	private JComboBox comboBox;
	
	private JTextField id;
	private JTextField table;
	Restaurant restaurant;
	public WaiterGUI(Restaurant restaurant){
		this.restaurant=restaurant;
		//this.comboBox=comboBox;
		frame=new JFrame("Waiter");
		frame.setSize(400, 400);
		JPanel panPrinc=new JPanel();
		frame.setContentPane(panPrinc);
		select=new JButton("Select");
		comboBox=new JComboBox();
		//comboBox.addItem(new BaseProduct(1,"2",3));
//		comboBox.addItem(new BaseProduct(1,"2",3));
//		comboBox.addItem(new BaseProduct(1,"2",3));comboBox.addItem(new BaseProduct(1,"2",3));
//		comboBox.addItem(new BaseProduct(1,"2",3));comboBox.addItem(new BaseProduct(1,"2",3));
		comanda=new JButton("Comanda Produsele");	
		
		JPanel panCombo=new JPanel();
		panCombo.add(comboBox);
		panCombo.add(select);
		panPrinc.add(panCombo);
		
		JPanel panTextArea=new JPanel();
		textArea = new JTextArea(5, 20);
		JScrollPane scrollPane = new JScrollPane(textArea); 
		textArea.setEditable(false);
		//panTextArea.setLayout(new BoxLayout(panTextArea,BoxLayout.PAGE_AXIS));
		panPrinc.add(scrollPane);
		//panTextArea.add(comanda);
		//textArea.setPreferredSize(new Dimension(300,300));
		panTextArea.add(comanda);
		panPrinc.add(panTextArea);
		panPrinc.setLayout(new BoxLayout(panPrinc,BoxLayout.PAGE_AXIS));
	
		JPanel panouText=new JPanel();
		table=new JTextField();
		table.setPreferredSize(new Dimension(30,30));
		id=new JTextField();
		id.setPreferredSize(new Dimension(30,30));
		panouText.add(new JLabel("Id: "));
		panouText.add(id);
		panouText.add(new JLabel("Table Number: "));
		panouText.add(table);
		panPrinc.add(panouText);
		//frame.setVisible(true);
		
		
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public JTextField getId() {
		return id;
	}
	public void setId(JTextField id) {
		this.id = id;
	}
	public JTextField getTable() {
		return table;
	}
	public void setTable(JTextField table) {
		this.table = table;
	}
	public JFrame getFrame() {
		return frame;
	}
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	public JButton getSelect() {
		return select;
	}
	public void setSelect(JButton select) {
		this.select = select;
	}
	public JButton getComanda() {
		return comanda;
	}
	public void setComanda(JButton comanda) {
		this.comanda = comanda;
	}
	public JTextArea getTextArea() {
		return textArea;
	}
	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}
	public JComboBox getComboBox() {
		return comboBox;
	}
	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}
}
