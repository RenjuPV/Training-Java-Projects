package ui;

import db.AccountDAO;
import db.CustomerDAO;
import db.DBConnectionManager;
import model.Account;
import model.CurrentAccount;
import model.Customer;
import model.SavingsAccount;
import model.deposits.FixedDeposits;
import model.deposits.RecurringDeposit;

public class Main {

	public static void main(String[] args) {
		MainScreen ms = new MainScreen();
		CusomerRegistrationScreen crs = new CusomerRegistrationScreen();
		Account account = new Account();
		Customer customer = new Customer();
		SavingsAccount savingsAccount = new SavingsAccount();
		CurrentAccount ca = new CurrentAccount();
		
		FixedDeposits fd=new FixedDeposits();
		RecurringDeposit rd=new RecurringDeposit();
		
		AccountDAO accountDAO=new AccountDAO();
		DBConnectionManager  dbc=new DBConnectionManager();
		CustomerDAO customerDAO=new CustomerDAO();
	}
}
