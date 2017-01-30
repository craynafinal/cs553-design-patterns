/**
 *  Security manager of a standard account.
 */
public class SecurityManagerStandard extends SecurityManagerIF {
    /** Maximum connection hours per months. */
    private static final int connectionHoursLimit = 60;
    /** Maximum connection speed. */
    private static final int connectionSpeedLimit = 56;
    /**
     *  Return the maximum connection hours per months.
     *  @return the maximum connection hours per months.
     */
    public int getConnectionHours () { return connectionHoursLimit; }
    /**
     *  Return the maximum connection speed.
     *  @return the maximum connection speed.
     */
    public int getConnectionSpeed () { return connectionSpeedLimit; }
    /**
     *  String representation of a standard security manager.
     *  @return the representation of a standard security manager.
     */
    public String toString () { return "SecurityManagerStandard"; }
}






