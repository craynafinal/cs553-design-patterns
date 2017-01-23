package pattpack.account;

public interface AccountAbstractFactoryIF {

	// this factory will provide account and security manager objects
	AccountIF getAccount(int loginId);
	SecurityManagerIF getSecurityManager();
}
