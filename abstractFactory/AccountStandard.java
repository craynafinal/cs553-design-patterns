/**
 * Class abstracting a standard account.
 */
public class AccountStandard extends AccountIF {
    /**
     *  Construct a standard account.
     *  @param loginId  The login id of this account.
     *    The login Id is used to retrieve from a database
     *    persistent data, such as the number of connection hours
     *    already used during the current month.
     */
    public AccountStandard (int loginId) {
		  this.loginId = loginId;
		  // Get hoursConnectThisMonth and all other account paramteres
		  // from the database.  Argument loginId is the record's key.
    }
    public String toString () {
		  return "AccountStandard (" + loginId + ")";
    }
}

