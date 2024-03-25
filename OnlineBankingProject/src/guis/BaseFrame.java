package guis;

import javax.swing.*;

import db_obs.USer;
public  abstract class BaseFrame extends JFrame{
	
	
	protected USer user;
	public BaseFrame(String title)
	{
		initialize(title);
	}
	
	public BaseFrame(String title,  USer user)
	{
		this.user = user;
		initialize(title);
		
	}
	
	private void initialize(String title)
	{
		
		setTitle(title);
		
		
		setSize(420, 600);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	      setLayout(null);
	      
	      setResizable(false);
	      
	      setLocationRelativeTo(null);
	      
	      
	      addGuiComponents();
		
	}
	

	protected abstract void addGuiComponents();
}
