package com.training.dp;

import com.training.model.china.ChineaseAccountFactory;
import com.training.model.india.IndianAccountFactory;
import com.training.model.uk.UKAccountFactory;
import com.training.model.usa.USAccountFactory;

public class ConcreateCountyAccountCreator implements CountryAccountCreator {

	@Override
	public AccountCreator create(String country) {
		AccountCreator accountCreator = null;
		if (country.equalsIgnoreCase("India"))
			accountCreator = new IndianAccountFactory();
		if (country.equalsIgnoreCase("USA"))
			accountCreator = new USAccountFactory();
		if (country.equalsIgnoreCase("UK"))
			accountCreator = new UKAccountFactory();
		if (country.equalsIgnoreCase("China"))
			accountCreator = new ChineaseAccountFactory();
		return accountCreator;
	}

}
