package businessLayer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CompositeProduct extends MenuItem implements Serializable {
	List<MenuItem> continut;
	public CompositeProduct(int id, String name, int price,List<MenuItem> continut) {
		super(id, name, price);
		// TODO Auto-generated constructor stub
		this.continut=continut;
		this.setPrice(this.computePrice());
	}
	public CompositeProduct(int id, String name, int price) {
		super(id, name, price);
		// TODO Auto-generated constructor stub
		continut=new ArrayList<MenuItem>();
	}

	public List<MenuItem> getContinut() {
		return continut;
	}
	public void setContinut(List<MenuItem> continut) {
		this.continut = continut;
	}
	public void adaugaContinut(MenuItem m) {
		continut.add(m);
	}
	public void stergeContinut(MenuItem m) {
		continut.remove(m);
	}
	
	
	@Override
	public int computePrice() {
		// TODO Auto-generated method stub
		int sum=0;
		for(MenuItem m: continut) {
			sum+=m.getPrice();
		}
		return sum;
	}

}
