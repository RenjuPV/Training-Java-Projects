package pack3;

import pack2.BusinessLoan;
import pack2.CarLoan;
import pack2.EducationalLoan;
import pack2.HomeLoan;
import pack2.Loan;
import pack2.PersonalLoan;
import pack2.RetailBusenessLoan;
import pack2.WholeSaleBusinessLoan;

public class Main2 {
	
	public static void main(String[] args) {
		
		Loan loan;
		
		//loan=new Loan(100000, 12, "Renju");
		//System.out.println(loan.getInterestRate());
		
		loan=new CarLoan(100000, 12, "Anju", "CL 001");
		System.out.println(loan.getInterestRate());
		
		loan=new HomeLoan(100000, 12, "Anila", "Kochi");
		System.out.println(loan.getInterestRate());
		
		loan=new PersonalLoan(100000, 12, "Ram", 20000);
		System.out.println(loan.getInterestRate());
		
		
		loan=new EducationalLoan(200000, 12, "Renjith", 4);
		System.out.println(loan.getInterestRate());
		
		BusinessLoan loan1;
		
		loan1=new RetailBusenessLoan(20000, 12, "Suma", "UST");
		System.out.println(loan1.getInterestRate());
		
		loan1=new WholeSaleBusinessLoan(300000, 12, "Manju", "IBS");
		System.out.println(loan1.getInterestRate());
		System.out.println(loan1);
		
	}

}
