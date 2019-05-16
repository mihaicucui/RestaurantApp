package presentationLayer;

import javax.swing.JButton;

import businessLayer.CompositeProduct;
import businessLayer.DateN;
import businessLayer.Restaurant;

import java.awt.Dimension;

import javax.swing.*;

public class AdminGUI {
	private Restaurant restaurant;
	private JTextField idBaseItem;
	private JTextField pretBaseItem;
	private JTextField nameBaseItem;
	private JTextField idCompItem;
	private JTextField pretCompItem;
	private JTextField nameCompItem;
	
	private JTextField idStergere;
	private JTextArea areaSelectate;
	
	JComboBox meniuBox;
	
	
	private JButton createCompItemButton;
	private JButton createBaseItemButton;
	private JButton selectFromCombo;
	
	private JButton deleteItemButton;
	private JButton editCompItemButton;
	private JButton editBaseItemButton;
	private JFrame frame;
	public AdminGUI(Restaurant restaurant) {
		this.restaurant=restaurant;
		frame=new JFrame("Admin");
		frame.setSize(800, 300);
		selectFromCombo=new JButton("Select");
		createCompItemButton=new JButton("Create Composite Item");
		createBaseItemButton=new JButton("Create Base Item");
		editBaseItemButton=new JButton("Edit Item By Id");
		editCompItemButton=new JButton("Edit Composite Item");
		deleteItemButton=new JButton("Delete Item");
		
		
		JPanel panouPrincipal=new JPanel();
		panouPrincipal.setLayout(new BoxLayout(panouPrincipal, BoxLayout.PAGE_AXIS));
		frame.setContentPane(panouPrincipal);
		//BaseItem:
		idBaseItem=new JTextField();
		idBaseItem.setPreferredSize(new Dimension(30,30));
		pretBaseItem=new JTextField();
		pretBaseItem.setPreferredSize(new Dimension(30,30));
		nameBaseItem=new JTextField();
		nameBaseItem.setPreferredSize(new Dimension(100,30));
		JPanel panouDelete=new JPanel();
		panouDelete.add(new JLabel("Sterge elementul cu ID:"));
		idStergere=new JTextField();
		idStergere.setPreferredSize(new Dimension(30,30));
		panouDelete.add(idStergere);
		panouDelete.add(deleteItemButton);
		panouPrincipal.add(panouDelete);
		
		JPanel panouAdaugareBaseItem=new JPanel();
		panouAdaugareBaseItem.add(new JLabel("Base Item:"));
		panouAdaugareBaseItem.add(new JLabel("Id:"));
		panouAdaugareBaseItem.add(idBaseItem);
		panouAdaugareBaseItem.add(new JLabel("Pret"));
		panouAdaugareBaseItem.add(pretBaseItem);
		panouAdaugareBaseItem.add(new JLabel("Name"));
		panouAdaugareBaseItem.add(nameBaseItem);
		panouAdaugareBaseItem.add(createBaseItemButton);
		panouAdaugareBaseItem.add(editBaseItemButton);
		
		
		meniuBox=new JComboBox();
		JPanel panouCombo=new JPanel();
		panouCombo.add(meniuBox);
		panouCombo.add(selectFromCombo);
		meniuBox.setPreferredSize(new Dimension(300,30));
		//meniuBox.addItem(new CompositeProduct(1, "mancare", 13));
		//meniuBox.addItem(new CompositeProduct(2, "mancare3", 13));
		panouPrincipal.add(panouAdaugareBaseItem);
		panouPrincipal.add(panouCombo);
		
		areaSelectate=new JTextArea();
		JPanel panouTextArea=new JPanel();
		panouTextArea.add(areaSelectate);
		
		panouPrincipal.add(areaSelectate);
		
		
		idCompItem=new JTextField();

		pretCompItem=new JTextField();

		nameCompItem=new JTextField();

		JPanel panAddComposite=new JPanel();
		panAddComposite.add(new JLabel("Id product:"));
		panAddComposite.add(idCompItem);
		panAddComposite.add(new JLabel("Product Name"));
		panAddComposite.add(nameCompItem);
		panAddComposite.add(new JLabel("Pret(optional):"));
		panAddComposite.add(pretCompItem);
		nameCompItem.setPreferredSize(new Dimension(100,30));
		pretCompItem.setPreferredSize(new Dimension(30,30));
		idCompItem.setPreferredSize(new Dimension(30,30));
		panAddComposite.add(createCompItemButton);
		//panAddComposite.add(editCompItemButton);
		panouPrincipal.add(panAddComposite);

		
		//frame.setVisible(true);
		
	}
	public JComboBox getMeniuBox() {
		return meniuBox;
	}
	public void setMeniuBox(JComboBox meniuBox) {
		this.meniuBox = meniuBox;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public JTextField getIdBaseItem() {
		return idBaseItem;
	}
	public void setIdBaseItem(JTextField idBaseItem) {
		this.idBaseItem = idBaseItem;
	}
	public JTextField getPretBaseItem() {
		return pretBaseItem;
	}
	public void setPretBaseItem(JTextField pretBaseItem) {
		this.pretBaseItem = pretBaseItem;
	}
	public JTextField getNameBaseItem() {
		return nameBaseItem;
	}
	public void setNameBaseItem(JTextField nameBaseItem) {
		this.nameBaseItem = nameBaseItem;
	}
	public JTextField getIdCompItem() {
		return idCompItem;
	}
	public void setIdCompItem(JTextField idCompItem) {
		this.idCompItem = idCompItem;
	}
	public JTextField getPretCompItem() {
		return pretCompItem;
	}
	public void setPretCompItem(JTextField pretCompItem) {
		this.pretCompItem = pretCompItem;
	}
	public JTextField getNameCompItem() {
		return nameCompItem;
	}
	public void setNameCompItem(JTextField nameCompItem) {
		this.nameCompItem = nameCompItem;
	}
	public JTextField getIdStergere() {
		return idStergere;
	}
	public void setIdStergere(JTextField idStergere) {
		this.idStergere = idStergere;
	}
	public JTextArea getAreaSelectate() {
		return areaSelectate;
	}
	public void setAreaSelectate(JTextArea areaSelectate) {
		this.areaSelectate = areaSelectate;
	}
	public JButton getCreateCompItemButton() {
		return createCompItemButton;
	}
	public void setCreateCompItemButton(JButton createCompItemButton) {
		this.createCompItemButton = createCompItemButton;
	}
	public JButton getCreateBaseItemButton() {
		return createBaseItemButton;
	}
	public void setCreateBaseItemButton(JButton createBaseItemButton) {
		this.createBaseItemButton = createBaseItemButton;
	}
	public JButton getSelectFromCombo() {
		return selectFromCombo;
	}
	public void setSelectFromCombo(JButton selectFromCombo) {
		this.selectFromCombo = selectFromCombo;
	}
	public JButton getDeleteItemButton() {
		return deleteItemButton;
	}
	public void setDeleteItemButton(JButton deleteItemButton) {
		this.deleteItemButton = deleteItemButton;
	}
	public JButton getEditCompItemButton() {
		return editCompItemButton;
	}
	public void setEditCompItemButton(JButton editCompItemButton) {
		this.editCompItemButton = editCompItemButton;
	}
	public JButton getEditBaseItemButton() {
		return editBaseItemButton;
	}
	public void setEditBaseItemButton(JButton editBaseItemButton) {
		this.editBaseItemButton = editBaseItemButton;
	}
	public JFrame getFrame() {
		return frame;
	}
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
}
