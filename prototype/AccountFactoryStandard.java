public class AccountFactoryStandard implements AccountAbstractFactoryIF {

	// provide economy objects

	public AccountIF getAccount (int loginId) {
		return new AccountStandard (loginId);
	}

	public SecurityManagerIF getSecurityManager () {
		return new SecurityManagerStandard ();
	}
}
