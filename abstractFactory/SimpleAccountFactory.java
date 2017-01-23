public class SimpleAccountFactory {
	// this is factory for only one job, creating account

	public static AccountAbstractFactoryIF createAccount(int loginId) {
		AccountAbstractFactoryIF factory = null;
		if (1000 < loginId && loginId <= 5000)
	    factory = new AccountFactoryEconomy ();
		else if (5000 < loginId && loginId <= 8000)
	    factory = new AccountFactoryStandard ();
		else if (8000 < loginId && loginId <= 9999)
	    factory = new AccountFactoryProfessional ();

		return factory;
	}
}
