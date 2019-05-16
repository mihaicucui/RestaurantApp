package presentationLayer;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainGUI {
	private JFrame principalFrame;
	private ChefGUI chefGUI;
	private AdminGUI adminGUI;
	private WaiterGUI waiterGUI;
	private JButton adminButton;
	private JButton chefButton;
	private JButton waiterButton;
	public MainGUI(ChefGUI chefGUI, AdminGUI adminGUI, WaiterGUI waiterGUI) {
		principalFrame=new JFrame();
		principalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminButton=new JButton("Administrator");
		chefButton=new JButton("Chef");
		waiterButton=new JButton("Waiter");
		//adminButton.setBackground(Color);
		
		principalFrame.setSize(400,400);
		principalFrame.setVisible(true);

		JPanel panouPrincipal=new JPanel();
		principalFrame.setContentPane(panouPrincipal);
		panouPrincipal.setLayout(new GridLayout(3,1));
		panouPrincipal.add(adminButton);
		panouPrincipal.add(waiterButton);
		panouPrincipal.add(chefButton);

		
	}
	public JFrame getPrincipalFrame() {
		return principalFrame;
	}
	public void setPrincipalFrame(JFrame principalFrame) {
		this.principalFrame = principalFrame;
	}
	public ChefGUI getChefGUI() {
		return chefGUI;
	}
	public void setChefGUI(ChefGUI chefGUI) {
		this.chefGUI = chefGUI;
	}
	public AdminGUI getAdminGUI() {
		return adminGUI;
	}
	public void setAdminGUI(AdminGUI adminGUI) {
		this.adminGUI = adminGUI;
	}
	public WaiterGUI getWaiterGUI() {
		return waiterGUI;
	}
	public void setWaiterGUI(WaiterGUI waiterGUI) {
		this.waiterGUI = waiterGUI;
	}
	public JButton getAdminButton() {
		return adminButton;
	}
	public void setAdminButton(JButton adminButton) {
		this.adminButton = adminButton;
	}
	public JButton getChefButton() {
		return chefButton;
	}
	public void setChefButton(JButton chefButton) {
		this.chefButton = chefButton;
	}
	public JButton getWaiterButton() {
		return waiterButton;
	}
	public void setWaiterButton(JButton waiterButton) {
		this.waiterButton = waiterButton;
	}
	
}
