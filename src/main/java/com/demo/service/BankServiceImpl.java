package com.demo.service;

import java.sql.SQLException;
import java.util.List;

import com.demo.model.Account;
import com.demo.repository.AccountRepository;
import com.demo.repository.RewardRepository;
import com.demo.repository.TransactionRepository;


public class BankServiceImpl implements BankService {
	
	private AccountRepository accountRepository;
	private TransactionRepository transactionRepository;
	private RewardRepository rewardRepository;	
	private EmailService emailService;
	




	public Long transfer(Long fromAccountNumber, Long toAccountNumber, int amount) throws SQLException {
		
		
		
		return null;  //return transactionId
	}

	public Long debit(int amount, Long accountNumber) throws SQLException {
		
		
		return null; //return transactionId

	}

	public Long credit(int amount, Long accountNumber) throws SQLException {


		
		return null; //transactionid

		
	}

	public void createNewAccount(Account account) throws SQLException {
		accountRepository.save(account);
		
	}

	public void deActivateAccount(Long accountNumber) throws SQLException {
		Account account=accountRepository.findAccountByNumber(accountNumber);		
		account.setActive(false);		
		accountRepository.update(account);
		
	}

	public void activateAccount(Long accountNumber) throws SQLException {
		Account account=accountRepository.findAccountByNumber(accountNumber);		
		account.setActive(true);		
		accountRepository.update(account);
		
	}

	public List<Account> getAllAccounts() throws SQLException {
		System.out.println("BankServiceImpl.getAllAccounts()");
		return accountRepository.findAllAccounts();
	}


	public AccountRepository getAccountRepository() {
		return accountRepository;
	}


	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}


	public TransactionRepository getTransactionRepository() {
		return transactionRepository;
	}


	public void setTransactionRepository(TransactionRepository transactionRepository) {
		this.transactionRepository = transactionRepository;
	}


	public RewardRepository getRewardRepository() {
		return rewardRepository;
	}


	public void setRewardRepository(RewardRepository rewardRepository) {
		this.rewardRepository = rewardRepository;
	}


	public EmailService getEmailService() {
		return emailService;
	}


	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}
	
	

}
