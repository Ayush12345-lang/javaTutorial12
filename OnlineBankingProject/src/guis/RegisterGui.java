package guis;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import db_obs.MyJDBC;

public class RegisterGui extends BaseFrame {

	
	   public RegisterGui()
	   {
		   super("Banking App Registration");
	   }
	   
	   @Override
	   protected void addGuiComponents()
	   {
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
		    passwordLabel.setBounds(20, 220, getWidth()-50, 24 );
		    passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
		    add(passwordLabel);
		    
		    
		    JPasswordField passwordField  = new JPasswordField();
		    passwordField.setBounds(20, 260, getWidth() - 50, 40);
		    passwordField.setFont(new Font("Dialog", Font.PLAIN, 28));
			   add(passwordField);
			   
			   
			   JLabel rePasswordLabel  = new JLabel("Re-type Password:");
			   rePasswordLabel.setBounds(20, 320, getWidth() - 50, 40);
			   rePasswordLabel.setFont(new Font("Dialog", Font.PLAIN, 28-8));
				   add(rePasswordLabel);
				    
				   JPasswordField repasswordField  = new JPasswordField();
				   repasswordField.setBounds(20, 360, getWidth() - 50, 40);
				   repasswordField.setFont(new Font("Dialog", Font.PLAIN, 28));
					   add(repasswordField);
			   
			   
			   JButton registerButton = new JButton("Register");
			   registerButton.setBounds(20, 460, getWidth() - 50, 40);
			   registerButton.setFont(new Font("Dialog", Font.BOLD, 28-8));
			   registerButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {

					String username = usernameField.getText();
					String password = String.valueOf(passwordField.getPassword());
					
					String repassword = String.valueOf(repasswordField.getPassword());
					
					if(validateUserInput(username, password, repassword))
					{
						 if(MyJDBC.register(username, password))
						 {
					  System.out.println("Passed");
							 RegisterGui.this.dispose();
							 
							 Logingui logingui = new Logingui();
							 logingui.setVisible(true);
							 
							 JOptionPane.showMessageDialog(logingui, "Registered Account Successfully! ");
						 } else {
							 
							 System.out.println("Failed");
							 JOptionPane.showMessageDialog(RegisterGui.this, "Error: Username Already Exists. ");
						 }
					}
					
					else {
						JOptionPane.showMessageDialog(RegisterGui.this,  "Error: Username must be atleast 6 characters\n" + "and / or Password must match");
					}

				}
			});
				   add(registerButton);
		  
				   
				   JLabel loginLabel = new JLabel("<html> <a href =\"#\">Have an account? Sign-in here</a> </html>");
				   loginLabel.setBounds(0, 510, getWidth() - 10, 30);
				   loginLabel.setFont(new Font("Dialog", Font.PLAIN, 28-8));
				   loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
				   loginLabel.addMouseListener(new MouseAdapter() {
				
					   @Override
				         public void mouseClicked(MouseEvent e)
				         {
				        	 
				        	 RegisterGui.this.dispose();
				        	 
				        	 new Logingui().setVisible(true);
				         }
			
				   });
					   add(loginLabel);
	   }
		   
	   
	   
	   private boolean validateUserInput(String username, String password, String rePassword )
	   {
		   if(username.length() == 0 || password.length() == 0 || rePassword.length() == 0)
		   {
			   return false;
		   }
		   
		   if(username.length() <6) return false;
		   
		   if(!password.equals(rePassword)) return false;
			    
		   
		   return true;
	   }
	   
      
}

