package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by abdurahm on 9/13/17.
 */

public class excited extends CurrentMood {
    private Date date;
    private String excited_message;


    public excited(String excited_message){
        super(excited_message);
        date = new Date();
    }

    @Override
    public Date getDate() {
        return date;
    }


    public String getExcited_message() {
        return excited_message;
    }

    public void setExcited_message(String excited_message) {
        this.excited_message = excited_message;
    }
}
