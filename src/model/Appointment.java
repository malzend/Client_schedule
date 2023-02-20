package model;

import java.sql.Time;
import java.util.Date;

public class Appointment{

    private int appointmentID = 150;
    private String title ;
    private String descriptionID;
    private String location;
    private String contact;
    private String type;
    private Date startDate;
    private Date endDate ;
    private Time startTime;
    private Time endTime;

    Appointment( int appointmentID, String title, String descriptionID,String location,
            String contact, String type, Date startDate, Date endDate,
            Time startTime, Time endTime){


        this.appointmentID = appointmentID;
        this.title = title;
        this.descriptionID = descriptionID;
        this.location = location;
        this.contact = contact;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate ;
        this.startTime = startTime;
        this.endTime = endTime;

    }


    public int getAppointmentID(){
        return appointmentID;
    }

    public String getType(){
        return type;

    }
    public String getDescription(){
        return descriptionID;
    }

    public String getTitle(){
        return title;
    }
    public String getLocation(){
        return location;
    }
    public String getContact(){
        return contact;
    }
    public Time getStartTime(){
            return startTime;
    }
    public Time getEndTiem(){
        return endTime;
    }
    public Date getStarDate(){
        return startDate;
    }
    public Date getEndDate(){
        return endDate;
    }


    public void setAppointmentID(int appointmentID){
       this.appointmentID = appointmentID;
    }

    public void setType(String type){
        this.type = type;

    }
    public void setDescription(String descriptionID ){
        this.descriptionID = descriptionID;
    }

    public void getTitle(String title){
        this.title = title ;
    }
    public void getLocation(String location){
       this.location = location;
    }
    public void setContact(String contact){
        this.contact = contact;
    }
    public void setStartTime( Time startTime){
        this.startTime = startTime;
    }
    public void setEndTiem(Time endTime){
        this.endTime = endTime ;
    }
    public void setStarDate(Date startDate ){
        this.startDate = startDate ;
    }
    public void setEndDate(Date endDate){
        this.endDate = endDate;
    }
}
