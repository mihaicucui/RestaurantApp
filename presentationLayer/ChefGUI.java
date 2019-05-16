package presentationLayer;

import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

import businessLayer.MenuItem;
import businessLayer.Order;

public class ChefGUI implements Observer {
	JFrame frame;
	JTextArea textArea;
	public ChefGUI() {
		frame=new JFrame("Chef");
		frame.setSize(700,700);
		textArea=new JTextArea();
		textArea.setPreferredSize(new Dimension(600,600));
		//textArea.setText("Scrie");
		JPanel pan=new JPanel();
		frame.setContentPane(pan);
		pan.add(textArea);
		frame.setVisible(true);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		HashMap<Order,List<MenuItem>> map= (HashMap<Order, List<MenuItem>>)arg;
		System.out.println("Here");
		String dePrintat;
		Iterator it=map.entrySet().iterator();
		Iterator<Order> itr = map.keySet().iterator();
		Iterator<List<MenuItem>> it2=map.values().iterator();
		textArea.setText("");
		while(itr.hasNext()&&it2.hasNext()) {
			textArea.append((itr.next()+"\n\t"+it2.next()+"\n"));
		}
		
//		while(it.hasNext()) {
//			Map<K, V>.Entry<K, V> pair=(Map.Entry<K, V>)it.next();
//		}
		
//		catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//textArea.setText(map.toString()+"\n");
		
	}

}
