package com.demo.repository;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.demo.model.Reward;



public class JdbcRewardRepositoryImpl implements RewardRepository {
	
	private DataSource dataSource;
	
	

	public JdbcRewardRepositoryImpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	public void addReward(Reward reward) throws SQLException {
		
	}

	public int getTotalRewardAmount(Long accountNumber) {
	
		return 0;
	}

	public List<Reward> getAllRewardsForAccount(Long accountNUmber) {
		
		return null;
	}

}
