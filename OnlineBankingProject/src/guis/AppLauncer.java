package guis;

import javax.swing.SwingUtilities;

import db_obs.USer;

import java.math.BigDecimal;

//import guis.RegisterGui;
import javax.swing.*;
public class AppLauncer {

	
	 public static void main(String[] args) {
		
		           SwingUtilities.invokeLater(new Runnable()
		        		   {
		        	          @Override
		        	            public void run()
		        	            {
		        	        	     new Logingui().setVisible(true);
//		        	        	  new RegisterGui().setVisible(true);
//		        	        	  new BankAppGui(
//		        	        			  
//		        	        			  new USer(1, "username", "password", new BigDecimal("20.00"))
//		        	        			
//
//		        	        			  ).setVisible(true);
  		        	            }
		        		   });
		 
	}
}
