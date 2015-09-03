package com.brooklynmarathon.pathfinder.login;

import java.util.Date;

/**
 * Created by user on 9/1/15.
 */
public class ChatMessage {
    private String name;
    private String message;
    private String datelocal;
    private long        millisgmt;
    //private String name;
    private String organization;

    public String getDatelocal() {
        return datelocal;
    }

    public long getMillisgmt() {
        return millisgmt;
    }

    public String getOrganization() {
        return organization;
    }

    public String getOrganizationname() {
        return organizationname;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    private String organizationname;

    public String getTimezone() {
        return timezone;
    }

    private String timezone;
    private String url;
    private String username;

    public ChatMessage() {
        // necessary for Firebase's deserializer
    }
    public ChatMessage(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }
    public String getTime() {
        return new Date(millisgmt).toString() + '\n' ;
    }

    public String getMessage() {
        //return message;
        return  datelocal+ '\n' + timezone +'\n' + url + '\n' + username;
    }
}
