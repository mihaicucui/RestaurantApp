package dataLayer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

import businessLayer.MenuItem;

public class RestSerialize implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void serialize(List<MenuItem> m){
		try {
		FileOutputStream fileOut =new FileOutputStream("meniu.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(m);
        out.close();
        fileOut.close();
		}catch(Exception i) {
			i.printStackTrace();
		}
	}
}
