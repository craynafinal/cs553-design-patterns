public class FactoryMethodEconomy extends FactoryMethod {
	public AccountIF createAccount (int loginId) {
		return new AccountEconomy (loginId);
	}

	public SecurityManagerIF createSecurityManager () {
		return new SecurityManagerEconomy();
	}
}
