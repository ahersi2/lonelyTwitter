package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by abdurahm on 9/13/17.
 */

public class jubilant extends CurrentMood {
    private Date date;
    private String jubilant_message;


    public jubilant(String jubilant_message){
        super(jubilant_message);
        date = new Date();

    }

    public String getJubilant_message() {

            return jubilant_message;

    }

    @Override
    public Date getDate() {
        return date;
    }



    public void setJubilant_message(String jubilant_message) {
        this.jubilant_message = jubilant_message;
    }
}
