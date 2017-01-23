public class AccountFactoryProfessional implements AccountAbstractFactoryIF {

	// provide economy objects

	public AccountIF getAccount (int loginId) {
		return new AccountProfessional (loginId);
	}

	public SecurityManagerIF getSecurityManager () {
		return new SecurityManagerProfessional ();
	}
}
