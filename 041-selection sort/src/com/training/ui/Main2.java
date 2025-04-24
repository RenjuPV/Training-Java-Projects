package com.training.ui;

import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {

		double[] prices = { 12.5, 19.0, 55.5, 2.6, 16.1 };
		int n = prices.length;
		int iMin;

		for (int i = 0; i < n - 1; i++) {

			iMin = i;

			for (int j = i + 1; j < n; j++) {

				if (prices[j] < prices[iMin])
					iMin = j;
			}

			double temp;
			temp = prices[i];
			prices[i] = prices[iMin];
			prices[iMin] = temp;

		}

		System.out.println(Arrays.toString(prices));

	}

}
