package com.training.ui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.training.model.Product;

public class Main01 {
	
	private static void insert() {

		Product product = new Product();
		product.setId(104);
		product.setName("Oppo");
		product.setPrice(35000.00);

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");

		String INSERT_QRY = "insert into products values(?,?,?)";
		int r = template.update(INSERT_QRY, product.getId(), product.getName(), product.getPrice());
		System.out.println(r + " records inserted");

	}

	private static void search() {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");

		String SEARCH_QRY = "select * from Products where id=?";
		List<Product> products = template.query(SEARCH_QRY, new ProductMapper(), new Object[] { 101 });
		System.out.println(products);
	}

	private static void readAll() {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");

		String FINDALL_QRY = "select * from Products";
		List<Product> products = template.query(FINDALL_QRY, new ProductMapper());
		System.out.println(products);
	}

	private static void update() {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");

		String UPDATE_QRY = "update products set Price=price+price*0.05 where id=?";
		int r = template.update(UPDATE_QRY, new Object[] { 101 });
		System.out.println(r + " records updated");

	}
	
	private static void delete() {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");

		String DELETE_QRY = "delete from products where id=?";
		int r = template.update(DELETE_QRY, new Object[] { 101 });
		System.out.println(r + " records deleted");

	}


	

	public static class ProductMapper implements RowMapper<Product> {

		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			Product product = new Product();
			product.setId(rs.getInt(1));
			product.setName(rs.getString(2));
			product.setPrice(rs.getDouble(3));
			return product;
		}
	}

	public static void main(String[] args) {
		// insert();
		// search();
		readAll();
		//update();
		delete();
		readAll();

	}

}
