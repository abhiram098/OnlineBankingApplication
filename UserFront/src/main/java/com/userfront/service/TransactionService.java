package com.userfront.service;

import java.security.Principal;
import java.util.List;

import com.userfront.domain.PrimaryAccount;
import com.userfront.domain.PrimaryTransaction;
import com.userfront.domain.Recipient;
import com.userfront.domain.SavingsAccount;
import com.userfront.domain.SavingsTransaction;

public interface TransactionService {

	public List<PrimaryTransaction> findPrimaryTransactionList(String username);
	public List<SavingsTransaction> findSavingsTransactionList(String username);
	public void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction);
	public void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction);
	public void savePrimaryWithdrawTransaction(PrimaryTransaction primaryTransaction);
	public void saveSavingsWithdrawTransaction(SavingsTransaction savingsTransaction);
	public void betweenAccountsTransfer(String transferFrom, String transferTo, String amount,
			PrimaryAccount primaryAccount, SavingsAccount savingsAccount) throws Exception;
	public void saveRecipient(Recipient recipient);
	public Recipient findRecipientByName(String recipientName);
	public List<Recipient> findRecipientList(Principal principal);
	public void deleteRecipientByName(String recipientName);
	public void toSomeoneElseTransfer(Recipient recipient, String accountType, String amount,
			PrimaryAccount primaryAccount, SavingsAccount savingsAccount);

}
