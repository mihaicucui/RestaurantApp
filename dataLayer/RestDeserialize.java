package dataLayer;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import businessLayer.MenuItem;
public class RestDeserialize implements Serializable{

	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public List<MenuItem> deserialize() {
		  List<MenuItem> listaDes;
	      try {
	         FileInputStream fileIn = new FileInputStream("meniu.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         listaDes = (ArrayList<MenuItem>) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (Exception i) {
	         i.printStackTrace();
	         return null;
	      }
		return listaDes;
	      
	      
	   }
	}
