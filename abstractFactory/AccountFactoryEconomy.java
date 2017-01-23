package pattpack.account;

public class AccountFactoryEconomy implements AccountAbstractFactoryIF {

	// provide economy objects

	public AccountIF getAccount (int loginId) {
		return new AccountEconomy (loginId);
	}

	public SecurityManagerIF getSecurityManager () {
		return new SecurityManagerEconomy ();
	}
}
