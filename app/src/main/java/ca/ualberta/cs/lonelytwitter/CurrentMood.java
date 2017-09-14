package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by abdurahm on 9/13/17.
 */

public abstract class CurrentMood {

    private String message;
    private Date date;

    public CurrentMood(String message){
        date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(){
        this.message = message;
    }
}