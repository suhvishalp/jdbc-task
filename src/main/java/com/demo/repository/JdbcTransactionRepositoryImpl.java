package com.demo.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.demo.model.TransactionDetail;
import com.demo.model.TransactionType;



public class JdbcTransactionRepositoryImpl implements TransactionRepository {
	
	private DataSource dataSource;	

	public JdbcTransactionRepositoryImpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	public Long addTransaction(TransactionDetail transactionDetail) throws SQLException {
		
		return null;
	}

	public List<TransactionDetail> getAllTransactionDetailsByAccountNumber(Long accountNumber) throws SQLException {
		
		return null;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	

}
