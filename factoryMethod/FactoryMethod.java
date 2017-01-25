public abstract class FactoryMethod {
	// abstract methods that will be implemented by subclasses
	public abstract AccountIF createAccount(int loginId);
	public abstract SecurityManagerIF createSecurityManager();
	
	// concrete method that will be used commonly
	final public User createUser (int loginId) {
		return new User (createAccount(loginId), createSecurityManager());
	}
}
