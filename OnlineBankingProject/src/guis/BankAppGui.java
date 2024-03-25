package guis;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import guis.BankingAppDialog.*;
import javax.swing.*;

import db_obs.USer;

public class BankAppGui extends BaseFrame implements ActionListener{

	
	 private JTextField currentBalanceField;
	 public JTextField getCurrentBalance() { return currentBalanceField;}
//	public BankAppGui() {
//		super(title);
//		// TODO Auto-generated constructor stub
//	}
	
	public BankAppGui(USer user)
	{
		super("Banking App", user);
	}

	@Override
	protected void addGuiComponents() {
		
		
		
		String welcomeMessage = "<html>" + 
		 "<body style = 'text-align:center'>" + "<b>Hello " + user.getUsername() + "</b> <br>" + 
				"what would like to do today?</body><html/>";
		
		
		JLabel welcomeMessegeLabel = new JLabel(welcomeMessage);
		welcomeMessegeLabel.setBounds(0, 20, getWidth() -10, 40);
		
		welcomeMessegeLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		welcomeMessegeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(welcomeMessegeLabel);
		
		JLabel currentBalanceLabel = new JLabel("Current Balance");
		currentBalanceLabel.setBounds(0, 80, getWidth() -10, 30);
		
		currentBalanceLabel.setFont(new Font("Dialog", Font.BOLD, 22));
		
		currentBalanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(currentBalanceLabel);
//		add(currentBalanceLabel);
		
		
		currentBalanceField = new JTextField("₹" + user.getCurrentBalance());
		currentBalanceField.setBounds(15, 120, getWidth() - 50, 40);
		
		currentBalanceField.setFont(new Font("Dialog", Font.BOLD, 28));
		
		currentBalanceField.setHorizontalAlignment(SwingConstants.RIGHT);
		
		currentBalanceField.setEditable(false);
		add(currentBalanceField);
		
		
		JButton depositButton = new JButton("Deposit");
		depositButton.setBounds(15, 180, getWidth() - 50, 50);
		
		depositButton.setFont(new Font("Dialog", Font.BOLD, 22));
		depositButton.addActionListener(this);
		
		add(depositButton);
		
		JButton withdrawlButton = new JButton("Withdrawl");
		  withdrawlButton.setBounds(15, 250, getWidth() - 50, 50);
	     withdrawlButton.setFont(new Font("Dialog", Font.BOLD, 22));
	     withdrawlButton.addActionListener(this);

	     
	     add(withdrawlButton);
		
		 JButton pastTranscationButton = new JButton("Past Transaction");
		 pastTranscationButton.setBounds(15, 320, getWidth() - 50, 50);
		 pastTranscationButton.setFont(new Font("Dialog", Font.BOLD, 22));
		 pastTranscationButton.addActionListener(this);

		     add(pastTranscationButton);
	
		     
		      JButton TransferButton = new JButton("Transfer");
		      TransferButton.setBounds(15, 390, getWidth() - 50, 50);
		      TransferButton.setFont(new Font("Dialog", Font.BOLD, 22));
		      TransferButton.addActionListener(this);

			     add(TransferButton);
			     
			     JButton logoutButton = new JButton("Logout");
			     logoutButton.setBounds(15, 500, getWidth() - 50, 50);
			     logoutButton.setFont(new Font("Dialog", Font.BOLD, 22));
			     logoutButton.addActionListener(this);

				     add(logoutButton);
		
	}
	
 
	  @Override
	  public void actionPerformed(ActionEvent e)
	  {
//		  new BankingAppDialog(this, user).setVisible(true);;
		  
		  String buttonPresed = e.getActionCommand();
		  
		  if(buttonPresed.equalsIgnoreCase("Logout"))
		  {
			  new Logingui().setVisible(true);
			  this.dispose();
			  
			  return;
			  
		  }
		  
		  BankingAppDialog bankingAppDialog  = new BankingAppDialog(this, user);
		  
		  bankingAppDialog.setTitle(buttonPresed);
		  
		  if(buttonPresed.equalsIgnoreCase("Deposit") || buttonPresed.equalsIgnoreCase("Withdrawl")||
				   buttonPresed.equalsIgnoreCase("Transfer"))
		  {
			  bankingAppDialog.addCurrentBalanceAndAmount();
              bankingAppDialog.addActionButton(buttonPresed);
              
              
              if(buttonPresed.equalsIgnoreCase("Transfer"))
              {
            	  bankingAppDialog.addUserField();
            	  
            	  
              }
              bankingAppDialog.setVisible(true);
		  }
		 
	  }
	  
	  
	  
}
