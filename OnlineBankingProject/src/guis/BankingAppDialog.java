package guis;


import db_obs.*;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.*;

public class BankingAppDialog extends JDialog implements ActionListener {
 
	   private USer user;

	   private BankAppGui bankingAppGui;
	   private JLabel balanceLabel, enterAmountLabel,enterUserLabel;
	   private JTextField enterAmountField, enterUserField;
	   private JButton actionButton;
	   
	   public BankingAppDialog(BankAppGui bankingAppGui,  USer user )
	   {
		   
		   
		   
		   setSize(600, 400);
		   
		   setModal(true);
		   
		   setLocationRelativeTo(bankingAppGui);
		   
		   
		   setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		   
		   setResizable(false);

		   setLayout(null);
		   
		   this.bankingAppGui = bankingAppGui;
		   
		   this.user = user;
	   }
	   
	   
	   public void addCurrentBalanceAndAmount()
	   {
		   
		       balanceLabel = new JLabel("Balance: ₹" + user.getCurrentBalance());
		       balanceLabel.setBounds(0, 10, getWidth() - 20, 20);
		       balanceLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		       balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		       add(balanceLabel);
		   
		       enterAmountLabel = new JLabel("Enter Amount:");
		       enterAmountLabel.setBounds(0, 50, getWidth() - 20, 20);
		       enterAmountLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		       enterAmountLabel.setHorizontalAlignment(SwingConstants.CENTER);
		       add(enterAmountLabel);
		       
		       enterAmountField = new JTextField();
		       enterAmountField.setBounds(15, 80, getWidth() - 50, 40);
		       enterAmountField.setFont(new Font("Dialog", Font.BOLD, 20));
		       enterAmountField.setHorizontalAlignment(SwingConstants.CENTER);
		       add(enterAmountField);
	   }
	   
	   
	    
	   public void addActionButton(String actionButtonType)
	   {
	
		  actionButton = new JButton(actionButtonType);
		  actionButton.setBounds(15, 300, getWidth() - 50, 40);
		  actionButton.setFont(new Font("Dialog", Font.BOLD, 20));
		  actionButton.addActionListener(this);
	       add(actionButton);
		  
				   
	   }

	   
	   public void addUserField()
	   {
		   enterUserLabel   = new JLabel("Enter User:");
		   enterUserLabel.setBounds(15, 160, getWidth() - 20, 20);
		   enterUserLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		   enterUserLabel.setHorizontalAlignment(SwingConstants.CENTER);
	       add(enterUserLabel);
	       
	       enterUserField = new JTextField();
	       enterUserField.setBounds(15, 190, getWidth() - 50, 40);
	       enterUserField.setFont(new Font("Dialog", Font.BOLD, 20));
	       enterUserField.setHorizontalAlignment(SwingConstants.CENTER);

	       add(enterUserField);
	       
;		   
	   }
	   
	   public static void main(String[] args) {
		
		   
		      
	}

	   
	   
	   private void handleTransaction(String transactionType, float amountVal)
	   {
		   
		     Transaction transaction;
		     
		     if(transactionType.equalsIgnoreCase("Deposit"))
		     {
		    	 user.setCurrentBalance(user.getCurrentBalance().add(new BigDecimal(amountVal)));
		    	 
		    	 
		    	 transaction = new Transaction(user.getId(), transactionType, new BigDecimal(amountVal), null);
		     } else {
		    	 
		    	 user.setCurrentBalance(user.getCurrentBalance().subtract(new BigDecimal(amountVal)));
		     
		        transaction = new Transaction(user.getId(), transactionType, new BigDecimal(-amountVal), null);
		     }
		     
		     if(MyJDBC.addTransactionToDatabase(transaction) && MyJDBC.updateCurrentBalance(user) )
		     {
		    	   
		    	 JOptionPane.showMessageDialog(this, transactionType + " Successfully!" );
		    	  resetFieldAndUpdateCurrentBalance();	     
		     }else {
		    	 
		    	 
		    	 
		    	 JOptionPane.showMessageDialog(this, transactionType + " Failed...");
		     }
	   }

	   
	    private void resetFieldAndUpdateCurrentBalance()
	    {
	    	  enterAmountField.setText("");
	    	  
	    	  if(enterUserField != null)
	    	  {
	    		  enterUserField.setText("");
	    	  }
	    	  
	    	  balanceLabel.setText("Balance: ₹" + user.getCurrentBalance());
	    	  bankingAppGui.getCurrentBalance().setText("₹" + user.getCurrentBalance());
	    }
	    
	      private void handleTransfer(USer user, String transferredUser, float amount)
	      {
	    	  
	      }
	    
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		String buttonPresed = e.getActionCommand();
		float amountVal = Float.parseFloat(enterAmountField.getText());
		
		if(buttonPresed.equalsIgnoreCase("Deposit"))
		{
			handleTransaction(buttonPresed, amountVal);
		}
		
		else {
			
			
			int result = user.getCurrentBalance().compareTo(BigDecimal.valueOf(amountVal));
			if(result<0)
			{
				JOptionPane.showMessageDialog(this, "Error: Input value is more than current Balance");
				return;
			}
			
			if(buttonPresed.equalsIgnoreCase("Withdrawl")) {
				
				handleTransaction(buttonPresed, amountVal);
			} else {
				
				
				String transferredUser  =  enterUserField.getText();
				
			}
		}
	}
}
