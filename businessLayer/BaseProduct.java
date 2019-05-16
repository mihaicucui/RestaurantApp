package businessLayer;

import java.io.Serializable;

public class BaseProduct extends MenuItem implements Serializable {

	public BaseProduct(int id,String name,int price) {
		super(id,name,price);
	}
	
	
	@Override
	public int computePrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
