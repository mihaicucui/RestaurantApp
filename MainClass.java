import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;

import businessLayer.BaseProduct;
import businessLayer.CompositeProduct;
import businessLayer.MenuItem;
import businessLayer.Order;
import businessLayer.Restaurant;
import controller.Controller;
import presentationLayer.AdminGUI;
import presentationLayer.ChefGUI;
import presentationLayer.MainGUI;
import presentationLayer.WaiterGUI;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<MenuItem> selectedList = new ArrayList<MenuItem>();
		List<MenuItem> ordersList = new ArrayList<MenuItem>();
		MenuItem b = new BaseProduct(13, "Salam", 23);
		MenuItem c = new CompositeProduct(15, "Crispy", 30);
		((CompositeProduct) c).adaugaContinut(b);
		System.out.println(((CompositeProduct) c).getContinut());
		Order o = new Order(1, 13);
		System.out.println(o);
		Restaurant restaurant = new Restaurant();
		ChefGUI chefGUI = new ChefGUI();
		restaurant.addObserver(chefGUI);
		AdminGUI adminGUI = new AdminGUI(restaurant);
		WaiterGUI waiterGUI = new WaiterGUI(restaurant);
		for (int i = 0; i < restaurant.getMenuItemList().size(); i++) {
			adminGUI.getMeniuBox().addItem(restaurant.getMenuItemList().get(i));
			waiterGUI.getComboBox().addItem(restaurant.getMenuItemList().get(i));
		}
		MainGUI mainGUI = new MainGUI(chefGUI, adminGUI, waiterGUI);
		Controller controller = new Controller(mainGUI, adminGUI, chefGUI, waiterGUI, selectedList, ordersList);
		System.out.println(restaurant.getMenuItemList());

	}

}
