package com.demo.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.demo.model.Account;
import com.demo.model.Address;



public class JdbcAccountRepositoryImpl implements AccountRepository {
	
	private DataSource dataSource;
	
	

	public JdbcAccountRepositoryImpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}
	


	public Account findAccountByNumber(Long accountNUmber) throws SQLException {


		return null;
	}

	public List<Account> findAllAccounts() throws SQLException {
		
		return null;
	}

	public void save(Account account) throws SQLException {


			
	}

	public void update(Account account) throws SQLException {
		
	}

	public void delete(Account account) throws SQLException {
		
	
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	

}
