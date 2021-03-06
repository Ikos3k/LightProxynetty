package pl.venixpll.utils;

public class ReportedException extends RuntimeException
{
    /** Instance of CrashReport. */
    private final Exception theReportedExceptionCrashReport;
    private static final String __OBFID = "CL_00001579";

    public ReportedException(Exception p_i1356_1_)
    {
        this.theReportedExceptionCrashReport = p_i1356_1_;
    }

    /**
     * Gets the CrashReport wrapped by this exception.
     */
   /*public CrashReport getCrashReport()
    {
        return this.theReportedExceptionCrashReport;
    }*/

    public Throwable getCause()
    {
        return this.theReportedExceptionCrashReport.getCause();
    }

    public String getMessage()
    {
        return this.theReportedExceptionCrashReport.getMessage();
    }
}
