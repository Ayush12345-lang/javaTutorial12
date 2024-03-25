package db_obs;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class USer {

	
	  private final int id;
	  private final String username, password;
	  private BigDecimal currentBalance;
	  
	  public USer(int id, String username, String password , BigDecimal currentBalance)
	  {
		  
		  this.id = id;
		  this.username  = username;
		  this.password = password;
		  this.currentBalance = currentBalance;
	  }

	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}

	

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	  
	  public void setCurrentBalance(BigDecimal newBalance)
	  {
		  
		  currentBalance = newBalance.setScale(2, RoundingMode.FLOOR);
	  }
}
