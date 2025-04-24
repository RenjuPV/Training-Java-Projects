package com.training.model.usa;

import com.training.dp.Account;
import com.training.dp.AccountCreator;

public class USAccountFactory implements AccountCreator {

	@Override
	public Account createAccount(int countyType) {
		Account account = null;
		if (countyType == 1)
			account = new SavingsAccount();
		if (countyType == 2)
			account = new CurrentAccount();
		if (countyType == 3)
			account = new FixedDepositAccount();
		return account;
	}

}
