package model;

public class FirstLevelDivision {

    private int divisionID = 200;
    private String divisionName;


    FirstLevelDivision(int divisionID, String divisionName){
        this.divisionID = divisionID;
        this.divisionName = divisionName;
    }

    public int getDivisionID() {
        return divisionID;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionID(int divisionID) {
        this.divisionID = divisionID;
    }
    public void setDivisionName(String divisionName){
        this.divisionName = divisionName;
    }
}
