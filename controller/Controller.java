package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import businessLayer.BaseProduct;
import businessLayer.CompositeProduct;
import businessLayer.MenuItem;
import businessLayer.Order;
import businessLayer.Restaurant;
import dataLayer.RestDeserialize;
import dataLayer.RestSerialize;
import presentationLayer.AdminGUI;
import presentationLayer.ChefGUI;
import presentationLayer.MainGUI;
import presentationLayer.WaiterGUI;

public class Controller {
	RestSerialize res=new RestSerialize();
	RestDeserialize des=new RestDeserialize();
	MainGUI mainGUI;
	AdminGUI adminGUI;
	ChefGUI chefGUI;
	WaiterGUI waiterGUI;
	List<MenuItem> itemsSelected;
	List<MenuItem> itemsForOrder;
	public Controller(MainGUI mainGUI,AdminGUI adminGUI,ChefGUI chefGUI,WaiterGUI waiterGUI,List<MenuItem> itemsSelected,List<MenuItem> itemsForOrder) {
		this.mainGUI=mainGUI;
		this.adminGUI=adminGUI;
		this.chefGUI=chefGUI;
		this.waiterGUI=waiterGUI;
		mainGUI.getAdminButton().addActionListener(new AdminViewListener());
		mainGUI.getWaiterButton().addActionListener(new SeeWaiter());
		adminGUI.getCreateBaseItemButton().addActionListener(new BaseItemCreationListener());
		adminGUI.getSelectFromCombo().addActionListener(new SelectItemsForComposite());
		adminGUI.getCreateCompItemButton().addActionListener(new AddSelectedItems());
		this.itemsSelected=itemsSelected;
		this.itemsForOrder=itemsForOrder;
		adminGUI.getDeleteItemButton().addActionListener(new DeleteItems());
		adminGUI.getEditBaseItemButton().addActionListener(new EditBaseItem());
		
		waiterGUI.getSelect().addActionListener(new SelectForOrders());
		waiterGUI.getComanda().addActionListener(new CreateOrder());
	}
	public class AdminViewListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			adminGUI.getFrame().setVisible(true);
		}
		
	}
	public class BaseItemCreationListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int id=Integer.parseInt(adminGUI.getIdBaseItem().getText());
			String name=adminGUI.getNameBaseItem().getText();
			int price=Integer.parseInt(adminGUI.getPretBaseItem().getText());
			
			MenuItem m=new BaseProduct(id,name,price);
			adminGUI.getRestaurant().addToMenuList(m);
			adminGUI.getMeniuBox().addItem(m);
			waiterGUI.getComboBox().addItem(m);
			System.out.println(adminGUI.getRestaurant().getMenuItemList());
			adminGUI.getRestaurant().getSer().serialize(adminGUI.getRestaurant().getMenuItemList());
		}
		
	}
	public class SelectItemsForComposite implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			MenuItem selectedItem=(MenuItem)( adminGUI.getMeniuBox().getSelectedItem());
			adminGUI.getAreaSelectate().setText(adminGUI.getAreaSelectate().getText()+"\n"+selectedItem);
			itemsSelected.add(selectedItem);
		}
		
	}
	public class AddSelectedItems implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//MenuItem m;
			//boolean hasPrice=false;
			int id=Integer.parseInt(adminGUI.getIdCompItem().getText());
			assert id!=0:1;
			String name=adminGUI.getNameCompItem().getText();
			assert name!="";
			List<MenuItem> aux=new ArrayList<MenuItem>();
			aux.addAll(itemsSelected);
			MenuItem m=new CompositeProduct(id,name,0,aux);
			itemsSelected.removeAll(itemsSelected);
			adminGUI.getMeniuBox().addItem(m);
			waiterGUI.getComboBox().addItem(m);
			adminGUI.getAreaSelectate().setText("");
			adminGUI.getRestaurant().addToMenuList(m);
//			if(adminGUI.getPretCompItem().getText()!="") {
//				System.out.println(adminGUI.getPretCompItem().getText());
//				m.setPrice(Integer.parseInt(adminGUI.getPretCompItem().getText()));
//			}
			adminGUI.getRestaurant().getSer().serialize(adminGUI.getRestaurant().getMenuItemList());
			System.out.println(adminGUI.getRestaurant().getMenuItemList());
		}
		
	}
	public class DeleteItems implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int id=Integer.parseInt(adminGUI.getIdStergere().getText());
			for(int i=0;i<adminGUI.getRestaurant().getMenuItemList().size();i++) {
				if(adminGUI.getRestaurant().getMenuItemList().get(i).getId()==id) {
					adminGUI.getMeniuBox().removeItem(adminGUI.getRestaurant().getMenuItemList().get(i));
					waiterGUI.getComboBox().removeItem(adminGUI.getRestaurant().getMenuItemList().get(i));
					adminGUI.getRestaurant().getMenuItemList().remove(i);
					adminGUI.getRestaurant().getSer().serialize(adminGUI.getRestaurant().getMenuItemList());

				}
			}
		}
		
	}
	public class EditBaseItem implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int id=Integer.parseInt(adminGUI.getIdBaseItem().getText());
			String name=adminGUI.getNameBaseItem().getText();
			int price=Integer.parseInt(adminGUI.getPretBaseItem().getText());
			for(int i=0;i<adminGUI.getRestaurant().getMenuItemList().size();i++) {
				if(adminGUI.getRestaurant().getMenuItemList().get(i).getId()==id) {
					MenuItem m=adminGUI.getRestaurant().getMenuItemList().get(i);
					m.setName(name);
					m.setPrice(price);
					adminGUI.getMeniuBox().update(adminGUI.getMeniuBox().getGraphics());
					waiterGUI.getComboBox().update(waiterGUI.getComboBox().getGraphics());
					adminGUI.getRestaurant().getSer().serialize(adminGUI.getRestaurant().getMenuItemList());

				}
			}
		}
		
	}
	
	public class SeeWaiter implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			waiterGUI.getFrame().setVisible(true);
		}
		
	}
	public class SelectForOrders implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			MenuItem selectedItem=(MenuItem)( waiterGUI.getComboBox().getSelectedItem());
			waiterGUI.getTextArea().setText(waiterGUI.getTextArea().getText()+"\n"+selectedItem);
			itemsForOrder.add(selectedItem);
		}
		
	}
	
	public class CreateOrder implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int id=Integer.parseInt(waiterGUI.getId().getText());
			int tableNumber=Integer.parseInt(waiterGUI.getTable().getText());

			List<MenuItem> aux=new ArrayList<MenuItem>();
			aux.addAll(itemsForOrder);
			Order o=new Order(id,tableNumber);
			itemsForOrder.removeAll(itemsForOrder);
			//adminGUI.getMeniuBox().addItem(m);
			//waiterGUI.getComboBox().addItem(m);
			waiterGUI.getTextArea().setText("");
			//adminGUI.getRestaurant().addToMenuList(m);
			waiterGUI.getRestaurant().addToOrdersMap(o, aux);
//			if(adminGUI.getPretCompItem().getText()!="") {
//				System.out.println(adminGUI.getPretCompItem().getText());
//				m.setPrice(Integer.parseInt(adminGUI.getPretCompItem().getText()));
			//waiterGUI.getRestaurant().
//			}
			System.out.println(waiterGUI.getRestaurant().getOrdersMap());
			
		}
		
	}
	
}
