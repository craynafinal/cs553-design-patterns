package pattpack.account;

public class Test {

	public static void main (String[] args) {

		if (args.length != 1) {
			System.err.println("This program requries an argument.");
			System.exit(1);
		}

		int loginId = 0;

		try {
			loginId = Integer.parseInt(args [0]);
		} catch (NumberFormatException e) {
			System.err.println("Please provide an integer value.");
			System.exit(1);
		}

		AccountAbstractFactoryIF factory = null;

		if (loginId == 0) {
			factory = new AccountFactoryEconomy();
		} else if (loginId == 1) {
			factory = new AccountFactoryStandard();
		} else {
			factory = new AccountFactoryProfessional();
		}

		System.out.println(getUser(factory, loginId));
	}

	public static User getUser(AccountAbstractFactoryIF factory, int loginId) {
		return new User(factory.getAccount(loginId), factory.getSecurityManager());
	}
}
