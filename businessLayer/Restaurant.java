package businessLayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;

import dataLayer.RestDeserialize;
import dataLayer.RestSerialize;

public class Restaurant extends Observable {
	private List<MenuItem> menuItemList;
	//
	//private List<Order> orderList;
	private HashMap<Order, List<MenuItem>> ordersMap;
	RestDeserialize des=new RestDeserialize();
	RestSerialize ser=new RestSerialize();

	public RestDeserialize getDes() {
		return des;
	}
	public void setDes(RestDeserialize des) {
		this.des = des;
	}
	public RestSerialize getSer() {
		return ser;
	}
	public void setSer(RestSerialize ser) {
		this.ser = ser;
	}
	public Restaurant(List<MenuItem> menuItemList, HashMap<Order,List<MenuItem>> ordersMap) {
		super();
		this.menuItemList = menuItemList;
		this.ordersMap=ordersMap;
		//this.orderList=orderList;
	}
	public Restaurant() {
		menuItemList=new ArrayList<MenuItem>();
		menuItemList.add(new BaseProduct(1,"cane",13));
		ordersMap = new HashMap<Order, List<MenuItem>>();
		menuItemList=des.deserialize();
	}

	public void addToOrdersMap(Order o,List<MenuItem> items) {
		ordersMap.put(o, items);
		setChanged();
		notifyObservers(ordersMap);
	}
	public void removeFromOrdersMap(Order o) {
		ordersMap.remove(o);
	}
	public void addToMenuList(MenuItem m) {
		menuItemList.add(m);
	}
	public void removeFromMenuList(MenuItem m) {
		menuItemList.remove(m);
	}
//	public void addToOrderList(Order o) {
//		orderList.add(o);
//	}
//	public void removeFromOrderList(Order o) {
//		orderList.remove(o);
//	}
//	public List<Order> getOrderList() {
//		return orderList;
//	}

//	public void setOrderList(List<Order> orderList) {
//		this.orderList = orderList;
//	}

	public List<MenuItem> getMenuItemList() {
		return menuItemList;
	}

	public HashMap<Order, List<MenuItem>> getOrdersMap() {
		return ordersMap;
	}
	public void setOrdersMap(HashMap<Order, List<MenuItem>> ordersMap) {
		this.ordersMap = ordersMap;
	}
	public void setMenuItemList(List<MenuItem> menuItemList) {
		this.menuItemList = menuItemList;
	}

	
	
	
}
