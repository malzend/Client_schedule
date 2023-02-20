package model;

public class Report {

    private int reportID = 20;
    private String reportType;

    Report(int reportID, String reportType){
        this.reportID = reportID;
        this.reportType = reportType;
    }

    public int getReportID(){
        return reportID;
    }
    public String getReportType(){
        return reportType;
    }
    public void setReportID(int reportID){
        this.reportID = reportID;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }
}
