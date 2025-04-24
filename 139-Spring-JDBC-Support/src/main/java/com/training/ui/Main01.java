package com.training.ui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.training.model.Loan;

public class Main01 {

	private static void insert() {

		Loan loan = new Loan();
		loan.setId(104);
		loan.setCustomerName("Ridhima");
		loan.setLoanAmount(500000.00);
		loan.setTenure(5);

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");

		String INSERT_QRY = "insert into Loans values(?,?,?,?)";
		int r = template.update(INSERT_QRY, loan.getId(), loan.getCustomerName(), loan.getLoanAmount(),loan.getTenure());
		System.out.println(r + " records inserted");

	}

	private static void search() {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");

		String SEARCH_QRY = "select * from Loans where id=?";
		List<Loan> Loans = template.query(SEARCH_QRY, new LoanMapper(), new Object[] { 101 });
		System.out.println(Loans);
	}

	private static void readAll() {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");

		String FINDALL_QRY = "select * from Loans";
		List<Loan> loans = template.query(FINDALL_QRY, new LoanMapper());
		System.out.println(loans);
	}

	private static void update() {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");

		String UPDATE_QRY = "update loans set loanAmount=loanAmount+loanAmount*0.05 where id=?";
		int r = template.update(UPDATE_QRY, new Object[] { 101 });
		System.out.println(r + " records updated");

	}
	
	private static void delete() {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");

		String DELETE_QRY = "delete from loans where id=?";
		int r = template.update(DELETE_QRY, new Object[] { 101 });
		System.out.println(r + " records deleted");

	}


	

	public static class LoanMapper implements RowMapper<Loan> {

		public Loan mapRow(ResultSet rs, int rowNum) throws SQLException {
			Loan loan = new Loan();
			loan.setId(rs.getInt(1));
			loan.setCustomerName(rs.getString(2));
			loan.setLoanAmount(rs.getDouble(3));
			loan.setTenure(rs.getInt(4));
			return loan;
		}
	}

	public static void main(String[] args) {
		//insert();
		//search();
		//readAll();
		//update();
		//readAll();
		//delete();
		readAll();

	}

}
