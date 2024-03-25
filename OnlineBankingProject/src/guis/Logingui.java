package guis;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import db_obs.MyJDBC;
import db_obs.USer;
public class Logingui extends BaseFrame {
	
	  public Logingui() 
	  {
		  super("Banking App Login");
	  }
	
	
	  @Override
	  protected  void addGuiComponents() {
		   JLabel  bankingAppLabel  =  new JLabel("Banking Application");
		   
		   
		   bankingAppLabel.setBounds(0, 20, super.getWidth(), 40);
		   bankingAppLabel.setFont(new Font("Dialog", Font.BOLD, 32));
		   bankingAppLabel.setHorizontalAlignment(SwingConstants.CENTER);
		   
		   add(bankingAppLabel);
		   
		   JLabel usernameLabel  = new JLabel("Username:");
		   
		   usernameLabel.setBounds(20, 120, getWidth()-30, 24 );
		   
		   
		   usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
		   add(usernameLabel);
		   
		   
		   JTextField usernameField  = new JTextField();
		   usernameField.setBounds(20, 160, getWidth() - 50, 40);
		   usernameField.setFont(new Font("Dialog", Font.PLAIN, 28));
		   add(usernameField);
		   
          
		   JLabel passwordLabel  = new JLabel("Password:");
		    passwordLabel.setBounds(20, 280, getWidth()-50, 24 );
		    passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
		    add(passwordLabel);
		    
		    
		    JPasswordField passwordField  = new JPasswordField();
		    passwordField.setBounds(20, 320, getWidth() - 50, 40);
		    passwordField.setFont(new Font("Dialog", Font.PLAIN, 28));
			   add(passwordField);
			   
			   
			   JButton loginButton = new JButton("Login");
			   loginButton.setBounds(20, 460, getWidth() - 50, 40);
			   loginButton.setFont(new Font("Dialog", Font.BOLD, 28-8));
			   loginButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String username = usernameField.getText();
					
					String Pasword  = String.valueOf(passwordField.getPassword());

					USer user = MyJDBC.validateLogin(username, Pasword);
					
					if(user!=null)
					{
						Logingui.this.dispose();
						
						BankAppGui bankingAppGui = new BankAppGui(user);
						
						bankingAppGui.setVisible(true);
						
						JOptionPane.showMessageDialog(bankingAppGui, "Login Successfully!");
						
					}
					
					else {
						JOptionPane.showMessageDialog(Logingui.this,  "Login failed...");
					}
				}
			});
				   add(loginButton);
		  
				   
				   JLabel registerLabel = new JLabel("<html> <a href =\"#\">Don't have an account? Register Here</a> </html>");
				   registerLabel.setBounds(0, 510, getWidth() - 10, 30);
				   registerLabel.setFont(new Font("Dialog", Font.PLAIN, 28-8));
				   registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
				   
				   registerLabel.addMouseListener(new MouseAdapter() {
			    
					
			
					
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						Logingui.this.dispose();
						
						new RegisterGui().setVisible(true);
						
					}
				});
					   add(registerLabel);
	  
	  
	  
	  
	  
	  
	  
	  
	  }

}
