public class PrototypeFactory {
	private AccountIF account = null;
	private SecurityManagerIF securityManager = null;

	// this constructor will take actual objects
	// copied objects will be cloned in the create methods defined below
	public PrototypeFactory(AccountIF account, SecurityManagerIF securityManager) {
		this.account = account;
		this.securityManager = securityManager;
	}

	// methods below clones the member variables to distribute
	public AccountIF createAccount(int loginId) {
		AccountIF accountClone = (AccountIF)account.clone();
		accountClone.setLoginId(loginId);
		return account;
	}

	public SecurityManagerIF createSecurityManager() {
		return (SecurityManagerIF)securityManager.clone();
	}
}
