package com.userfront.service;

import java.util.List;

import com.userfront.domain.PrimaryTransaction;
import com.userfront.domain.SavingsTransaction;

public interface TransactionService {

	public List<PrimaryTransaction> findPrimaryTransactionList(String username);
	public List<SavingsTransaction> findSavingsTransactionList(String username);
	public void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction);
	public void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction);
	public void savePrimaryWithdrawTransaction(PrimaryTransaction primaryTransaction);
	public void saveSavingsWithdrawTransaction(SavingsTransaction savingsTransaction);

}
