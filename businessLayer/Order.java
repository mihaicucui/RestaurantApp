package businessLayer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private int id;
	private DateN date;
	private int tableNumber;
	private List<MenuItem> orderedProducts;
	private int totalPrice;
	public Order(int id, int tableNumber,DateN date, List<MenuItem> orderedProducts,int totalPrice) {
		this.id=id;
		this.tableNumber=tableNumber;
		this.date=date;
		this.orderedProducts=orderedProducts;
		this.totalPrice=totalPrice;
	}
	public Order(int id, int tableNumber) {
		this.id=id;
		this.tableNumber=tableNumber;
		this.date=new DateN();
		orderedProducts=new ArrayList<MenuItem>();
	}
	
	public void addToOrderProducts(MenuItem m) {
		orderedProducts.add(m);
	}
	public void removeOrderProduct(MenuItem m) {
		orderedProducts.remove(m);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public DateN getDate() {
		return date;
	//	Date d=new Date(int year, int month, int date, int hrs, int min, int sec)
	}
	public void setDate(DateN date) {
		this.date = date;
	}
	public int getTableNumber() {
		return tableNumber;
	}
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
	public String toString() {
		return "Id: "+this.id+", table number:"+this.tableNumber+", "+"Data: "+date.getDayName()+", "+(date.getMonthName())+", "+date.getHours()+":"+date.getMinutes();
	}
	public int hashCode() {
		return this.id;
		
	}
	public boolean equals(Object o) {
		if(this.id==((Order)o).getId()) return true;
		else return false;
	}

	
}
