package dao;

import persistence.jointable.Account;

//import persistence.fkassociation.Account;

public interface AccountDao {
	void save(Account account);
}
